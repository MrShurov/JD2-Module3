package Lesson2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonInitAndDestroy implements InitializingBean, DisposableBean {
    private String name;

    public void init(){
        System.out.println("init method");
    }

    public void destroy(){
        System.out.println("destroy method");
    }

    public void info(){
        System.out.println("Hello " + name);
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println(this.toString());
    }
}
