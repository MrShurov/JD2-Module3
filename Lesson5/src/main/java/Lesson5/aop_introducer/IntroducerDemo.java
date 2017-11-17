package Lesson5.aop_introducer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Class IntroducerDemo
 *
 * Created by yslabko on 10/30/2017.
 */
public class IntroducerDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aspects_introducer.xml");
        DoTask doTask = context.getBean("taskService", DoTask.class);
        doTask.doMainJob();
        ((DoExtendedTask)doTask).doExtraJob();
    }
}
