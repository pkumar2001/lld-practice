package com.pawan.problems.parkinglot.parkingspotmanager;

import com.pawan.problems.parkinglot.parkingspot.ParkingSpot;
import com.pawan.problems.parkinglot.parkingspot.TwoWheelerParkingSpot;
import com.pawan.problems.parkinglot.strategies.parkingstrategy.NearToElevatorStrategy;
import com.pawan.problems.parkinglot.strategies.parkingstrategy.ParkingStrategy;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager {

    private static ParkingSpotManager twoWheelerParkingSpotManager;


    private TwoWheelerParkingSpotManager(List<ParkingSpot> parkingSpotList, ParkingStrategy parkingStrategy) {
        super(parkingSpotList, parkingStrategy);
    }

    public static ParkingSpotManager getParkingSpotManager() {
        final ParkingStrategy parkingStrategy = new NearToElevatorStrategy();
        if (twoWheelerParkingSpotManager == null) {
            List<ParkingSpot> parkingSpotList1 = new ArrayList<>();
            for(int i=0; i<600; i++){
                parkingSpotList1.add(new TwoWheelerParkingSpot(50));
            }
            twoWheelerParkingSpotManager = new TwoWheelerParkingSpotManager(parkingSpotList1, parkingStrategy);
        }
        return twoWheelerParkingSpotManager;
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
