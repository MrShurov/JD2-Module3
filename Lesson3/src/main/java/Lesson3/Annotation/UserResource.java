package Lesson3.Annotation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Resource;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserResource {
    private String name;
    @Resource(name = "info")
    private IInfo info;
}
