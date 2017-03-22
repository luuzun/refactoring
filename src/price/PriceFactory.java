package price;

public class PriceFactory{
	public static Price getPrice(int priceCode) throws IllegalAccessException{
		Price price;
		switch(priceCode){
		case Price.CHLDRENS:
			price = new ChildrenPrice();
			break;
		case Price.ReGULAR:
			price =  new RegularPrice();
			break;
		case Price.NEW_RELEASE:
			price =  new NewReleasePrice();
			break;
		case Price.ADULT:
			price = new AdultPrice();
			break;
		default:
			throw new IllegalAccessException("가격 코드가 잘못 입력됨");
		}
		return price;
	}
}
