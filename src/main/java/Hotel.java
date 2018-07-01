package Bedrooms;

import java.util.ArrayList;

public class Hotel {

    public String hotelName;
    protected ArrayList<bedRooms> bedRooms;
    protected ArrayList<functionRooms> functionRooms;
    protected ArrayList<guests> guests;
    private double hotelTill;


    public Hotel(String hotelName, ArrayList<bedRooms>, ArrayList<functionRooms>, ArrayList<guests>, double) {
        this.hotelName = hotelName;
        this.bedRooms = new ArrayList<bedRooms>();
        this.functionRooms = new ArrayList<functionRooms>();
        this.guests = new ArrayList<guests>();
        this.hotelTill = hotelTill;
    }

    public String getHotelName() {
        return this.hotelName();
    }

    public int hotelFull() {
        return this.bedRooms.size();
    }

    public int noFunctionRooms() {
        return this.functionRooms.size();
    }

}

