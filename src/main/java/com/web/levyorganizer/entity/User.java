package com.web.levyorganizer.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="user_details")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private long id;

    @Column(name="user_first_name")
    private String firstName;

    @Column(name="user_last_name")
    private String lastName;

    @Column(name="user_phone_number")
    private long phoneNumber;

    @Column(name="user_email")
    private String email;

    @Column(name="user_password")
    private String userPlainPassword;

    @CreatedDate
    @Column(name="user_account_creation_date")
    private Date creationDate = new Date();

}
