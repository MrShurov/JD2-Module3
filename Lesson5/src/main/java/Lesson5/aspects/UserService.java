package Lesson5.aspects;

import org.springframework.stereotype.Service;

@Service("UserService")
public class UserService {

    public void hi(){
        System.out.println("hi");
    }

    public String sayHi(){
        System.out.println("Hi");
        return "hi";
    }

    public void exceptionHi() throws RuntimeException {
        System.out.println("Hi with exception");
        throw new RuntimeException("ExceptionJob");
    }

    public void hi(String name){
        System.out.println("hi " + name);
    }

    public void hi(String name, Integer integer){
        System.out.println("hi " + name + " " + integer);
    }
}
