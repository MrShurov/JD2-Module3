package Lesson4;

import Lesson4.AnnotationConfiguration.UserExclude;
import Lesson4.AnnotationConfiguration.UserInclude;
import Lesson4.ClassConfiguration.Context;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.SimpleCommandLinePropertySource;
import org.springframework.util.Assert;

public class Tests {

    @Test
    void onlyAnnotationConfiguration(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
        UserExclude userExclude = (UserExclude) context.getBean("userExclude");
        UserInclude userInclude = (UserInclude) context.getBean("userInclude");
        System.out.println(userExclude);
        System.out.println(userInclude);
    }

    @Test
    void onlyAnnotationConfigurationWithFilters() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ContextWithFilters.xml");
        UserExclude userExclude = (UserExclude) context.getBean("userExclude");
        UserInclude userInclude = (UserInclude) context.getBean("userInclude");
        System.out.println(userExclude);
        System.out.println(userInclude);
    }
}
