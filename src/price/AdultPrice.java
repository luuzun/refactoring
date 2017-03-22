package price;

public class AdultPrice extends Price{

	@Override
	public int getPriceCode() {
		return ADULT;
	}

	@Override
	public double getCharge(int daysRented) {
		return daysRented * 5000;
	}

	@Override
	public int getFrequentRenterPoints(int aDaysRented) {
		return (aDaysRented>1) ? 3:2;
	}
}
