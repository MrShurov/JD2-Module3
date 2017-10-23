package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainLoader {
    public static void main(String[] args){
        ApplicationContext context = new  ClassPathXmlApplicationContext("Context.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person.getName());
    }
}
