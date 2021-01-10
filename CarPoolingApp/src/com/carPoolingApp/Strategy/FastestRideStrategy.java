package com.carPoolingApp.Strategy;

import com.carPoolingApp.Entities.OfferedRide;
import com.carPoolingApp.Entities.TakenRide;
import com.carPoolingApp.Repositories.UserOfferedRideRepository;
import com.carPoolingApp.Repositories.UserTakenRideRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FastestRideStrategy implements IRideSelectionStrategy {
    @Override
    public void select(String name, String origin, String destination) {
        //Get the rides with Origin and destination and then get the minimum duration ride
        // UserOfferedRideRepository.offeredRideMap.
        List<OfferedRide> offeredRides = UserOfferedRideRepository.offeredRide.stream().filter(
                offeredRide -> offeredRide.getOrigin().equals(origin) && offeredRide.getDestination().equals(destination)
        ).collect(Collectors.toList());

        if(offeredRides == null){
            System.out.println("No rides are available!");
            return;
        }
        Comparator<OfferedRide> comparator = Comparator.comparing( OfferedRide::getDuration);
        OfferedRide offeredRide = offeredRides.stream().min(comparator).get();
        TakenRide takenRide = new TakenRide();
        takenRide.setDriverName(offeredRide.getName());
        takenRide.setPassengerName(name);
        takenRide.setOfferedRideId(offeredRide.getOfferedRideId());
        takenRide.setDuration(offeredRide.getDuration());
        takenRide.setRideId(++UserTakenRideRepository.count);

        UserTakenRideRepository.takenRides.add(takenRide);
    }
}
