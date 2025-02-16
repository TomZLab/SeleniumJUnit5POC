package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {

    private String firstName;
    private String lastName;
    private int age;


    public boolean isAdult() {
        return this.age >= 18;
    }
}
