/*************************************************************************
 *  Compilation:  javac WCS111FM.java
 *  Execution:    java WCS111FM 53
 *
 *  The program takes the number of hours the listener spends
 *  programming as an int argument. Based on the number of hours spent
 *  programming, display the listener prize
 *
 *  @author: Shivali Patel; sbp132@scarletmail.rutgers.edu ; 195000927 
 *
 *  % java WCS111FM 3
 *  T-shirt
 *
 *  % java WCS111FM 9
 *  Laptop
 *  TV
 * 
 *  % java WCS111FM 0
 *  Nothing
 *************************************************************************/

public class WCS111FM {

    public static void main(String[] args) {
int hoursOfProgramming = Integer.parseInt(args[0]);

if(hoursOfProgramming <= 0){
	System.out.println("Nothing");
}// end if statement
else if (hoursOfProgramming >= 1 && hoursOfProgramming <= 5){
	System.out.println("T-shirt");
}// end else if statement
else if(hoursOfProgramming >= 6 && hoursOfProgramming <= 400){
	if(hoursOfProgramming % 10 == 9){
		System.out.println("Laptop");
	}// end if statement
	if(hoursOfProgramming % 2 == 0){
		System.out.println("Hat");
	}// end if statement
	if(hoursOfProgramming % 3 == 0){
		System.out.println("TV");
	}// end if else statement
}// end else if statement 
else if (hoursOfProgramming > 400){
	System.out.println("Cat");
}// end if else statement

    }// end main

}// enf WCS111FM
