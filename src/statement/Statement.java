package statement;

import java.util.List;

import dto.Customer;
import dto.Rental;

public abstract class Statement {
	public String value(Customer customer){
		StringBuilder sb = new StringBuilder();
		sb.append(headerString(customer.getName()));

		List<Rental> rentals = customer.getRentals();
		for(Rental each : rentals){
			sb.append(eachRentalString(each));
		}

		sb.append(footerString(customer));
		return sb.toString();
	}
	
	protected abstract Object footerString(Customer customer);
	protected abstract Object eachRentalString(Rental each);
	protected abstract Object headerString(String customerName);
}
