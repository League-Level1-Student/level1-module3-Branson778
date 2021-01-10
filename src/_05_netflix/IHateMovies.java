package _05_netflix;

public class IHateMovies {

public static void main(String[] args) {
	Movie longname = new Movie("The Movie That Has The Longest Movie Name Evers It's A World Record Oh Yeah It's Great Five Star Movie So Good!", 5);
	Movie shortestmovienameever = new Movie("m", 5);
	Movie TerrariaTheMovie = new Movie("Terraria The Movie", 6);
	Movie trash = new Movie("Twilight Train Ride", 0);
	Movie movie = new Movie("Movie Madness: The Good, The Bad, And The Stock", 5);
	String oohyea = TerrariaTheMovie.getTicketPrice();
	System.out.println(oohyea);
	String oohyea2 = longname.getTicketPrice();
	System.out.println(oohyea2);
	String oohyea3 = shortestmovienameever.getTicketPrice();
	System.out.println(oohyea3);
	String oohyea4 = trash.getTicketPrice();
	System.out.println(oohyea4);
	String oohyea5 = movie.getTicketPrice();
	System.out.println(oohyea5);
	NetflixQueue superoverpriced = new NetflixQueue();
	superoverpriced.addMovie(longname);
	superoverpriced.addMovie(shortestmovienameever);
	superoverpriced.addMovie(TerrariaTheMovie);
	superoverpriced.addMovie(trash);
	superoverpriced.addMovie(movie);
	superoverpriced.printMovies();
	superoverpriced.sortMoviesByRating();
Movie stap =	superoverpriced.getBestMovie();
System.out.println("The best movie is "+ stap+ ".");
	Movie staaaaaaaaap = superoverpriced.getMovie(1);
	System.out.println("The second best movie is "+ staaaaaaaaap+ ".");
}
}
