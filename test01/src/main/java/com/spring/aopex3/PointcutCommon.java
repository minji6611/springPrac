package com.spring.aopex3;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutCommon {
	@Pointcut("execution(* com.spring.aopex3..*Impl.insertBoardDO(..))" )
	public void insertDoPointcut() {
		
		
	}
	@Pointcut("execution(* com.spring.aopex3..*Impl.update*(..))" )
	public void updatePointcut() {
		
		
	}
}
