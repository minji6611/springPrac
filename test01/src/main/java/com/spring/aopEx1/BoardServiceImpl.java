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
		System.out.println("[�ٽɰ��ɿ��� �ڵ�] insertBoard() ����");
	}

	@Override
	public void updateBoard() {
		// TODO Auto-generated method stub
//		log.printLog();
		//log.printLogmodify();		
		System.out.println("[�ٽɰ��ɿ��� �ڵ�] updateBoard() ����");
	}
	
	
}
