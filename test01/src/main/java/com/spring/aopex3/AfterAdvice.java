package com.spring.aopex3;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
@Service
//@Aspect
public class AfterAdvice {
//	<aop:pointcut expression="execution(* com.spring.aopex2..*Impl.update*(..))" id="updatePointcut"/>
	@Pointcut("execution(* com.spring.aopex3..*Impl.update*(..))" )
	public void updatePointcut() {
		
		
	}
	
//	<aop:aspect ref="after">
//		<aop:after method="afterAdvice" pointcut-ref="updatePointcut"/>
//	</aop:aspect>
	@After("updatePointcut()")
	public void afterAdvice(){
		System.out.println("[AfterAdvice] ����Ͻ����� �����Ŀ� �� �����");
		
	}
}
