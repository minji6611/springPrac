package com.spring.aopex2;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAdvice {
	public Object aroundAdvice(ProceedingJoinPoint pjp)throws Throwable {
		System.out.println("[aroundAdvice]����Ͻ� ���� ���� ����Ǵ� �α�");
		Object retObj = pjp.proceed(); //����Ͻ� ���� �ҷ��ͼ� �����
//		
//		<aop:aspect ref="around">
//		<aop:around method="aroundAdvice"  aroundAdvice-->  pjp.proceed()
//					pointcut-ref="updatePointcut"/>
//		</aop:aspect>
		System.out.println("[aroundAdvice]����Ͻ� ���� �Ŀ� ����Ǵ� �α�");
		
		return retObj;
		
	}
	//JOinPoint�� �ƴ� ProceedingJoinPoint�̿���
	public Object aroundAdviceDO(ProceedingJoinPoint pjp)throws Throwable {
		String method = pjp.getSignature().getName();
		
		System.out.println("[aroundAdviceDO]����Ͻ� ���� ���� ����Ǵ� �α�");
		
		Object retObj = pjp.proceed(); //����Ͻ� ���� �ҷ��ͼ� �����
		
		if(retObj instanceof BoardDo) {
			BoardDo bdo = (BoardDo)retObj;
			System.out.println("[aroundAdvice] method: "+method+
					"retObj: "+bdo.getSeq()+", "+bdo.getTitle());
			
		}
		
		
		return retObj;
		
	}
}
