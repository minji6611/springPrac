package com.spring.aopex3;

public interface BoardService {
	void insertBoard();
	void updateBoard();
	void insertBoardDO(BoardDo bdo);
	void insertBoardExcept();
	BoardDo insertBoardReturn(BoardDo bdo);
}
