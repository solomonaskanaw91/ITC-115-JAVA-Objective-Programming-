//This would be client for the class tickets 
public class TicketMain {

	public static void main(String[] args) {
//This is the array for tickets for (Ticket,WalkupTicket & AdvanceTicket)
		tickets[] tickets = new tickets[4];
		tickets[0] =  new WalkupTicket(6);
		tickets[1] =  new WalkupTicket(1);
		tickets[2] =  new AdvanceTicket(1,12);
		tickets[3] =  new AdvanceTicket(1,8);
	
//print ticket information in the format of tickets to string
		for (int i = 0; i < tickets.length; i++) {
				System.out.println(tickets[i].toString());
				System.out.println();
		}
	
	}
}
