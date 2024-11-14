package org.example;

public class Ticket {

    private String tickets;
    private String ticketsCountryOfDeparture;
    private String ticketsСountryOfArrival;
    private String ticketsDepartureDate;
    private String ticketsArrivalDate;
    private String ticketsPrice;
    private final int CORRECT_NUMBER_INDEX;

    public Ticket(int correctNumberIndex) {
        CORRECT_NUMBER_INDEX = correctNumberIndex;
    }

    public String getTickets() {
        return tickets;
    }

    public String getTicketsCountryOfDeparture() {
        return ticketsCountryOfDeparture;
    }

    public String getTicketsСountryOfArrival() {
        return ticketsСountryOfArrival;
    }

    public String getTicketsDepartureDate() {
        return ticketsDepartureDate;
    }

    public String getTicketsArrivalDate() {
        return ticketsArrivalDate;
    }

    public String getTicketsPrice() {
        return ticketsPrice;
    }
}

