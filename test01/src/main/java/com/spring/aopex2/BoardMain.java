package com.spring.aopex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new GenericXmlApplicationContext("aopAdviceSettings2.xml");
		BoardService bService  = (BoardService)context.getBean("boardService");
		
		BoardDo bdo = new BoardDo();
		bdo.setSeq(1);
		bdo.setTitle("Title");
		bdo.setWriter("writer");
		bdo.setContent("content");
		bService.insertBoardReturn(bdo);
		
		
//		bService.insertBoardDO(bdo);
//		bService.insertBoardExcept();
	
		bService.updateBoard();
		
	}

}


