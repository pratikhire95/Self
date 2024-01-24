package Ms1_Day2;

public class Address{
    String street;
    String city;
    String country;
    int pincode;

    public void displayAddress(){
        System.out.println("Street: " + street);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("Pincode: " + pincode);
    }
}