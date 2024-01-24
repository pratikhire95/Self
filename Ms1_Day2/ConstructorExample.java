package Ms1_Day2;

public class ConstructorExample {
    private String name;
    private String type;
    private String email;
    private String location;

    public ConstructorExample(String a, String b, String c, String d){
        name = a;
        email = b;
        type = c;
        location = d;
    }

    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public String getEmail(){
        return email;
    }
    public String getLocation(){
        return location;
    }
}
