package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    val tickets = scanner.nextInt()
    print("How many round-trip tickets: ")
    val roundTrip = scanner.nextInt()
    val ticketKotlin = TicketKotlin(tickets, roundTrip)
    ticketKotlin.print()
}

class TicketKotlin(val tickets: Int, val roundTrip: Int){
    fun print(){
        print("Total tickets: " + tickets + "\n" +
                "Round-trip: " + roundTrip + "\n" +
                "Total: " + ((tickets-roundTrip)*1000 + roundTrip*1800))
    }
}