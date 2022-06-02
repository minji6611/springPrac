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
//	<aop:aspect ref="around">
//	<aop:around method="aroundAdviceDO"
//				pointcut-ref="insertReturnPointcut"/> 
//	</aop:aspect>
	@Around("insertReturnPointcut()")
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
	@Around("insertReturnPointcut()")
	public Object aroundElapseTimeLog(ProceedingJoinPoint pjp) throws Throwable{
		//핵심관심영역 코드의 메소드 이름 
		String method = pjp.getSignature().getName();
		
		System.out.println("핵심관심영역 코드 실행시 걸리는 시간 체크 전!!");
		StopWatch stopWatch = new StopWatch();
		stopWatch.start(); //시간 체크
		Object returnObj = pjp.proceed(); //핵심관심 코드 실행
		
		Thread.sleep(200); //200msec!!
		stopWatch.stop();
		System.out.println("핵심관심영역 코드 실행시 걸리는 시간 체크 후!!");
		System.out.println("핵심관심영역 코드 실행시에 걸리는 시간: "
											+ stopWatch.getTotalTimeMillis());
		return returnObj;
		
	}
}
