package com.company;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
    String[] locations={"a","b","c","d","e"};
        Flight obj=new Flight("121","a",123,12);
        Passanger p=new Passanger("21","a","MP","Raj","0001230012","raj@gmail.com");
        TouristTicket touristTicket=new TouristTicket("A1245754","In","Dl","21", LocalDateTime.now(),LocalDateTime.now().plus(45),"p","45241","4500",false);
        RegularTicket regularTicket=new RegularTicket("s4541245","de","In","45",LocalDateTime.now(),LocalDateTime.now().plusHours(10),"ls","45121","2000",false);
        printTicketDetails(touristTicket);
        printTicketDetails(regularTicket);
    }
    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPNR());


}
}



