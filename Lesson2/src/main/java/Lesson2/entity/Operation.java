package Lesson2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Operation {
    private Double plus;
    private Double minus;
    private Double divide;
    private Double multiplication;
    private Boolean eq;
    private Boolean lt;
    private Boolean le;
    private Boolean gt;
    private Boolean and;
    private Boolean or;
}
