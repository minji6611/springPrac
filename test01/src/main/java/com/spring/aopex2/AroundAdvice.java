package com.spring.aopex2;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
	public Object aroundAdvice(ProceedingJoinPoint pjp)throws Throwable {
		System.out.println("[aroundAdvice]비즈니스 실행 전에 실행되는 로그");
		Object retObj = pjp.proceed(); //비즈니스 로직 불러와서 실행됨
//		
//		<aop:aspect ref="around">
//		<aop:around method="aroundAdvice"  aroundAdvice-->  pjp.proceed()
//					pointcut-ref="updatePointcut"/>
//		</aop:aspect>
		System.out.println("[aroundAdvice]비즈니스 실행 후에 실행되는 로그");
		
		return retObj;
		
	}
	//JOinPoint가 아닌 ProceedingJoinPoint이용함
	public Object aroundAdviceDO(ProceedingJoinPoint pjp)throws Throwable {
		String method = pjp.getSignature().getName();
		
		System.out.println("[aroundAdviceDO]비즈니스 실행 전에 실행되는 로그");
		
		Object retObj = pjp.proceed(); //비즈니스 로직 불러와서 실행됨
		
		if(retObj instanceof BoardDo) {
			BoardDo bdo = (BoardDo)retObj;
			System.out.println("[aroundAdvice] method: "+method+
					"retObj: "+bdo.getSeq()+", "+bdo.getTitle());
			
		}
		
		
		return retObj;
		
	}
}
