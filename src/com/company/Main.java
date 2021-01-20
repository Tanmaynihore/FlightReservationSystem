package com.company;
public class Main {

    public static void main(String[] args) {

        Flight obj=new Flight();
        System.out.println(obj.FlightNumber);
        TouristTicket touristTicket=new TouristTicket();
        RegularTicket regularTicket=new RegularTicket();
        printTicketDetails(touristTicket);
        printTicketDetails(regularTicket);
    }
    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.PNR);


}
}



