package com.example.login_app.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//import javax.persistence.*; Spring boot new version entity issue jpa entity is not a managed type
import jakarta.persistence.*;

@Setter
@Getter
@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

}

