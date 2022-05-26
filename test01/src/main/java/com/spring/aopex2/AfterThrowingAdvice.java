package com.spring.aopex2;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAdvice {
	public void afterThrowingAdviceLog() {
		System.out.println("[AfterThrowingAdvice] 에외처리 발생시 실행되는 로그!!");
		
	}
	
	public void afterThrowingAdviceLogExcept(JoinPoint jp, Exception exceptObj) {
		String method = jp.getSignature().getName();
		System.out.println("[AfterThrowingAdviceExcept] method: "+method+
				", except Message: "+exceptObj);
	}
}
