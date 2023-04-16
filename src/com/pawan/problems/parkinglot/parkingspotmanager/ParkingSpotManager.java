package com.pawan.problems.parkinglot.parkingspotmanager;

import com.pawan.problems.parkinglot.parkingspot.ParkingSpot;
import com.pawan.problems.parkinglot.strategies.parkingstrategy.ParkingStrategy;
import com.pawan.problems.parkinglot.vehicle.Vehicle;

import java.util.List;

public abstract  class ParkingSpotManager {
    List<ParkingSpot> parkingSpotList;
    final ParkingStrategy parkingStrategy;

    ParkingSpotManager(List<ParkingSpot> parkingSpotList, ParkingStrategy parkingStrategy) {
        this.parkingSpotList = parkingSpotList;
        this.parkingStrategy = parkingStrategy;
    }

    public ParkingSpot findParkingSpot() {
        return this.parkingStrategy.findParkingSpot();
    }

    abstract void addParkingSpot(ParkingSpot parkingSpot);

    abstract void removeParkingSpot(ParkingSpot parkingSpot);

    public ParkingSpot parkVehicle(Vehicle vehicle) throws Exception{
        ParkingSpot parkingSpot = findParkingSpot();
        if(parkingSpot == null){
            throw new Exception("Parking spot not found");
        }
        parkingSpot.bookVehicle(vehicle);
        return parkingSpot;
    }

    public void removeVehicle(Vehicle vehicle) {
        ParkingSpot parkingSpot = this.parkingSpotList.stream()
                .filter(parkingSpot1 -> parkingSpot1.getVehicle().getVehicleNo() == vehicle.getVehicleNo())
                .findFirst()
                .orElse(null);
        assert parkingSpot != null;
        parkingSpot.removeVehicle();
    }
}
