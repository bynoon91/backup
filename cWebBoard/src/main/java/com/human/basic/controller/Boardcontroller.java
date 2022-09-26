package com.human.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.human.basic.service.BoardService;

@Controller
public class Boardcontroller {
	
	@Autowired //빈에 있는 친구를 데려올수 있다 
	private BoardService boardService; //boardSerbiceimpl 과 연결됨 
	
	
	//@requestMapping(value="주소")
	//메소드명 (0 { .. }
	
	@RequestMapping("test.do")
	public String test() {
		System.out.println("===========================");
		System.out.println("==========테스트 성공==========");
		System.out.println("===========================");
		
		System.out.println(boardService.timeTest());
		
		return "test";
		//얘는 web-inf > spring > app servlet > servlet-context와 이어짐
		//view>test.jsp 만들기
	}
	
}
