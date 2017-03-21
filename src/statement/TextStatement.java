package statement;
import dto.Customer;
import dto.Rental;

public class TextStatement extends Statement{
	protected Object footerString(Customer customer) {
		return String.format("누적대여료: %s%n적립포인트 : %s%n", customer.getTotalCharge(), customer.getFrequentRenterPoints());
	}
	protected Object eachRentalString(Rental each) {
		return String.format("\t%s \t %s%n", each.getMovie().getTitle(), each.getCharge()); 
	}
	protected Object headerString(String customerName) {
		return customerName +"고객님의 대여기록\n";
	}
}