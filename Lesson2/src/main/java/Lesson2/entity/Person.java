package Lesson2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private static Person person = new Person();
    private String name;

    public static Person getInstance(){
        return person;
    }

    public void info(){
        System.out.println("Hello " + name);
    }
}
