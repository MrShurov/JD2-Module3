package Lesson3.ByConstructor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private String surname;
    private IInfo info;

    public User(IInfo info){
        this.info = info;
    }
}
