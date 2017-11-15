package Lesson4.AnnotationConfiguration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Excluded
@Component(value = "infoAboutUser")
public class InfoAboutUser implements IInfo {
    @Value("excluded")
    private String string;
}
