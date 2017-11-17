package Lesson5.aspects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopLoader {
    public static void main(String[] args) {
        /*ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");*/
        ApplicationContext context = new AnnotationConfigApplicationContext(WorkConfig.class);
        UserService userService = (UserService) context.getBean("UserService");
        System.out.println("        Before/After/Around");
        userService.hi();
        System.out.println("        intercept");
        userService.hi("Egor");
        System.out.println("        intercept2args");
        userService.hi("Rita",1);
        System.out.println("AfterThrowing");
        userService.exceptionHi();
    }
}
