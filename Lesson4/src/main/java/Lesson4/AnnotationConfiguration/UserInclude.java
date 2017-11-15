package Lesson4.AnnotationConfiguration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component("userInclude")
public class UserInclude {
    @Value("Gena")
    private String name;
    @Autowired
    @CustomAnnotation
    private IInfo iInfo;
}
