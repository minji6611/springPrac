package com.spring.boardex.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.spring.boardex.common.JdbcUtil;

@Repository("boardDao")
public class BoardDao {
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	public void insertBoard(BoardDo bdo) {
		
		conn = JdbcUtil.getConnection();
		//seq, title, writer, content  
		String sql = "insert into board (title, writer, content) "
				+ "values (?,?,?)";
		try {
			//sql 肯己 !!
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bdo.getTitle());
			pstmt.setString(2, bdo.getWriter());
			pstmt.setString(3, bdo.getContent());
			//sql 角青 
			pstmt.executeUpdate();			
			
			System.out.println("insertBoard() 角青 肯丰 !! ");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JdbcUtil.closeConnection(conn, pstmt, rs);
	}
	
	
	public ArrayList<BoardDo> getBoardList() {
		System.out.println("--getBoardList() 贸府 --");
		conn = JdbcUtil.getConnection();	
		ArrayList<BoardDo> aList = new ArrayList<BoardDo>();	
		String sql = "select * from board";
		
		
		try {
			//sql 肯己 !!
			pstmt = conn.prepareStatement(sql);
			
			//sql 角青 
			rs = pstmt.executeQuery();			
			while(rs.next()) {
				BoardDo bdo = new BoardDo();
				bdo.setSeq(rs.getInt(1));
				bdo.setTitle(rs.getString(2));
				bdo.setWriter(rs.getString(3));
				bdo.setContent(rs.getString(4));
				aList.add(bdo);
			}
			System.out.println("getBoardList() 贸府 肯丰 !! ");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JdbcUtil.closeConnection(conn, pstmt, rs);
		return aList;
		
	}
	
	public void updateBoard(BoardDo bdo) {
		String sql = "update Board set title =?, content=? where seq=?";
		conn = JdbcUtil.getConnection();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bdo.getTitle());
			pstmt.setString(2, bdo.getContent());
			pstmt.setInt(3, bdo.getSeq());
			
			pstmt.executeUpdate();
			
			JdbcUtil.closeConnection(conn, pstmt, rs);
			System.out.println("updateBoard() 贸府 肯丰");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	public void deleteBoard(BoardDo bdo) {
		// TODO Auto-generated method stub
		String sql = "delete from Board where seq=?";
		conn = JdbcUtil.getConnection();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bdo.getSeq());
			
			pstmt.executeUpdate();
			
			JdbcUtil.closeConnection(conn, pstmt, rs);
			System.out.println("deleteBoard() 贸府 肯丰");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
