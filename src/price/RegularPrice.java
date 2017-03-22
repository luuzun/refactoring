package price;

import dto.Movie;

public class RegularPrice extends Price{

	@Override
	public int getPriceCode() {
		return ReGULAR;
	}

	public double getCharge(int daysRented){
		double result = 2000;
		if (daysRented > 2) {
			result += (daysRented - 2) * 1500;
		}
		return result;
	}
}
