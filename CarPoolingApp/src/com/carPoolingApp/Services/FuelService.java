package com.carPoolingApp.Services;

import com.carPoolingApp.Repositories.UserRepository;
import com.carPoolingApp.Repositories.UserTakenRideRepository;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class FuelService {
    public static void getTotalFuelSaved(){
        //for all the UserTakeRideRepository customers get the duration of ride

        UserRepository.userMap.forEach(user -> {
            AtomicInteger fuelSaved = new AtomicInteger();
            UserTakenRideRepository.takenRides
                    .forEach(takenRide -> {
                        if(takenRide.getPassengerName().equals(user.getName())){
                            fuelSaved.addAndGet(takenRide.getDuration());
                        }
                    });
            System.out.print(user.getName()+" : "+fuelSaved);
        });


    }
}
