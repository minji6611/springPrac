package com.spring.aopex2;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
	public Object aroundAdvice(ProceedingJoinPoint pjp)throws Throwable {
		System.out.println("[aroundAdvice]����Ͻ� ���� ���� ����Ǵ� �α�");
		Object retObj = pjp.proceed(); //����Ͻ� ���� �ҷ��ͼ� �����
		System.out.println("[aroundAdvice]����Ͻ� ���� �Ŀ� ����Ǵ� �α�");
		
		return retObj;
		
	}
}
