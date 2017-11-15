package Lesson4.ClassConfiguration;

import org.springframework.context.annotation.*;
import org.springframework.core.env.SimpleCommandLinePropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "Lesson4.AnnotationConfiguration")
public class Context {
    public static void main(String[] args){
        final AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(Context.class);
        applicationContext.getEnvironment().getPropertySources().addLast(new SimpleCommandLinePropertySource(args));
        applicationContext.refresh();
        applicationContext.start();
    }
}
