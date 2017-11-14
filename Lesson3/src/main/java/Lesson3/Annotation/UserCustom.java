package Lesson3.Annotation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCustom {
    private String name;
    @Autowired
    @CustomAnnotation
    private IInfo iInfo;
}
