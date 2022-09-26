package com.human.basic.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.human.basic.dao.BoardDAO;
import com.human.basic.domain.BoardVO;

@Service("boardService") //빈에 등록할수 있도록 서비스를 연결함 (어노테이션) >> 서블릿컨텍스트가 스캔해감 
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public String timeTest() {
		System.out.println("접근완료");
		return boardDAO.timeTest();
	}

	@Override
	public void insertBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardVO> getBoardList(HashMap map) {
		// TODO Auto-generated method stub
		return null;
	}

}
