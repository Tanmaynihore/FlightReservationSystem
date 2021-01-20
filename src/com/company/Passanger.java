package com.company;

public class Passanger {
    int id;
    private static int idCounter=0;
    public int getIdCounter() {
        return idCounter;
    }

    public void setId(int idCounter) {
        
        this.idCounter = idCounter;
    }
    Passanger(){
        Address address=new Address();
        Contact contact=new Contact();
    }
    Passanger(int id){
        this.id=id;
        idCounter++;
    }
    private int getPassangerCount(){
    return idCounter;
    }

    String getContactDetails(){

        return null;
    }
    public void updateContactDetails(String contactDetails){

    }


}

