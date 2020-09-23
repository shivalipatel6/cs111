/*************************************************************************
 *  Compilation:  javac Sierpinski.java
 *  Execution:    java Sierpinski
 *
 *  @author:
 *
 *************************************************************************/

public class Sierpinski {

    // Height of an equilateral triangle whose sides are of the specified length. 
    public static double height(double length) {
double height = (Math.sqrt(3.0)/2) * length;
	return height;

    }// end height

    // Draws a filled equilateral triangle whose bottom vertex is (x, y) 
    // of the specified side length. 
    public static void filledTriangle(double x, double y, double length) {
double[] xCord = new double[3];
double[] yCord = new double [3];
xCord[0]= x;
xCord[1] = x + (length/2);
xCord[2] = x - (length/2);
yCord[0]= y;
yCord[1] = y + height(length);
yCord[2] = y + height(length);
//StdDraw.polygon(xCord,yCord);
StdDraw.filledPolygon(xCord,yCord);


    }// end filledTriagle

    // Draws a Sierpinski triangle of order n, such that the largest filled 
    // triangle has bottom vertex (x, y) and sides of the specified length. 
    public static void sierpinski(int n, double x, double y, double length) {
    	if(n==0){
    		return;
    	}// end if

    	filledTriangle(x,y,length);
    	sierpinski(n-1,x,y + height(length), length/2);
    	sierpinski(n-1,x-(length/2), y, length/2);
    	sierpinski(n-1,x+(length/2), y, length/2);



 
    }// end sierpinski 

    // Takes an integer command-line argument n; 
    // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
    // draws a Sierpinski triangle of order n that fits snugly inside the outline. 
    public static void main(String[] args) {
    	int n = Integer.parseInt(args[0]);
    //filledTriangle(1,1,0.5);
double[] xCord = {0.0,1.0,0.5};
double[] yCord = {0.0,0.0,height(1)};

StdDraw.polygon(xCord,yCord);

   sierpinski(n,0.5,0.0,0.5);


    }// end main
}// end Sierpinski
