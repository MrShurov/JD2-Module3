package Lesson3;

import Lesson3.Annotation.*;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("ContextAnnotation.xml");
        UserAutowired userAutowired = (UserAutowired) context.getBean("userAutowired");
        System.out.println(userAutowired);
    }

    @Test
    void annotationAutowiredOptionalTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ContextAnnotationOptional.xml");
        UserOptional userOptional = (UserOptional) context.getBean("userOptional");
        System.out.println(userOptional);
    }

    @Test
    void annotationAutowiredQualifierTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ContextQualifier.xml");
        UserQualifier userQualifier = (UserQualifier) context.getBean("userQualifier");
        System.out.println(userQualifier);
    }

    @Test
    void annotationAutowiredQualifierCustomTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ContextCustom.xml");
        UserCustom userCustom = (UserCustom) context.getBean("userCustom");
        System.out.println(userCustom);
    }

    @Test
    void annotationInjectTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ContextCustom.xml");
        UserInject userInject = (UserInject) context.getBean("userInject");
        System.out.println(userInject);
    }

    @Test
    void annotationInjectCollectionTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ContextCustom.xml");
        UserProvider userProvide = (UserProvider) context.getBean("userProvider");
        System.out.println(userProvide);
    }

    @Test
    void annotationInjectNamedTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ContextCustom.xml");
        UserNamed userNamed = (UserNamed) context.getBean("userNamed");
        System.out.println(userNamed);
    }

    @Test
    void annotationInject330Test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ContextCustom.xml");
        UserInjectAnnotation userInjectAnnotation = (UserInjectAnnotation) context.getBean("userInjectAnnotation");
        System.out.println(userInjectAnnotation);
    }

    @Test
    void annotationValueTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ContextCustom.xml");
        UserValue userValue = (UserValue) context.getBean("userValue");
        System.out.println(userValue);
    }

    @Test
    void annotationResourseTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ContextCustom.xml");
        UserResource userResource = (UserResource) context.getBean("userResource");
        System.out.println(userResource);
    }
}
