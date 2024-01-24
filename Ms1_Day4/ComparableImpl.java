package Ms1_Day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ComparableImpl {
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

        
        System.out.println("\nSorted vy Year");
        Collections.sort(list);
        for(Movie movie: list){
            System.out.println(movie.getYear()+ " "+ movie.getRating()+ " "+ movie.getName());
        }

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
    // @Override
    // public int compareTo(Movie m){
    //     return m.year - this.year;
    // }
    @Override
    public int compareTo(Movie m){
        if(this.getRating() < m.getRating())
            return -1;
        if(this.getRating() > m.getRating())
            return 1;
        return 0;
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
