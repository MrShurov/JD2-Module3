package Lesson2;

import Lesson2.entity.*;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class BeanTest{

    @Test
    void factoryTest() {
            ApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
            Person person = (Person) context.getBean("person");
            person.info();
    }

    @Test
    void InitAndDestroyTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
        PersonInitAndDestroy personInitAndDestroy = (PersonInitAndDestroy) context.getBean("personInitAndDestroy");
        personInitAndDestroy.info();
        ((ClassPathXmlApplicationContext) context).close();
    }

    @Test
    void DefaultTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ContextDefault.xml");
        PersonDefault personDefault = (PersonDefault) context.getBean("personDefault");
        System.out.println(personDefault.getName());
        ((ClassPathXmlApplicationContext) context).close();
    }

    @Test
    void DefaultTestWithOutInit() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ContextDefault.xml");
        Info info = (Info) context.getBean("info");
        System.out.println(info.getBalance());
        ((ClassPathXmlApplicationContext) context).close();
    }

    @Test
    void NamespaceTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ContextNamespace.xml");
        PersonNamespace personNamespace = (PersonNamespace) context.getBean("personNamespace");
        System.out.println(personNamespace.getName() + " " + personNamespace.getInfo());
    }

    @Test
    void ListTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ContextDefault.xml");
        PersonDefault personDefault = (PersonDefault) context.getBean("personDefault");
        System.out.println(personDefault.getTest());
    }

    @Test
    void MapTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ContextDefault.xml");
        PersonDefault personDefault = (PersonDefault) context.getBean("personDefault");
        System.out.println(personDefault.MapToString());
    }

    @Test
    void PropsTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ContextDefault.xml");
        PersonDefault personDefault = (PersonDefault) context.getBean("personDefault");
        System.out.println(personDefault.PropsToString());
    }

    @Test
    void NullTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
        NullValue nullValue = (NullValue)context.getBean("nullValue");
        System.out.println(nullValue.getName());
    }

    @Test
    void ExpressionBeanAndMethodTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ContextDefault.xml");
        PersonDefault personDefault = (PersonDefault) context.getBean("personDefault");
        System.out.println(personDefault.getInfo());
        System.out.println(personDefault.getBalance());
        ((ClassPathXmlApplicationContext) context).close();
    }

    @Test
    void OperationTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ContextDefault.xml");
        Operation operation = (Operation) context.getBean("operation");
        System.out.println(operation);
    }

    @Test
    void CollectionTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ContextDefault.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }
}
