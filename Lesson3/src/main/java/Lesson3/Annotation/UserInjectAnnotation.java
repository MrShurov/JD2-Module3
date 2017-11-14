package Lesson3.Annotation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.inject.Inject;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInjectAnnotation {
    private String name;
    @Inject
    @InjectAnnotation
    private IInfo info;
}
