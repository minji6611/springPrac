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
//			throw new IllegalArgumentException("seq�� 0�� ���� �߻�!!");
//		}
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
