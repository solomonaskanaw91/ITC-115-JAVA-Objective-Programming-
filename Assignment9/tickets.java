//This would be the ticket for the campus main event. 
 
import java.text.NumberFormat;

public abstract class tickets {
	
private int number;
	
	public tickets(int number) {
		this.number = number;
	}
	
	public int grabNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}

	// abstract method to be implemented in sub classes
	public abstract double grabPrice();
	
	// method to format price
	public String formatPrice() {
        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.grabPrice());
        return formattedPrice;
	}
	
	// print as String
	@Override     // override Object class
	public String toString() {
		return ("Number: " + number + ", Price: " + formatPrice());
	}

}















