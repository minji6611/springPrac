package com.spring.aopEx1;

import org.springframework.stereotype.Service;

import com.mysql.jdbc.log.Log;

@Service("logAdvice")
public class LogAdvice {
	public void printLog() {
		System.out.println("[공통관심영역코드] 비즈니스 로직 전에 수행되는 로그");
		
		
	}
	public void printLogmodify() {

		System.out.println("[공통 Modify] 비즈니스 로직 전에 수행되는 로그");
	}
}
