package price;

import dto.Movie;

public class NewReleasePrice extends Price{

	@Override
	public int getPriceCode() {
		return NEW_RELEASE;
	}

	public double getCharge(int daysRented){
		return daysRented * 3000;
	}
	
	public int getFrequentRenterPoints(int aDaysRented) {
		return (aDaysRented >1) ? 2:1;
	}
}
