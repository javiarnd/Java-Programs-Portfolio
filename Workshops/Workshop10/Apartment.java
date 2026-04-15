package Workshops.Workshop10;

public class Apartment {
    String city;
    int numBedrooms;
    int numBathrooms;
    double monthlyRent;
    
    public Apartment(String aCity, int aBedrooms, int aBathrooms, double aRent) {
    city = aCity;             
    numBedrooms = aBedrooms;
    numBathrooms = aBathrooms;
    monthlyRent = aRent;
    }    
    
    public void displayApartment(){
        System.out.println("City: " + city);
        System.out.println("Number of Bedrooms: " + numBedrooms);
        System.out.println("Number of Bathrooms: " + numBathrooms);
        System.out.println("Monthly Rent: $" + monthlyRent);
    }
}

class TestApartment {
    public static void main(String[] args) {
        Apartment apt1 = new Apartment("New York", 3, 2, 3500.00);
        apt1.displayApartment();
        Apartment apt2 = new Apartment("Chicago", 2, 1, 2500.00);
        apt2.displayApartment();
    }
}
