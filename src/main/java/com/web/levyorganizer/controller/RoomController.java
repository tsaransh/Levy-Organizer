package com.web.levyorganizer.controller;

import com.web.levyorganizer.entity.LoginEntityForRoom;
import com.web.levyorganizer.entity.RoomDetails;
import com.web.levyorganizer.services.RoomServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/room")
public class RoomController {


    private RoomServiceInterface roomServiceMethods;

    @Autowired
    public RoomController(RoomServiceInterface roomServiceMethods) {
        this.roomServiceMethods = roomServiceMethods;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST ,consumes = MediaType.APPLICATION_JSON_VALUE)
    public RoomDetails createRoom(@RequestBody RoomDetails roomDetails) {
        System.err.println("Api call received for creating room "+roomDetails.toString());
        RoomDetails roomDetails1 =  roomServiceMethods.createRoom(roomDetails);
        return roomDetails1;
    }

    @PostMapping("/search/id")
    public RoomDetails searchRoomById(@RequestBody LoginEntityForRoom roomDetailsFront) {
        RoomDetails roomDetails = roomServiceMethods.getRoomDetailsById(roomDetailsFront.getId());
        if(roomDetails.getRoomPlainPassword().equals(roomDetailsFront.getRoomPlainPassword()))
            return roomDetails;
        else
            return null;
    }

    @RequestMapping(value = "/search/name", method = RequestMethod.POST ,consumes = MediaType.APPLICATION_JSON_VALUE)
    public RoomDetails searchRoomByName(@RequestBody LoginEntityForRoom roomDetailsFront) {
        System.err.println(roomDetailsFront.toString());
//        return roomServiceMethods.getRoomDetailsByName(roomDetailsFront.getRoomName());
        RoomDetails roomDetails = roomServiceMethods.getRoomDetailsByName(roomDetailsFront.getRoomName());
        if(roomDetails.getRoomPlainPassword().equals(roomDetailsFront.getRoomPlainPassword()))
            return roomDetails;
        else
            return null;
    }

}
