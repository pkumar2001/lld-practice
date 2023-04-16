package com.pawan.problems.parkinglot;

import com.pawan.problems.parkinglot.vehicle.Vehicle;
import com.pawan.problems.parkinglot.vehicle.VehicleType;

public class ParkingLotApp {
    public static void main(String[] args) {
        EntranceGate entranceGate = new EntranceGate();
        ExitGate exitGate = new ExitGate();

        Vehicle vehicle1 = new Vehicle(123, VehicleType.TWO_WHEELER);
        try {
            entranceGate.bookVehicle(vehicle1);
        } catch (Exception e){
            System.out.println(e.toString());
        }





    }
}
