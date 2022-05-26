package com.spring.aopex2;

import org.aspectj.lang.JoinPoint;

public class AfterReturningAdvice {
	public void afterReturningAdviceLog() {
		System.out.println("[AfterReturningAdvice] ����Ʈ �� ���� �Ŀ� �����̽� ����");
		
	}
	
	public void afterReturningAdviceLogDO(JoinPoint jp, Object returnObj) {
		String method = jp.getSignature().getName();
		if(returnObj instanceof BoardDo) {
			BoardDo bdo = (BoardDo)returnObj;
			System.out.println("[afterReturningAdviceLogDO] method: "+method+
					"returnObj ����: "+bdo.getSeq()+", "+bdo.getTitle());
		}	
	}
}
