package Lesson4.AnnotationConfiguration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component("userExclude")
public class UserExclude {
    @Value("Egor")
    private String name;
    @Autowired
    @Excluded
    private IInfo iInfo;
}
