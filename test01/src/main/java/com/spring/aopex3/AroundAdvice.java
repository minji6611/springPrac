package com.spring.aopex3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;
@Service
@Aspect
public class AroundAdvice {
//	<aop:pointcut expression="execution(* com.spring.aopex2..*Impl.insertBoardReturn(..))" 
//			id="insertReturnPointcut"/>		
	@Pointcut("execution(* com.spring.aopex3..*Impl.insertBoardReturn(..))")
	public void insertReturnPointcut() {
		
		
	}
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
//	<aop:aspect ref="around">
//	<aop:around method="aroundAdviceDO"
//				pointcut-ref="insertReturnPointcut"/> 
//	</aop:aspect>
	@Around("insertReturnPointcut()")
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
	@Around("insertReturnPointcut()")
	public Object aroundElapseTimeLog(ProceedingJoinPoint pjp) throws Throwable{
		//�ٽɰ��ɿ��� �ڵ��� �޼ҵ� �̸� 
		String method = pjp.getSignature().getName();
		
		System.out.println("�ٽɰ��ɿ��� �ڵ� ����� �ɸ��� �ð� üũ ��!!");
		StopWatch stopWatch = new StopWatch();
		stopWatch.start(); //�ð� üũ
		Object returnObj = pjp.proceed(); //�ٽɰ��� �ڵ� ����
		
		Thread.sleep(200); //200msec!!
		stopWatch.stop();
		System.out.println("�ٽɰ��ɿ��� �ڵ� ����� �ɸ��� �ð� üũ ��!!");
		System.out.println("�ٽɰ��ɿ��� �ڵ� ����ÿ� �ɸ��� �ð�: "
											+ stopWatch.getTotalTimeMillis());
		return returnObj;
		
	}
}
