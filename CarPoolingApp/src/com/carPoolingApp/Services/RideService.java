package com.carPoolingApp.Services;

import com.carPoolingApp.Entities.OfferedRide;
import com.carPoolingApp.Repositories.UserOfferedRideRepository;
import com.carPoolingApp.Repositories.UserRepository;
import com.carPoolingApp.Repositories.UserTakenRideRepository;
import com.carPoolingApp.Strategy.IRideSelectionStrategy;

import java.util.stream.Collectors;

public class RideService {
    public static void addRide(OfferedRide offeredRide){
        UserOfferedRideRepository.offeredRide.add(offeredRide);
    }
    public static void selectRide(String name, String origin, String destination, IRideSelectionStrategy rideSelectionStrategy){
        rideSelectionStrategy.select(name,origin,destination);
    }
    public static void getAllRidesByUser(){
        UserRepository.userMap.forEach(user -> {
            int offeredRides = (int) UserOfferedRideRepository.offeredRide.stream()
                    .filter(offeredRide -> offeredRide.getName().equals(user.getName()))
                    .count();
            int takenRides = (int) UserTakenRideRepository.takenRides.stream()
                    .filter(takenRide -> takenRide.getPassengerName().equals(user.getName()))
                    .count();

            System.out.println(user.getName()+" : "+offeredRides+" Offered,"+takenRides+" taken");
        });
    }
}
