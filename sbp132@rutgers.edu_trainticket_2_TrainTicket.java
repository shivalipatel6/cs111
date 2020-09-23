/*************************************************************************
 *  Compilation:  javac TrainTicket.java
 *  Execution:    java TrainTicket
 *
 *  @author: Shivali Patel; sbp132@scarletmail.rutgers.edu ; 195000927 
 *
 * The program TrainTicket takes two command-line arguments: an int
 * referring to the persons age and a boolean referring to whether or
 * not the ticket was bought at the train station (true for a ticket
 * bought at the train station). The program computes and displays the
 * ticket price the person needs to pay for the train ride.
 *
 *  % java TrainTicket 23.0 true
 *  13.20
 *
 *  % java TrainTicket 23.0 false
 *  15.84
 * 
 *  % java TrainTicket 230 false
 *  Illegal input
 *
 *************************************************************************/

public class TrainTicket {

    public static void main(String[] args) {
int age = Integer.parseInt(args[0]);
boolean buyWhere = Boolean.parseBoolean(args[1]);
double ticketPrice;

	if(age < 0 || age > 120){
	System.out.print("Illegal input"); 
	}// end if statement
	else {
		if(age<7) {
			ticketPrice = 0;
		}// end if statement
		else if(age >65){
			ticketPrice = 7.50;
		}// end elseif statement
		else{
			ticketPrice = 13.20;
		}// end else statement
			if(buyWhere == false){
				ticketPrice = ticketPrice + (ticketPrice*0.20);
			}// end if else statement
	System.out.println(ticketPrice);

	}// end if else statement

    }// end main

}// end TrainTicket
