package com.bmt.webapp.models;
import java.util.Date;
import jakarta.persistence.*;
import lombok.*;



@Entity
@Table(name = "clients")
@Getter
@Setter
public class Client {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstName;
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    private String phone;

    private String adresse;
    private String status;
    private Date createdAt;

}
