package com.human.basic.domain;

import lombok.Data;

//getter setter 만들어주는 어노테이션 (lombok/ 다른 파일에서 getter setter 소환하면 여기 없어도 생김)
@Data
public class MemberVO {
	private String userId;
	private String userPass;
	private String userName;
	


}
