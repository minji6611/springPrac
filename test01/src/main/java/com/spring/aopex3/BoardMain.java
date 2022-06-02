package com.spring.aopex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new GenericXmlApplicationContext("aopAnoAdviceSettings.xml");
		BoardService bService  = (BoardService)context.getBean("boardService");
		
		BoardDo bdo = new BoardDo();
		bdo.setSeq(1);
		bdo.setTitle("Title");
		bdo.setWriter("writer");
		bdo.setContent("content");
		
		
		
		bService.insertBoardDO(bdo);
		
		bService.updateBoard();
		
		//bService.insertBoardExcept();
		
		
		bService.insertBoardReturn(bdo);
		
	
		
		
	}

}

