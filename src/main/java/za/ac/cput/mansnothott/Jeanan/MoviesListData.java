package Jeanan;

import Jeanan.MoviesList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MovieListData {


    public static void main(String[] args) {
        MovieList c1 = new MovieList();
        c1.setVinNum(11);
        c1.setModel("Horror");

        MovieList c2 = new MovieList();
        c2.setVinNum(22);
        c2.setModel("Comedy");

        MovieList c3 = new MovieList();
        c3.setVinNum(33);
        c3.setModel("Romance");

        MovieList c4 = new MovieList();
        c4.setVinNum(33);
        c4.setModel("Sci-fi");

        List AllowingMovieDuplicates = new ArrayList();
        AllowingMovieDuplicates.add(c1);
        AllowingMovieDuplicates.add(c2);
        AllowingMovieDuplicates.add(c3);
        AllowingMovieDuplicates.add(c4);

        System.out.println("The Movies in the list are " + AllowingMovieDuplicates.size());


        Set NoMovieDuplicates = new HashSet();
        NoMovieDuplicates.add(c1);
        NoMovieDuplicates.add(c2);
        NoMovieDuplicates.add(c3);
        NoMovieDuplicates.add(c4);

        System.out.println("The Movies in the list are  " + NoMovieDuplicates.size());

    }


}