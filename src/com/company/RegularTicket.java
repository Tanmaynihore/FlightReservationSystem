package com.company;

import java.time.LocalDateTime;

public class RegularTicket extends Ticket{
    private String specialServices;
   RegularTicket(String PNR,String from,String to,String seatno,LocalDateTime departureDateTime,LocalDateTime arrivalDateTime,Passanger passanger,Flight flight,float price,boolean iscancelled){
       super(PNR,from,to,departureDateTime,arrivalDateTime,passanger,seatno,iscancelled,price,flight);
       this.specialServices=specialServices;
   }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }

    public String getSpecialServices(){

        return specialServices;
    }
    void updateSpecialServices(String specialServices) {
        this.specialServices=specialServices;

    }
    public String toString() {
        return "RegularTicket{" +
                "specialService='" + specialService + '\'' +
                '}';
    }
}
