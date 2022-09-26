package com.human.basic.dao;

import java.util.HashMap;
import java.util.List;

import com.human.basic.domain.BoardVO;

public interface BoardDAO {

	// 테스트용
	String timeTest();
	
	// CRUD 기능 구현
	// 글 등록
	void insertBoard(BoardVO vo);
		
	// 글 수정
	void updateBoard(BoardVO vo);
	
	// 글 삭제
	void deleteBoard(BoardVO vo);
	
	// 글 조회수 증가
	void incReadCount(BoardVO vo);
	
	// 글 상세 조회
	BoardVO getBoard(BoardVO vo);
	
	// 글 목록 조회
	List<BoardVO> getBoardList(HashMap map);
}
