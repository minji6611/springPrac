package com.spring.aopex2;

import org.aspectj.lang.JoinPoint;

public class AfterReturningAdvice {
	public void afterReturningAdviceLog() {
		System.out.println("[AfterReturningAdvice] 포인트 컷 실행 후에 어드바이스 적용");
		
	}
	
	public void afterReturningAdviceLogDO(JoinPoint jp, Object returnObj) {
		String method = jp.getSignature().getName();
		if(returnObj instanceof BoardDo) {
			BoardDo bdo = (BoardDo)returnObj;
			System.out.println("[afterReturningAdviceLogDO] method: "+method+
					"returnObj 내용: "+bdo.getSeq()+", "+bdo.getTitle());
		}	
	}
}
