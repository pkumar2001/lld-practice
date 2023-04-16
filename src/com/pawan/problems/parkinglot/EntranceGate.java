package com.pawan.problems.parkinglot;

import com.pawan.problems.parkinglot.factories.ParkingSpotManagerFactory;
import com.pawan.problems.parkinglot.parkingspot.ParkingSpot;
import com.pawan.problems.parkinglot.parkingspotmanager.ParkingSpotManager;
import com.pawan.problems.parkinglot.strategies.parkingstrategy.ParkingStrategy;
import com.pawan.problems.parkinglot.ticket.Ticket;
import com.pawan.problems.parkinglot.vehicle.Vehicle;

public class EntranceGate {
    ParkingSpotManagerFactory parkingSpotManagerFactory = new ParkingSpotManagerFactory();

    public Ticket bookVehicle(Vehicle vehicle) throws Exception{
        ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(vehicle.getVehicleType());
        ParkingSpot parkingSpot = parkingSpotManager.parkVehicle(vehicle);
        return generateTicket(vehicle, parkingSpot);
    }

    public Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot){
        return new Ticket(vehicle, parkingSpot);
    }
}
