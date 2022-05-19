package com.spring.aopex2;

public class BeforeAdvice {
	public void beforeLog() {
		System.out.println("[beforeAdvice] 비즈니스 로직 수행 전에 실행!!");
	}
}
