package com.pawan.problems.parkinglot.parkingspot;

import com.pawan.problems.parkinglot.vehicle.Vehicle;

public class ParkingSpot {
    int id;
    Vehicle vehicle;
    boolean isEmpty;
    int price;

    ParkingSpot(int price){
        this.price = price;
    }

    public void bookVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        this.isEmpty = false;
    }

    public void removeVehicle(){
        this.vehicle = null;
        this.isEmpty = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
