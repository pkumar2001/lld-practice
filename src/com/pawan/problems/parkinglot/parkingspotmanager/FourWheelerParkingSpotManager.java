package com.pawan.problems.parkinglot.parkingspotmanager;

import com.pawan.problems.parkinglot.parkingspot.FourWheelerParkingSpot;
import com.pawan.problems.parkinglot.parkingspot.ParkingSpot;
import com.pawan.problems.parkinglot.strategies.parkingstrategy.NearToElevatorStrategy;
import com.pawan.problems.parkinglot.strategies.parkingstrategy.ParkingStrategy;

import java.util.ArrayList;
import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager {

    private static ParkingSpotManager fourWheelerParkingSpotManager;

    private FourWheelerParkingSpotManager(List<ParkingSpot> parkingSpotList, ParkingStrategy parkingStrategy) {
        super(parkingSpotList, parkingStrategy);
    }

    public static ParkingSpotManager getParkingSpotManager() {
        final ParkingStrategy parkingStrategy = new NearToElevatorStrategy();
        if (fourWheelerParkingSpotManager == null) {
            List<ParkingSpot> parkingSpotList = new ArrayList<>();
            for(int i=0; i<400; i++){
                parkingSpotList.add(new FourWheelerParkingSpot(100));
            }
            fourWheelerParkingSpotManager = new FourWheelerParkingSpotManager(parkingSpotList, parkingStrategy);
        }
        return fourWheelerParkingSpotManager;
    }

    @Override
    void addParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpotList.add(parkingSpot);
    }

    @Override
    void removeParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpotList.remove(parkingSpot);
    }
}
