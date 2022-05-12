package com.spring.boardex.service;

import java.util.ArrayList;

import com.spring.boardex.impl.BoardDo;

public interface BoardService {	
	//�� ���
	void insertBoard(BoardDo bdo);
	//��  ����
	void updateBoard(BoardDo bdo);
	//��  ����
	void deleteBoard(BoardDo bdo);
	//�� ���
	ArrayList<BoardDo> getBoardList();

}
