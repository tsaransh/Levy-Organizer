package com.web.levyorganizer.dao;


import com.web.levyorganizer.entity.RoomDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomDetailRepo extends JpaRepository<RoomDetails, Long> {

    public RoomDetails findById(long theId);
    public RoomDetails findByRoomName(String name);

}
