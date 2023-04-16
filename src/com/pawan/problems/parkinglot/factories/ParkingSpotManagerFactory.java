package com.pawan.problems.parkinglot.factories;

import com.pawan.problems.parkinglot.parkingspotmanager.FourWheelerParkingSpotManager;
import com.pawan.problems.parkinglot.parkingspotmanager.ParkingSpotManager;
import com.pawan.problems.parkinglot.parkingspotmanager.TwoWheelerParkingSpotManager;
import com.pawan.problems.parkinglot.strategies.parkingstrategy.ParkingStrategy;
import com.pawan.problems.parkinglot.vehicle.VehicleType;

public class ParkingSpotManagerFactory {
    public ParkingSpotManager getParkingSpotManager(VehicleType vehicleType){
        switch (vehicleType){
            case TWO_WHEELER: return TwoWheelerParkingSpotManager.getParkingSpotManager();
            case FOUR_WHEELER: return FourWheelerParkingSpotManager.getParkingSpotManager();
        }
        return TwoWheelerParkingSpotManager.getParkingSpotManager();
    }
}
