package Lesson3;

import Lesson3.Annotation.UserAutowired;
import Lesson3.ByName.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class autowiredTest {

    @Test
    void byNameTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }

    @Test
    void byTypeTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
        Lesson3.ByType.User user = (Lesson3.ByType.User) context.getBean("userByType");
        System.out.println(user);
    }

    @Test
    void byTypeCandidateTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ContextCandidate.xml");
        Lesson3.ByType.User user = (Lesson3.ByType.User) context.getBean("userByType");
        System.out.println(user);
    }

    @Test
    void byConstructorTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
        Lesson3.ByConstructor.User user = (Lesson3.ByConstructor.User) context.getBean("userByConstructor");
        System.out.println(user);
    }

    @Test
    void byConstructorCandidateTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ContextCandidate.xml");
        Lesson3.ByConstructor.User user = (Lesson3.ByConstructor.User) context.getBean("userByConstructor");
        System.out.println(user);
    }

    @Test
    void annotationAutowiredTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ContextAnnotation");
        UserAutowired userAutowired = (UserAutowired) context.getBean("userAutowired");
        System.out.println(userAutowired);
    }
}
