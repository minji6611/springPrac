package com.spring.aopEx1;

import org.springframework.stereotype.Service;

import com.mysql.jdbc.log.Log;

@Service("logAdvice")
public class LogAdvice {
	public void printLog() {
		System.out.println("[������ɿ����ڵ�] ����Ͻ� ���� ���� ����Ǵ� �α�");
		
		
	}
	public void printLogmodify() {

		System.out.println("[���� Modify] ����Ͻ� ���� ���� ����Ǵ� �α�");
	}
}
