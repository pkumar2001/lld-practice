package com.pawan.problems.parkinglot;

import com.pawan.problems.parkinglot.costcomputation.CostComputation;
import com.pawan.problems.parkinglot.factories.ParkingSpotManagerFactory;
import com.pawan.problems.parkinglot.parkingspotmanager.ParkingSpotManager;
import com.pawan.problems.parkinglot.strategies.PricingStrategy.PricingStrategy;
import com.pawan.problems.parkinglot.ticket.Ticket;
import com.pawan.problems.parkinglot.vehicle.Vehicle;

public class ExitGate {
    ParkingSpotManagerFactory parkingSpotManagerFactory = new ParkingSpotManagerFactory();
    public void calculatePrice(Ticket ticket, PricingStrategy pricingStrategy){
        CostComputation costComputation = new CostComputation();
        costComputation.computeCost(ticket, pricingStrategy);
    }

    public void removeVehicle(Vehicle vehicle){
        ParkingSpotManager parkingSpotManager = parkingSpotManagerFactory.getParkingSpotManager(vehicle.getVehicleType());
        parkingSpotManager.removeVehicle(vehicle);
    }
}
