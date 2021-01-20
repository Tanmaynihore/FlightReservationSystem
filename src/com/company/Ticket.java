package com.company;

import java.time.Duration;
import java.time.LocalDateTime;

abstract class Ticket {
   private String PNR;
    private String from;
    private String to;
    private Flight flight;
    private Passanger passanger;
    private LocalDateTime departureDateTime;
    private LocalDateTime arrivalDateTime;
    private String seatno;
    private float price;
    private boolean iscancelled;

    public String getPNR() {
        return PNR;
    }

    public void setPNR(String PNR) {
        this.PNR = PNR;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passanger getPassanger() {
        return passanger;
    }

    public void setPassanger(Passanger passanger) {
        this.passanger = passanger;
    }

    public LocalDateTime getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(LocalDateTime departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public LocalDateTime getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getSeatno() {
        return seatno;
    }

    public void setSeatno(String seatno) {
        this.seatno = seatno;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isIscancelled() {
        return iscancelled;
    }

    public void setIscancelled(boolean iscancelled) {
        this.iscancelled = iscancelled;
    }

    public Ticket(String PNR, String from, String to, Flight flight, Passanger passanger, LocalDateTime departureDateTime, LocalDateTime arrivalDateTime, String seatno, float price, boolean iscancelled) {
        this.PNR = PNR;
        this.from = from;
        this.to = to;
        this.flight = flight;
        this.passanger = passanger;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatno = seatno;
        this.price = price;
        this.iscancelled = iscancelled;
    }

    String checkStatus(){
        if (iscancelled==true){
            return "Flight Cancelled";
        }
        else{
            return "Flight Confirmed";
        }
    }
    public long getDuration(){
        Duration duration=Duration.between(arrivalDateTime,departureDateTime);
        long diff =Math.abs(duration.toHours());
        return diff;
    }
    void cancel(){
        iscancelled=true;

    }
    public String toString() {
        return "Ticket{" +
                "PNRNumber='" + PNR + '\'' +
                ", departureLocation='" + departureLocation + '\'' +
                ", destinationLocation='" + destinationLocation + '\'' +
                ", arrival=" + arrival +
                ", destination=" + destination +
                ", passenger=" + passenger +
                ", seatNo='" + seatNo + '\'' +
                ", isCancled=" + isCancled +
                ", price=" + price +
                ", flight=" + flight +
                '}';
    }
}
