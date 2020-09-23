/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author:Shivali Patel sbp132@scarletmail.rutgers.edu 195000927
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker {

    public static void main(String[] args) {
int n = Integer.parseInt(args[0]); 
int xCoordinate = 0;
int yCoordinate = 0;
int probCntr;
double distance;

System.out.println("(" + xCoordinate +"," + yCoordinate + ")");
for(int i =0; i < n; i++ ){
probCntr=(int)(Math.random()*4);
//System.out.print(probCntr);
if(probCntr==0){	
xCoordinate = xCoordinate + 1;
}// end else statement north

if(probCntr== 1){	
xCoordinate = xCoordinate - 1;
}// end else statement south

if(probCntr == 2){
yCoordinate = yCoordinate +1;
	}// end if statement east
if(probCntr == 3){
yCoordinate = yCoordinate -1;
	}// end else statement west

System.out.println("(" + xCoordinate +"," + yCoordinate + ")");

}// end for loop
distance = Math.pow(xCoordinate,2) + Math.pow(yCoordinate, 2);
System.out.print("Squared distance = " + distance);
    }// end main
}// end RandomWAlker
