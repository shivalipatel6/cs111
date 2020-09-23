/*************************************************************************
 *  Compilation:  javac HadamardMatrix.java
 *  Execution:    java HadamardMatrix 2
 *
 *  @author: Shivali Patel sbp132@scarletmail.rutgers.edu 195000927
 *
 * The program HadamardMatrix prints H(n)
 *
 *  % java HadamardMatrix 2
 *  T T
 *  T F
 *
 *************************************************************************/

public class HadamardMatrix {

    public static void main(String[] args) {
int n = Integer.parseInt(args[0]); 
boolean[][] hadamard = new boolean[n][n];
hadamard[0][0] = true;

for(int a = 1; a< n; a = a + a){	
	
for (int b = 0; b< a; b ++){
	for(int c = 0; c<a; c++){
hadamard[b][c]= hadamard[b][c]; 		
hadamard[b + a][c]= hadamard[b][c]; 
hadamard[b][c + a]= hadamard[b][c];
hadamard[b +a][c + a]= !hadamard[b][c];

	}// end for loop c

}// end for loop b

}// end for loop a





//*************Printing System*******************************
for (int b = 0; b< hadamard.length; b ++){
	for(int c = 0; c< hadamard.length; c++){
		if(hadamard[b][c] == true){
			System.out.print('T');
		}// end if 
		else{
			System.out.print('F');
		}// end if 

//System.out.print(hadamard[b][c]);
	}// end for loop b
	System.out.println();
}// end for loop c


    }// end main
}// end HadamardMatrix
