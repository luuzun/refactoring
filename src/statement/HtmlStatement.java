package statement;
import dto.Customer;
import dto.Rental;

public class HtmlStatement extends Statement{
	protected Object footerString(Customer customer) {
		return String.format("<p>누적대여료: <em>%s</em>%n<p>적립포인트 : <em>%s</em></p>%n", customer.getTotalCharge(), customer.getFrequentRenterPoints());
	}
	protected Object eachRentalString(Rental each) {
		return String.format("nbsp;nbsp;\t%s \t %s<br>%n", each.getMovie().getTitle(), each.getCharge()); 
	}
	protected Object headerString(String customerName) {
		return customerName +"고객님의 대여기록</ed></h1><p>\n";
	}
}