package com.web.levyorganizer.services;

import com.web.levyorganizer.dao.RoomDetailRepo;
import com.web.levyorganizer.entity.RoomDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService implements  RoomServiceInterface{

    @Autowired
    private RoomDetailRepo roomDetailRepo;

    @Override
    public RoomDetails createRoom(RoomDetails roomDetails) {
        return roomDetailRepo.save(roomDetails);
    }

    @Override
    public RoomDetails getRoomDetailsById(long theId) {
        return roomDetailRepo.findById(theId);
    }

    @Override
    public RoomDetails getRoomDetailsByName(String theName) {
        return roomDetailRepo.findByRoomName(theName);
    }

    @Override
    public void deleteRoom(long theId) {

    }

}
