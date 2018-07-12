package com.example.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookingService {

    @Autowired
    HotelRepository hotelRepository;


    public String BookRooms(int id,int rooms) {
        System.out.println("hello ");

        Iterable<Hotel> hotels = hotelRepository.findAll();

        String returnStatement = "";
        Hotel hotel = new Hotel();
        for (Hotel i : hotels) {
            if (i.getHotel_id() == id) {
                System.out.println("hello"+i.getHotel_id()+" "+id);
                returnStatement += "right now hotel id " +  Integer.toString(id) + "has " + Integer.toString(i.getCurrent_rooms());
                hotel = new Hotel(i);
                int temp = i.getCurrent_rooms();
                System.out.println("h1 "+i.getCurrent_rooms());
                System.out.println("h1 "+rooms);

                hotel.setCurrent_rooms(temp+rooms);
                hotel.updateRatio();
                System.out.println(hotel.getCurrent_rooms());
                System.out.println("h2 "+hotel.getCurrent_rooms());
                hotelRepository.delete(i);
                hotelRepository.save(hotel);

                break;

            }
        }

        return returnStatement + "<br> " +
                Integer.toString(hotel.getCurrent_rooms()) + "Rooms Booked for hotel id " + Integer.toString(hotel.getHotel_id()) ;

    }



}
