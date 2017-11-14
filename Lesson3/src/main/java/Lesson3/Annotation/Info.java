package Lesson3.Annotation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@CustomAnnotation
public class Info implements IInfo {
    private Long id;
    private String account;
    private Double balance;
}
