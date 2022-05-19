package com.spring.aopex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	int seq=0;
	@Override
	public void insertBoard() {
		// TODO Auto-generated method stub
//		log.printLog();
		//log.printLogmodify();
		
//		if(seq==0) {
//			throw new IllegalArgumentException("seq가 0인 에러 발생!!");
//		}
		System.out.println("[핵심관심영역 코드] insertBoard() 실행");
	}

	@Override
	public void updateBoard() {
		// TODO Auto-generated method stub
//		log.printLog();
		//log.printLogmodify();		
		System.out.println("[핵심관심영역 코드] updateBoard() 실행");
	}
	
	
}
