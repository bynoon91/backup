package com.human.basic.service;

import java.util.List;

import com.human.basic.domain.MemberVO;

public interface MemberService {
	public MemberVO idCheck_Login( MemberVO vo);
	public int userInsert(MemberVO vo );
	 List<MemberVO> memberInfo();

}
