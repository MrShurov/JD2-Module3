package Lesson3.ByType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class InfoImpl implements IInfo {
    private Long id;
    private Double balance;
}
