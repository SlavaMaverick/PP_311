package com.example.pp_311.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// @Data – аннотация, сочетающая возможности @ToString, @EqualsAndHashCode, @Getter, @Setter и @RequiredArgsConstructor.
// @NoArgsConstructor - Lombok автоматически генерирует непараметризованный конструктор

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private Integer age;

    public User(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
