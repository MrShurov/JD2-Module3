package Lesson3.ByConstructor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Info implements IInfo {
    private Long id;
    private String account;
    private Double balance;
}
