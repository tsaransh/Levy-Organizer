package com.web.levyorganizer.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="personal_expense")
@Data
public class PersonalExpense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Tran_No")
    private int tranId;
    @Column(name = "exp_desc")
    private String expDesc;
    @Column(name="exp_type")
    private String expType;
    @Column(name="amount")
    private double amount;
    @Column(name="date")
    @CreatedDate
    private Date date = new Date();
    @Column(name="user_id")
    private long userId;


}
