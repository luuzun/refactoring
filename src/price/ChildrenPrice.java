package price;

import dto.Movie;

public class ChildrenPrice extends Price{

	@Override
	public int getPriceCode() {
		return CHLDRENS;
	}

	public double getCharge(int daysRented){
		double result = 1500;
		if (daysRented > 3) {
			result += (daysRented - 3) * 1500;
		}

		return result;
	}
}
