package com.learn.hotel.services;

import com.learn.hotel.entities.Hotel;

import java.util.List;

public interface HotelService {

    //Create
    Hotel create(Hotel hotel);

    //getAll
    List<Hotel> getAll();

    //getOne
    Hotel get(String id);

}
