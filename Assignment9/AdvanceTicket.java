//Represents a ticket purchased in advance
//if ticket is bought (10 days > event day)= cost of $30.00
//if ticket is bought (10 days < event day)= cost of $40.00
public class AdvanceTicket extends tickets{
	
		private double ticketPrice;

		public AdvanceTicket(int number, int daysBeforeEvent) {
		super(number);
		
		if(daysBeforeEvent < 10) {
				ticketPrice = 40.0;
		}else {
				ticketPrice = 30.0;
		}
	}
//Override super class to get the total price for ticket bought in advance
	@Override
	public double grabPrice() {
			return grabNumber() * ticketPrice;
	}
}


