/*************************************************************************
 *  Compilation:  javac LuckySevens.java
 *  Execution:    java LuckySevens 421
 *
 *  @author: Shivali Patel; sbp132@scarletmail.rutgers.edu ; 195000927 
 *
 * LuckySevens takes an int as a command-line argument and displays
 * how many digits in the integer number are 7s.  
 *
 * Note: the number can be negative.
 *
 *  % java LuckySevens 3482
 *  0
 *
 *  % java LuckySevens 372777
 *  4
 * 
 *  % java LuckySevens -2378272
 *  2
 *************************************************************************/

public class LuckySevens {

    public static void main(String[] args) {
int nbr = Integer.parseInt(args[0]);
int nbrOfSevens = 0;
 if(nbr < 0){
nbr = nbr * -1;
 }// end if statement

while(nbr > 0){
	if(nbr % 10 == 7){
		nbrOfSevens++; 
	}// end if statement
	nbr =(nbr - (nbr %10))/10;
}// end while statement
	System.out.println(nbrOfSevens);
 
    }// end main

}// end LuckySevens
