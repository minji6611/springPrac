package com.spring.aopEx1;

import org.springframework.stereotype.Service;

@Service("logAdvice")
public class LogAdvice {
	public void printLog() {
		System.out.println("[������ɿ����ڵ�] ����Ͻ� ���� ���� ����Ǵ� �α�");
		
	}
}
