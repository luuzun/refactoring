package dto;

import price.ChildrenPrice;
import price.NewReleasePrice;
import price.Price;
import price.PriceFactory;
import price.RegularPrice;

public class Movie {
	private String title;
	private Price price;
	
	public Movie(String title, int priceCode) throws IllegalAccessException {
		this.title = title;
	    setPriceCode(priceCode);
	}

	public int getPriceCode() {
		return price.getPriceCode();
	}

	public void setPriceCode(int priceCode) throws IllegalAccessException {
		price = PriceFactory.getPrice(priceCode);
	}

	public String getTitle() {
		return title;
	}

	public double getCharge(int daysRented){
		return price.getCharge(daysRented);
	}
	
	public int getFrequentRenterPoints(int aDaysRented) {
		return price.getFrequentRenterPoints(aDaysRented);
	}
}