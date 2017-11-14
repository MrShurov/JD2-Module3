package Lesson3.Annotation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Inject;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInject {
    private String name;
    @CustomAnnotation
    @Inject
    private IInfo info;
}
