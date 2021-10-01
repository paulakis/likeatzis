package self.company.likeatzis.Model;

import lombok.Data;

import javax.persistence.*;

@MappedSuperclass
@Data
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String surName;
    private int age;
    private String email;
    private String mobileNumber;
    private String homeNumber;

}
