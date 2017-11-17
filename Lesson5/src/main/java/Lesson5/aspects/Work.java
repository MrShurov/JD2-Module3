package Lesson5.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Work {
    @Pointcut("execution(* Lesson5.aspects.UserService.hi())")
    public void performance() {

    }

    @Pointcut("execution(* Lesson5.aspects.UserService.exceptionHi())")
    public void performanceWithException(){

    }

    @Pointcut("execution(* Lesson5.aspects.UserService.hi(String)) && args(name)")
    public void intercept(String name) {

    }

    @Pointcut("execution(* Lesson5.aspects.UserService.hi(String, Integer)) && args(name, i)")
    public void intercept2args(String name, Integer i) {

    }

    @Before("performance()")
    public void beforeWork() {
        System.out.println("Execution before work");
    }

    @AfterReturning("performance()")
    public void afterWork() {
        System.out.println("Execution after work");
    }

    @AfterThrowing("performanceWithException()")
    public void afterWorkProblems() {
        System.out.println("Execution after work problems");
    }

    @Around("performance()")
    public void aroundWorkProblems(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("Start");
            String result = (String) joinPoint.proceed();
            System.out.println("Finish");
        } catch (Throwable t) {
            System.out.println(t);
        }
    }

    @Before("intercept(name)")
    public void interceptWorkName(String name) {
        System.out.println("Intercepted work is " + name);
    }

    @Before("intercept2args(name, i)")
    public void interceptWorkName(String name, Integer i) {
        System.out.println("Intercepted work is " + name +" " + i);
    }

}
