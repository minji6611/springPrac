package com.spring.aopex2;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAdvice {
	public void afterThrowingAdviceLog() {
		System.out.println("[AfterThrowingAdvice] ����ó�� �߻��� ����Ǵ� �α�!!");
		
	}
	
	public void afterThrowingAdviceLogExcept(JoinPoint jp, Exception exceptObj) {
		String method = jp.getSignature().getName();
		System.out.println("[AfterThrowingAdviceExcept] method: "+method+
				", except Message: "+exceptObj);
	}
}
