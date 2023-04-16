package com.pawan.problems.parkinglot.strategies.PricingStrategy;

import com.pawan.problems.parkinglot.ticket.Ticket;

public class HourlyPricingStrategy extends PricingStrategy{
    @Override
    public long computePrice(Ticket ticket){
        return ticket.getParkingSpot().getPrice()* 60L;
    }
}
