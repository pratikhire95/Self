package Ms1_Day2;

public class Setters {
    private String name;
    private int type;
    private String country;
    public Setters(String a, int b, String c){
        name = a;
        type = b;
        country = c;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setType(int type){
        this.type = type;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getName(){
        return name;
    }
    public int getType(){
        return type;
    }
    public String getCountry(){
        return country;
    }
    
}
