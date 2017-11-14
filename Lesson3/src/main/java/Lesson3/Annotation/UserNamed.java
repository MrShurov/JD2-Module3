package Lesson3.Annotation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.inject.Inject;
import javax.inject.Named;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserNamed {
    private String name;
    @Inject
    @Named(value = "info")
    private IInfo info;
}
