/*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *  @author:
 *
 *************************************************************************/

public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) {
    	if (n==0){
    		return original;
    	}// end if 

    		return appendNTimes(original,n-1) + original;
    }// end appendNTimes

    public static void main (String[] args) {
    	int n = Integer.parseInt(args[0]);
    StdOut.print(appendNTimes("cat",n));



    }// end main
}// end RecursiveAppend
