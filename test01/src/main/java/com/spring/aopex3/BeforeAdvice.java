package com.spring.aopex3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
//@Aspect
public class BeforeAdvice {

//	<aop:pointcut expression="execution(* com.spring.aopex2..*Impl.insertBoardDO(..))" 
//						id="insertDoPointcut"/> 
						
	@Pointcut("execution(* com.spring.aopex3..*Impl.insertBoardDO(..))" )
	public void insertDoPointcut() {
		
		
	}
	public void beforeLog() {
		System.out.println("[beforeAdvice] 비즈니스 로직 수행 전에 실행!!");
	}
	
//	<aop:aspect ref="before">
//		<aop:before method="beforeLogDo" pointcut-ref="insertDoPointcut"/>
//	</aop:aspect>
	@Before("insertDoPointcut()")
	public void beforeLogDo(JoinPoint jp) {
		System.out.println("[beforeAdviceDo] 비즈니스 로직 수행 전에 실행(JointPoint)!!");
		String method = jp.getSignature().getName();
		Object[] args = jp.getArgs();
		System.out.println("[beforeAdviceDo] method :"+method+
				"args : "+args[0].toString());
	}
}
