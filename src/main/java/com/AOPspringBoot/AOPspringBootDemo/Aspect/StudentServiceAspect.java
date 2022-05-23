package com.AOPspringBoot.AOPspringBootDemo.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StudentServiceAspect {
	
	//@after(* * *.checkout())
	
	//@Before("execution(* .AOPspringBoot.AOPspringBootDemo.StudentService.createStudent(..)) and  args(data)")
	//@Before("execution(* *.*.*.createStudent(..)) and  args(data)")
	@After(value = "execution(* com.AOPspringBoot.AOPspringBootDemo.Service.StudentService.deleteStudent(..)) and args(empId)")
    public void beforelogger(JoinPoint joinPoint, String empId){

        //System.out.println(joinPoint.getSignature());
        String args = joinPoint.getArgs()[0].toString();
        System.out.println("Before Loggers withArgument:" + args);
    }
	
    //@Before(value = "execution(* com.AOPspringBoot.AOPspringBootDemo.Service.StudentService.deleteStudent(..)) and args(empId)")
	//@After("execution(* *.*.*.deleteStudent())")
    public void afterLogger(){
        System.out.println("after Logger");
    }
	
	@After(value = "execution(* com.AOPspringBoot.AOPspringBootDemo.Service.StudentService.deleteStudent(..)) and args(empId)")
	public void afterAdviceDel(JoinPoint joinPoint, String empId) {
		System.out.println("Before method:" + joinPoint.getSignature());
		System.out.println(
				"Deleted Employee with first name - "+ "and id - " + empId);
	}
	

	
	
}
