package com.spring.aopex3;

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

	@Override
	public void insertBoardDO(BoardDo bdo) {
		// TODO Auto-generated method stub
		System.out.println("[�ٽɰ��ɿ��� �ڵ�] insertBoardDO(BoardDo bdo) ����");
	}

	@Override
	public void insertBoardExcept() {
		//���� �߻�
		// TODO Auto-generated method stub
		System.out.println("[�ٽɰ��ɿ��� �ڵ�] insertBoardExcept() ����");
		if(seq==0) {
			throw new IllegalArgumentException("seq�� 0�� ���� �߻�!!");
		}
	}

	@Override
	public BoardDo insertBoardReturn(BoardDo bdo) {
		System.out.println("[�ٽɰ��ɿ��� �ڵ�] insertBoardReturn(BoardDo bdo) ����");
		 
		
		return bdo;
	}


	
	
}
