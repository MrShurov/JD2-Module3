package Lesson4.AnnotationConfiguration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@CustomAnnotation
@Component(value = "info")
public class Info implements IInfo {
    @Value("1")
    private Integer id;
    @Value("1234")
    private String account;
    @Value("100")
    private Double balance;
}
