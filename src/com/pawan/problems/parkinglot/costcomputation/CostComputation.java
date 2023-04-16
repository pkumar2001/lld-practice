package com.pawan.problems.parkinglot.costcomputation;

import com.pawan.problems.parkinglot.strategies.PricingStrategy.PricingStrategy;
import com.pawan.problems.parkinglot.ticket.Ticket;

public class CostComputation {
    public long computeCost(Ticket ticket, PricingStrategy pricingStrategy){
        return pricingStrategy.computePrice(ticket);
    }
}
