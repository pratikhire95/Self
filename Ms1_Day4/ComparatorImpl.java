package Ms1_Day4;

import java.util.*;

public class ComparatorImpl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Movie> list = new ArrayList<Movie>();
        for(int i = 0; i < 2; i++){
            String name = in.nextLine();
            double rating = in.nextDouble();
            int year = in.nextInt();
            in.nextLine();
            list.add(new Movie(name, rating, year));
        }
        in.close();

        
        System.out.println("\nSorted vy Year");
        Collections.sort(list,new RatingCompare());
        for(Movie movie: list){
            System.out.println(movie.getYear()+ " "+ movie.getRating()+ " "+ movie.getName());
        }
        Collections.sort(list,new NameCompare());
        for(Movie movie: list){
            System.out.println(movie.getYear()+ " "+ movie.getRating()+ " "+ movie.getName());
        }
        Collections.sort(list);
        for(Movie movie: list){
            System.out.println(movie.getYear()+ " "+ movie.getRating()+ " "+ movie.getName());
        }

    }
}

class RatingCompare implements Comparator<Movie>{
    public int compare(Movie m1, Movie m2){
        if(m1.getRating() < m2.getRating())
            return -1;
        if(m1.getRating() > m2.getRating())
            return 1;
        return 0;
    }
}
class NameCompare implements Comparator<Movie>{
    public int compare(Movie m1, Movie m2){
        return m1.getName().compareTo(m2.getName());
    }
}


class Movie implements Comparable<Movie> {
    private double rating;
    private String name;
    private int year;

 //Constructor
    public Movie(String nm, double rt, int yr){
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }
    //Used to Sort movies by year
    @Override
    public int compareTo(Movie m){
        return m.year - this.year;
    }
    
    //gettter and setters
    public double getRating(){
        return rating;
    }
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }
}
