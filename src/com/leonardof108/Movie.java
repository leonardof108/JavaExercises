package com.leonardof108;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println("Watching " + instanceType + " " + title);
    }

    public static Movie getMovie(String type, String title) {
        switch (type.toUpperCase().charAt(0)) {
            case 'A':
                return new AdventureMovie(title);
            case 'C':
                return new ComedyMovie(title);
            case 'D':
                return new DramaMovie(title);
            default:
                return new Movie(title);
        }
    }
}

class AdventureMovie extends Movie {
    public AdventureMovie(String title) {
        super(title);
    }
}

class ComedyMovie extends Movie {
    public ComedyMovie(String title) {
        super(title);
    }
}

class DramaMovie extends Movie {
    public DramaMovie(String title) {
        super(title);
    }
}

class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("The Godfather");
        movie.watchMovie();

        Movie adventureMovie = new AdventureMovie("Indiana Jones");
        adventureMovie.watchMovie();

        Movie comedyMovie = new ComedyMovie("The Hangover");
        comedyMovie.watchMovie();

        Movie dramaMovie = new DramaMovie("The Shawshank Redemption");
        dramaMovie.watchMovie();

        Movie theMovie = Movie.getMovie("adventure", "The Lord of the Rings");
        theMovie.watchMovie();
    }
}