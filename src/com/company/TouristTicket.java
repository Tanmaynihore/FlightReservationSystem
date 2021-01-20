package com.company;

public class TouristTicket extends Ticket{
   public String hotelAddress;
    public String[] selectTouristLocation;

    public String getHotelAddress() {
        return hotelAddress;
    }
   public String[] getTouristLocations(){

       return new String[0];
   }
   TouristTicket()
   {
       super() ;
   }
   public void removeTouristLocation(String Location){

   }
   public void addTouristLocation(String Location){

   }
}
