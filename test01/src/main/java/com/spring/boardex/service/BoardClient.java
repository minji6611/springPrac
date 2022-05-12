package com.spring.boardex.service;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.boardex.common.JdbcUtil;
import com.spring.boardex.impl.BoardDo;

public class BoardClient {

	public static void main(String[] args) {
//		JdbcUtil jutil = new JdbcUtil();
//		jutil.getConnection();	 
		
		ApplicationContext context = 
				new GenericXmlApplicationContext("BoardSetting.xml");
		
		BoardService bService = (BoardService)context.getBean("boardService");
		
		//글 목록 저장하기
//		BoardDo bdo = new BoardDo();
//		bdo.setTitle("title");
//		bdo.setWriter("writer");
//		bdo.setContent("content");
//		bService.insertBoard(bdo);
		
		//2. 글 목록 보기
		ArrayList<BoardDo> aList = bService.getBoardList();
		for(BoardDo temp: aList){
			System.out.println("-->"+temp.toString());
		}
		
//		//3. 글 수정
//		BoardDo bdo = new BoardDo();
//		bdo.setSeq(6);
//		bdo.setTitle("미연 솔로 나옴~");
//		bdo.setContent("훌쩍 떠나보는 Drive~");
//		bService.updateBoard(bdo);
//		
//		ArrayList<BoardDo> aList2 = bService.getBoardList();
//		for(BoardDo temp: aList2){
//			System.out.println("(수정) -->"+temp.toString());
//		}
		
		//4. 글 삭제
		BoardDo bdo = new BoardDo();
		bdo.setSeq(9);
		bService.deleteBoard(bdo);
		
		ArrayList<BoardDo> aList3 = bService.getBoardList();
		for(BoardDo temp: aList3){
			System.out.println("(삭제) -->"+temp.toString());
		}
	}

}
