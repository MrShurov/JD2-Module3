package Lesson4.ClassConfiguration;

import Lesson4.AnnotationConfiguration.IUser;
import Lesson4.AnnotationConfiguration.UserImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.SimpleCommandLinePropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "Lesson4.AnnotationConfiguration")
public class Context {
    @Autowired
    private UserImpl user;

    public static void main(String[] args){
        final AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(Context.class);
        applicationContext.getEnvironment().getPropertySources().addLast(new SimpleCommandLinePropertySource(args));
        applicationContext.refresh();
        applicationContext.start();
        try {
            Context context = applicationContext.getBean(Context.class);
            System.out.println("Name = " + context.user.getUserName());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
