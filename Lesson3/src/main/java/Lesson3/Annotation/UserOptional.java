package Lesson3.Annotation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserOptional {
    private String name;
    private IInfo iInfo;

    @Autowired(required = false)
    public UserOptional(IInfo iInfo){
        this.iInfo = iInfo;
    }
}
