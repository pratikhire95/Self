package Ms1_Day2;
import Ms1_Day2.Address;
import java.util.Scanner;
import Ms1_Day2.Setters;



public class Oops_classes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Address ads = new Address();
        ads.street = in.nextLine();
        ads.city = in.nextLine();
        ads.country = in.nextLine();
        ads.pincode = in.nextInt();
        
        ads.displayAddress();

        in.next();
        
        String name = in.nextLine();
        String type = in.nextLine();
        String email = in.nextLine();
        String location = in.nextLine();

        ConstructorExample ce = new ConstructorExample(name, email, type, location);
        System.out.println("Name is " + ce.getName());
        System.out.println("Email is " + ce.getEmail());
        System.out.println("Type is " + ce.getType());
        System.out.println("Location is " + ce.getLocation());

    }
}
