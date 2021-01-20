package com.company;

import java.time.LocalDateTime;

public class TouristTicket extends Ticket{
   private String hotelAddress;
   private String[] selectTouristLocation=new String[5];
   public TouristTicket(String PNR, String from, String to, String seatno, LocalDateTime departureDateTime, LocalDateTime arrivalDateTime, Passanger passanger, Flight flight, float price, boolean iscancelled) {
       super(PNR, from, to, departureDateTime, arrivalDateTime, passanger, seatno, iscancelled, price, flight);
       this.hotelAddress = hotelAddress;
       this.selectTouristLocation = selectTouristLocation;
   }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getSelectTouristLocation() {
        return selectTouristLocation;
    }

    public void setSelectTouristLocation(String[] selectTouristLocation) {
        this.selectTouristLocation = selectTouristLocation;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }
   public String[] getTouristLocations(){

       return selectTouristLocation;
   }

   public void removeTouristLocation(String Location){

   }
   public void addTouristLocation(String Location){

   }
    public String toString() {
        return "TouristTicket{" +
                "hotelAddress='" + hotelAddress + '\'' +
                ", selectedTouristLocation=" + Arrays.toString(selectedTouristLocation) +
                '}';
    }
}
