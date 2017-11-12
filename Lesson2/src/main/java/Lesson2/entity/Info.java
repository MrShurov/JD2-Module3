package Lesson2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Info implements IInfo {
    private double balance;

    public String Test(){
        return "Egor";
    }
}
