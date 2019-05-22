package com.train;

public class Ticket {
    int tickets;
    int roundTrip;

    public Ticket(int tickets, int roundTrip) {
        this.tickets = tickets;
        this.roundTrip = roundTrip;
    }

    public void print(){
        System.out.println("Total tickets: " + tickets + "\n" +
                "Round-trip: " + roundTrip + "\n" +
                "Total: " + (int)((tickets-roundTrip)*1000 + roundTrip*2000*0.9));
    }
}
