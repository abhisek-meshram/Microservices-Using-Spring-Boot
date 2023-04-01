package com.learn.hotel.services;

import com.learn.hotel.entities.Hotel;
import com.learn.hotel.exceptions.ResourceNotFoundException;
import com.learn.hotel.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel get(String HotelId) {
        return hotelRepository.findById(HotelId).orElseThrow(() -> new ResourceNotFoundException("Hotel with given Id not found !!"));
    }
}
