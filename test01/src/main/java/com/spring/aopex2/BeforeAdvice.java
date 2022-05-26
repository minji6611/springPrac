package com.spring.aopex2;

import org.aspectj.lang.JoinPoint;

public class BeforeAdvice {
	public void beforeLog() {
		System.out.println("[beforeAdvice] ����Ͻ� ���� ���� ���� ����!!");
	}
	
	public void beforeLogDo(JoinPoint jp) {
		System.out.println("[beforeAdviceDo] ����Ͻ� ���� ���� ���� ����(JointPoint)!!");
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		System.out.println("[beforeAdviceDo] method :"+method+
				"args : "+args[0].toString());
	}
}
