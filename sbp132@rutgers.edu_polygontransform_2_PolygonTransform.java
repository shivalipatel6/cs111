/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author:
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {
double[] nwArray = new double [array.length];
	for(int i = 0; i<array.length; i++){
		nwArray[i]=array[i];
	}
return nwArray;

    }// end copy
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {

for(int i = 0; i<x.length; i++){
		x[i]= alpha *x[i];
		y[i]= alpha *y[i];
	}// end forloop

    }// end scale
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {
for(int i = 0; i<x.length; i++){
		x[i]= x[i] + dx;
		y[i]= y[i] + dy;
	}// end forloop

    }// end translate
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {
double[] nwArrayx = copy(x);
double[] nwArrayy = copy(y);
theta = theta * (Math.PI / 180);

    	
for(int i = 0; i<x.length; i++){
		x[i]= (nwArrayx[i]* Math.cos(theta)) - (nwArrayy[i]*Math.sin(theta));

	}// end forloop
	for(int i = 0; i<x.length; i++){
		y[i]= (nwArrayy[i]* Math.cos(theta)) + (nwArrayx[i]*Math.sin(theta));
	}// end forloop


    }//rotate


    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {
StdDraw.setScale(-5.0,+5.0);
double[] x = {0}; 
double[] y = {1}; 
double alpha = 2.0; 
double dx = 2.0;
double dy = 1.0; 
double theta = 20.0; 
StdDraw.setPenColor(StdDraw.RED); 
StdDraw.polygon(x,y); 
//scale(x, y, alpha); 
//translate(x, y, dx, dy); 
rotate(x, y, theta); 
StdDraw.setPenColor(StdDraw.BLUE);
StdDraw.polygon(x, y);

    }// end main
}// PolygonTransform
