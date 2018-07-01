

public class Hotel {

    public String hotelName;
    protected ArrayList<Bedrooms> bedrooms;
    protected ArrayList<FunctionRooms> functionRooms;
    private double hotelTill;


    public Hotel(String hotelName, ArrayList<Bedrooms>, ArrayList<FunctionRooms>, double) {
        this.hotelName = hotelName;
        this.bedrooms = new ArrayList<Bedrooms>();
        this.functionRooms = new ArrayList<FunctionRooms>();
        this.hotelTill = hotelTill;
    }


    public String getHotelName() { return hotelName; }


    }
}

