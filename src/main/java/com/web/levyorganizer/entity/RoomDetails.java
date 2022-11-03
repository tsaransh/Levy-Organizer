package com.web.levyorganizer.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name="room_details")
public class RoomDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="room_id")
    private long id;

    @Column(name="room_name")
    private String roomName;

    @Column(name="creation_date")
    private Date creationCate = new Date();

    @Column(name="purpose")
    private String purpose;

    @Column(name="created_by")
    private long createdBy;

    @Column(name="room_password")
    private String roomPlainPassword;

    @Column(name="group_type")
    private String groupType;
}
