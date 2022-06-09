package com.spring.dog.ano.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.spring.dog.common.JdbcUtil;



@Repository("dogInfoDao")
public class DogInfoDao {
	
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	public void insertDogInfo(DogDo ddo) {
		
		conn = JdbcUtil.getConnection();
		//seq, title, writer, content  
		String sql = "insert into dogInfo (name, species, color) "
				+ "values (?,?,?)";
		try {
			//sql �ϼ� !!
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ddo.getName());
			pstmt.setString(2, ddo.getSpecies());
			pstmt.setString(3, ddo.getColor());
			//sql ���� 
			pstmt.executeUpdate();			
			
			System.out.println("insertDogInfo() ���� �Ϸ� !! ");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JdbcUtil.closeConnection(conn, pstmt, rs);
	}
	
	
}
