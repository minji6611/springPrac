package com.spring.aopex2;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
	public Object aroundAdvice(ProceedingJoinPoint pjp)throws Throwable {
		System.out.println("[aroundAdvice]비즈니스 실행 전에 실행되는 로그");
		Object retObj = pjp.proceed(); //비즈니스 로직 불러와서 실행됨
		System.out.println("[aroundAdvice]비즈니스 실행 후에 실행되는 로그");
		
		return retObj;
		
	}
}
