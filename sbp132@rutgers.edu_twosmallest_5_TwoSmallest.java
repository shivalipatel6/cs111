/*************************************************************************
 *  Compilation:  javac TwoSmallest.java
 *  Execution:    java TwoSmallest 1.1 6.9 0.3
 *
 *  @author: Shivali Patel; sbp132@scarletmail.rutgers.edu ; 195000927 
 *
 *
 *  The program TwoSmallest takes a set of double command-line
 *  arguments and prints the smallest and second-smallest number, in that
 *  order. It is possible for the smallest and second-smallest numbers to
 *  be the same (if the sequence contains duplicate numbers).
 *
 *  Note: display one number per line
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  1.1
 *
 *  % java TwoSmallest 17.0 23.0 5.0 1.1 6.9 0.3
 *  0.3
 *  0.3
 /*int size = Integer.parseInt(args[0]);
double[] a = new double[size];
int c;

for(int i = 0; i<size; i++){
	c = i +1;
	a[i] = Double.parseDouble(args[c]);
	}// end for loop
double min = a[0];

double temp;
	for(int i = 0; i<size; i++){
		if(min > a[i]){
			min = a[i];
			temp = a[0];
			a[0] = a[i];
			a[i] = temp;
		}// end if statement
	}// end for loop
double sndSmllst = a[1];
for(int i = 1; i<size; i++){
		if(sndSmllst > a[i]){
			sndSmllst = a[i];

		}// end if statement
	}// end for loop

		System.out.println(min);
		System.out.println(sndSmllst);


 *************************************************************************/

public class TwoSmallest {

    public static void main(String[] args) {

int temp = 0;
double min = Double.parseDouble(args[0]);
	for(int i = 0; i<args.length; i++){
		if(min > Double.parseDouble(args[i])){
			min = Double.parseDouble(args[i]);
			temp = i;
			//temp = Double.parseDouble(args[0]);
			//args[0] = Double.parseDouble(args[i]);
			//args[i] = temp;
		}// end if statement
	}// end for loop
double sndSmllst = Double.MAX_VALUE;
for(int i = 0; i<args.length; i++){
		if(i!= temp && sndSmllst > Double.parseDouble(args[i])   ) {
			sndSmllst = Double.parseDouble(args[i]);

		}// end if statement
	}// end for loop

		System.out.println(min);
		System.out.println(sndSmllst);




    }// end main

}// end TwoSmallest
