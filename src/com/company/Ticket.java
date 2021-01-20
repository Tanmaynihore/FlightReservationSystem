package com.company;

abstract class Ticket {
    String PNR;
    String from;
    String to;
    String departureDateTime;
    String arrivalDateTime;
    String seatno;
    float price;
    boolean cancelled;
//    public String getPNR(){
//        return PNR;
//    }
    Ticket(){
        Flight flight=new Flight();
        Passanger passanger=new Passanger();
    }
    String checkStatus(){
        return null;
    }
    int getDuration(){
        return 0;
    }
    void cancel(){

    }
}
