package self.company.likeatzis.Model;

import lombok.Data;

@Data
public abstract class Person {

    private String name;
    private String surName;
    private int age;
    private String email;
    private String mobileNumber;
    private String homeNumber;

}
