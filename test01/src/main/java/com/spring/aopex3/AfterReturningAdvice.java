package com.spring.aopex3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
@Service
//@Aspect
public class AfterReturningAdvice {
//	<aop:pointcut expression="execution(* com.spring.aopex2..*Impl.insertBoardReturn(..))" 
//			id="insertReturnPointcut"/>	
	@Pointcut("execution(* com.spring.aopex3..*Impl.insertBoardReturn(..))" )
	public void insertReturnPointcut() {
		
		
	}
	public void afterReturningAdviceLog() {
		System.out.println("[AfterReturningAdvice] ����Ʈ �� ���� �Ŀ� �����̽� ����");
		
	}

	/*
	 * <!-- <aop:aspect ref="afterReturning"> <aop:after-returning
	 * method="afterReturningAdviceLogDO" returning="returnObj"
	 * pointcut-ref="insertReturnPointcut"/>
	 */
@AfterReturning(pointcut="insertReturnPointcut()", returning="returnObj")
	public void afterReturningAdviceLogDO(JoinPoint jp, Object returnObj) {
		String method = jp.getSignature().getName();
		if(returnObj instanceof BoardDo) {
			BoardDo bdo = (BoardDo)returnObj;
			System.out.println("[afterReturningAdviceLogDO] method: "+method+
					"returnObj ����: "+bdo.getSeq()+", "+bdo.getTitle());
		}	
	}
}
