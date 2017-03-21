package dto;
import java.util.ArrayList;
import java.util.List;

import statement.HtmlStatement;
import statement.Statement;
import statement.TextStatement;

public class Customer {
	private String name;
	private List<Rental> rentals;
	
	public Customer(String name) {
		this.name = name;
		this.rentals = new ArrayList<>();
	}

	public String getName() {
		return name;
	}
	
	public void addRental(Rental aRental){
		this.rentals.add(aRental);
	}
	
	public List<Rental> getRentals() {
		return rentals;
	}

	public int getFrequentRenterPoints() {
		int frequentRenterPoints = 0;//적립포인트
		for(Rental each : rentals){
			frequentRenterPoints += each.getFrequentRenterPoints();
		}
		return frequentRenterPoints;
	}

	public double getTotalCharge() {
		double result = 0.0;//대여료
		for(Rental each : rentals){
			result += each.getCharge();
		}
		return result;
	}

	public String textStatement() {
		Statement stmt = new TextStatement();
		return stmt.value(this);
	}

	public String htmlStatement() {
		Statement stmt = new HtmlStatement();
		return stmt.value(this);
	}
}