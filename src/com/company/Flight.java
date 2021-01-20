package com.company;

public class Flight {
    private String FlightNumber;
    private String airline;
    private int capacity;
    private int bookedSeats;
    public Flight(String flightNumber,String airline,int capacity,int bookedSeats){
     this.FlightNumber=FlightNumber;
     this.airline=airline;
     this.capacity=capacity;
     this.bookedSeats=bookedSeats;
    }

 public void setFlightNumber(String flightNumber) {
  FlightNumber = flightNumber;
 }

 public void setAirline(String airline) {
  this.airline = airline;
 }

 public void setCapacity(int capacity) {
  this.capacity = capacity;
 }

 public void setBookedSeats(int bookedSeats) {
  this.bookedSeats = bookedSeats;
 }

 public String getFlightNumber() {
  return FlightNumber;
 }

 public String getAirline() {
  return airline;
 }

 public int getCapacity() {
  return capacity;
 }

 public int getBookedSeats() {
  return bookedSeats;
 }

// void gcheckFlightDetails(){
//     return; FlightNumber+" "+airline;
//    }
//    void checkAvailablity(){
//     return; capacity-bookedSeats;
//
//    }
    void incrementBookingCounter(){

    }
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", airlineName='" + airlineName + '\'' +
                ", capacity=" + capacity +
                ", bookedSeats=" + bookedSeats +
                '}';
    }

}
