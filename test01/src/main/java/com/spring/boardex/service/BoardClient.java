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
		
		//�� ��� �����ϱ�
//		BoardDo bdo = new BoardDo();
//		bdo.setTitle("title");
//		bdo.setWriter("writer");
//		bdo.setContent("content");
//		bService.insertBoard(bdo);
		
		//2. �� ��� ����
		ArrayList<BoardDo> aList = bService.getBoardList();
		for(BoardDo temp: aList){
			System.out.println("-->"+temp.toString());
		}
		
//		//3. �� ����
//		BoardDo bdo = new BoardDo();
//		bdo.setSeq(6);
//		bdo.setTitle("�̿� �ַ� ����~");
//		bdo.setContent("��½ �������� Drive~");
//		bService.updateBoard(bdo);
//		
//		ArrayList<BoardDo> aList2 = bService.getBoardList();
//		for(BoardDo temp: aList2){
//			System.out.println("(����) -->"+temp.toString());
//		}
		
		//4. �� ����
		BoardDo bdo = new BoardDo();
		bdo.setSeq(9);
		bService.deleteBoard(bdo);
		
		ArrayList<BoardDo> aList3 = bService.getBoardList();
		for(BoardDo temp: aList3){
			System.out.println("(����) -->"+temp.toString());
		}
	}

}
