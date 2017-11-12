package Lesson2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Properties;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonDefault {
    private String name;
    private Double balance;
    private IInfo info;
    private List<String> test;
    private Map<Integer,String> testMap;
    private Properties testProps;

    public void init(){
        System.out.println("init method");
    }

    public void destroy(){
        System.out.println("destroy method");
    }

    public String MapToString(){
        return "PersonDefault{" +
                "testMap=" + testMap +
                '}';
    }

    public String PropsToString(){
        return "PersonDefault{" +
                "testProps=" + testProps +
                '}';
    }
}
