/*************************************************************************
 *  Compilation:  javac Gas.java
 *  Execution:    java Gas 3.40 15.0 true
 *
 *  @author: Shivali Patel; sbp132@scarletmail.rutgers.edu ; 195000927 
 *
 * The program Gas computes and displays the price a
 * person will pay for gas at the gas station.
 *
 *  % java Gas 3.40 15.0 false
 *  56.1
 *
 *  % java Gas 3.40 15.0 true
 *  51.0
 *   cash is true credit is false   -> credit card has an extra charge
 *
 *************************************************************************/

public class Gas {

    public static void main(String[] args) {
double prcPerGallon = Double.parseDouble(args[0]);
double nbrOfGas = Double.parseDouble(args[1]);
boolean cashOrCredit = Boolean.parseBoolean(args[2]);
double prcOfGas;


if(prcPerGallon <= 0 || nbrOfGas <= 0){
	System.out.print("Illegal input"); 
}// end if statement
else {
	prcOfGas = prcPerGallon * nbrOfGas;
	if(cashOrCredit == false){
		prcOfGas = prcOfGas + (prcOfGas*0.1);
	}// end inner if statement
	System.out.print(prcOfGas); 
}// end else statement 


	



    }// end main
}// end Gas
