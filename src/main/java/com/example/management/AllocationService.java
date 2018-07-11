package com.example.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllocationService {


    @Autowired
    HotelRepository hotelRepository;

    @Autowired
    StaffRepository staffRepository;

    public String AllocateStaff(int hotel_id){

        Iterable<Hotel> hotels = hotelRepository.findAll();

        float maxi = 99;
        int temp = 0;
        Hotel AllocatedHotel = new Hotel();
        Hotel currentHotel = new Hotel();
        for (Hotel i : hotels)  if(i.getHotel_id() == hotel_id) currentHotel = i;

        for(Hotel i : hotels){


            if((i.getHotel_id() != currentHotel.getHotel_id())  && (i.getCluster_id() == currentHotel.getCluster_id() ) && ( i.getRatio() < maxi)){

                AllocatedHotel = i;

            }
        }


        Staff rotatedStaff = new Staff();
        Iterable<Staff> staff = staffRepository.findAll();
        for (Staff i: staff) {

            if(i.getCurrent_hotel_id() == currentHotel.getHotel_id()){

                rotatedStaff = i;
                AllocatedHotel.setCurrent_staff(AllocatedHotel.getCurrent_staff()+1);
                currentHotel.setCurrent_staff(currentHotel.getCurrent_staff()-1);
                rotatedStaff.setCurrent_hotel_id(AllocatedHotel.getHotel_id());
                currentHotel.updateRatio();
                AllocatedHotel.updateRatio();
                hotelRepository.save(AllocatedHotel);
                hotelRepository.save(currentHotel);
                staffRepository.save(rotatedStaff);
                break;

            }
        }

        return "Staff Allocated from Hotel Id" + Integer.toString(currentHotel.getHotel_id()) + "to " + Integer.toString(AllocatedHotel.getHotel_id());

    }


}
