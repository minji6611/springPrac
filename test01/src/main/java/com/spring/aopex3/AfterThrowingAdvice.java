package com.spring.aopex3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
@Service
//@Aspect
public class AfterThrowingAdvice {
//	<aop:pointcut expression="execution(* com.spring.aopex2..*Impl.insertBoardExcept(..))"  id="insertExceptPointcut"/>
	@Pointcut("execution(* com.spring.aopex3..*Impl.insertBoardExcept(..))" )
	public void insertExceptPointcut() {
		
		
	}
	public void afterThrowingAdviceLog() {
		System.out.println("[AfterThrowingAdvice] 에외처리 발생시 실행되는 로그!!");
		
	}
//	<aop:aspect ref="afterThrowing">
//	<aop:after-throwing method="afterThrowingAdviceLogExcept" throwing="exceptObj" pointcut-ref="insertExceptPointcut"/>
	
@AfterThrowing(pointcut="insertExceptPointcut()", throwing="exceptObj")
	public void afterThrowingAdviceLogExcept(JoinPoint jp, Exception exceptObj) {
		String method = jp.getSignature().getName();
		System.out.println("[AfterThrowingAdviceExcept] method: "+method+
				", except Message: "+exceptObj);
	}
}
