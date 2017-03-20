
public class Rental {
	private int daysREnted;
	private Movie movie;
	
	public Rental(int daysREnted, Movie movie) {
		this.daysREnted = daysREnted;
		this.movie = movie;
	}
	public int getDaysREnted() {
		return daysREnted;
	}
	public void setDaysREnted(int daysREnted) {
		this.daysREnted = daysREnted;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
}
