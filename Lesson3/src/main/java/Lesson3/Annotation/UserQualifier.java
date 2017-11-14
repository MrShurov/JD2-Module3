package Lesson3.Annotation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserQualifier {
    private String name;
    @Autowired
    @Qualifier("Info")
    private IInfo iInfo;
}
