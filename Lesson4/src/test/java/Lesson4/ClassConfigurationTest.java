package Lesson4;

import Lesson4.AnnotationConfiguration.UserImpl;
import Lesson4.ClassConfiguration.Context;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Context.class})
public class ClassConfigurationTest {

    @Autowired
    private UserImpl user;

    @Test
    public void getNameTest(){
        System.out.println(user.getUserName());
    }
}
