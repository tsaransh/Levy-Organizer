package com.web.levyorganizer.services;

import com.web.levyorganizer.entity.RoomDetails;

public interface RoomServiceInterface {

    public RoomDetails createRoom(RoomDetails roomDetails);

    public RoomDetails getRoomDetailsById(long theId);

    public RoomDetails getRoomDetailsByName(String name);

    public void deleteRoom(long theId);

}
