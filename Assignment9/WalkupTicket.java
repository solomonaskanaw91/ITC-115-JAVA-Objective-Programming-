public class WalkupTicket extends tickets{
	private double ticketPrice;

	public WalkupTicket(int number) {
		super(number);//This is the call to tickets constructor  
		ticketPrice = 50.0;
	}
	@Override
	public double grabPrice() {
			return grabNumber() * ticketPrice;
	}
}
