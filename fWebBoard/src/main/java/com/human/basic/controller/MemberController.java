package com.human.basic.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.human.basic.domain.MemberVO;
import com.human.basic.service.MemberService;

@Controller
@RequestMapping("/user/") //이 맵핑은  user폴더로 들어가는 맵핑입니다! 라고 선언해주기 (그러면 밑에서 굳이 써줄필요x)
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("test.do") //얘도 이제부터 /user/test.do이기 때문에 실행 안되는게 맞음
	public void test() {
		System.out.println("테스트성공");
	}
	
	@RequestMapping(value="{url}.do") //경로를 써줘야함 /user/추가
	public void memberConn(@PathVariable String url) {
		System.out.println("호출");
		
		//return "/user/"+url;
	}
	
//	@RequestMapping(value="userLogin.do") 
//	public void memberConn() {
//		System.out.println("호출");
//	}
	
	
	@RequestMapping("userInsert.do")
	public ModelAndView userInsert(MemberVO vo) {
		
		// DB 접근
		int result = memberService.userInsert(vo);
		
		String message = "가입되지 않았습니다.";
		
		if(result>0) {
			//result>0 은 DB 저장 성공이라는 뜻
			message = vo.getUserName() +" 님, 가입을 축하드립니다.";
		}
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("user/userJoin_ok");
		mv.addObject("message", message);
		mv.addObject("result",result);
		
		return mv;
		
	}
	
	@RequestMapping("login.do")
	public String login(MemberVO vo, HttpSession session) {
		
		System.out.println("login  컨트롤러");
		System.out.println(vo.getUserId());
		System.out.println(vo.getUserPass());
		
		MemberVO result = memberService.idCheck_Login(vo);
		
	    System.out.println("[ "+ result.getUserId()+" ] 로그인 접속");
	    
	    //로그인한 사람의 정보를 담은 session 
	    session.setAttribute("sessionTime", new Date().toLocaleString());
        session.setAttribute("userName", result.getUserName());
		
		return "/user/login_ok";
	}
	
	@RequestMapping("memberInfo.do")
	public void memberInfo(Model model) {
		System.out.println("====>memberInfo 컨트롤러");
		model.addAttribute("memberInfo", memberService.memberInfo());
	
	}
	
	@RequestMapping(value = "idCheck.do", produces = "application/text; charset=utf8")
	@ResponseBody // 화면이 전환되지않고 비동기동신이 가능하도록 하는 어노테이션
	public String idCheck(MemberVO vo) {
	      
	      MemberVO resultVO = memberService.idCheck_Login(vo);
	      
	      String result = "ID가 사용가능합니다.";
	      if(resultVO != null) result = "중복된 ID입니다.";
	      
	      //@ResponseBody로 인해서 return의 의미가 변경 > 통신에 의한 응답할 값을 전달하는 기능
	      return result;
	   }
	
}
