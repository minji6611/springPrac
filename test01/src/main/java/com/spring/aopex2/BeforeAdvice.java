package com.spring.aopex2;

import org.aspectj.lang.JoinPoint;

public class BeforeAdvice {
	public void beforeLog() {
		System.out.println("[beforeAdvice] 비즈니스 로직 수행 전에 실행!!");
	}
	
	public void beforeLogDo(JoinPoint jp) {
		System.out.println("[beforeAdviceDo] 비즈니스 로직 수행 전에 실행(JointPoint)!!");
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		System.out.println("[beforeAdviceDo] method :"+method+
				"args : "+args[0].toString());
	}
}
