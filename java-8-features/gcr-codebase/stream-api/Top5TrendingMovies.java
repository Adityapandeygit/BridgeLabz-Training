package java_8_features.stream_Api;

import java.time.LocalDate;
import java.util.*;

class Movie {
    String movieName;
    int rating;
    LocalDate releaseDate;

    Movie(String movieName, int rating, LocalDate releaseDate) {
        this.movieName = movieName;
        this.rating = rating;
        this.releaseDate = releaseDate;
    }
}

public class Top5TrendingMovies {
    public static void main(String[] args) {

        List<Movie> m = new ArrayList<>();

        m.add(new Movie("Dhurandar", 5, LocalDate.of(2025, 2, 6)));
        m.add(new Movie("Avengers Endgame", 5, LocalDate.of(2019, 4, 26)));
        m.add(new Movie("Inception", 5, LocalDate.of(2010, 7, 16)));
        m.add(new Movie("Interstellar", 5, LocalDate.of(2014, 11, 7)));
        m.add(new Movie("Jawan", 4, LocalDate.of(2023, 9, 7)));
        System.out.println("Top 5 movie based on rating ");
        m.stream()
         .sorted((a, b) -> b.rating - a.rating)
         .limit(5)
         .forEach(movie -> System.out.println(movie.movieName));
        
        System.out.println("Top 5 movie bassed on release date");
        m.stream().sorted((a,b) -> b.releaseDate.compareTo(a.releaseDate)).limit(5).forEach(movie -> System.out.println(movie.movieName));
        
        
    }
}
