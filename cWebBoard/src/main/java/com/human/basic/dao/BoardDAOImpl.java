package com.human.basic.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.human.basic.domain.BoardVO;

@Repository("boardDAO") //DB랑 연결하는 객체라서 Repository 라고 작성 
public class BoardDAOImpl implements BoardDAO {
	
	
	@Autowired
	private SqlSessionTemplate mybatis; //sqlSessionTemplate은 rootcontext에 빈으로 만들어둠 
	
	@Override
	public String timeTest() {
		System.out.println("테스트중");
		return mybatis.selectOne("testMapper.getTime"); //testmapper를 찾아서 gettime이라는 id를 가진 쿼리문을 실행 String의 형태로
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
	public void incReadCount(BoardVO vo) {
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
