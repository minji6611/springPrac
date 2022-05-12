package com.spring.aopEx1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	@Autowired
	private LogAdvice log;

	@Override
	public void insertBoard() {
		// TODO Auto-generated method stub
//		log.printLog();
		//log.printLogmodify();
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
