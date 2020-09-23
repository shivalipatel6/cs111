/*************************************************************************
 *  Compilation:  javac ArtCollage.java
 *  Execution:    java ArtCollage
 *
 *  @author: Shivali Patel sbp132@scarletmail.rutgers.edu 195000927
 *
 *************************************************************************/

import java.awt.Color;

public class ArtCollage {

    // The orginal picture
    private Picture original;

    // The collage picture
    private Picture collage;

    // The collage Picture consists of collageDimension X collageDimension tiles
    private int collageDimension;

    // A tile consists of tileDimension X tileDimension pixels
    private int tileDimension;
    
    /*
     * One-argument Constructor
     * 1. set default values of collageDimension to 4 and tileDimension to 100
     * 2. initializes original with the filename image
     * 3. initializes collage as a Picture of tileDimension*collageDimension x tileDimension*collageDimension, 
     *    where each pixel is black (see all constructors for the Picture class).
     * 4. update collage to be a scaled version of original (see scaling filter on Week 9 slides)
     *
     * @param filename the image filename
     */
    public ArtCollage (String filename) {
    	collageDimension = 4;
    	tileDimension = 100;
    	int w = tileDimension*collageDimension;
    	int h = tileDimension*collageDimension;
    	 original = new Picture(filename); 
    	 collage = new Picture(w,h);
    	
    	for (int tcol = 0; tcol < w; tcol++){
			for (int trow = 0; trow < h; trow++){
    	    int scol = tcol * original.width()  / w;
    	    int srow = trow * original.height() / h;
    	    Color color = original.get(scol, srow);
    	    collage.set(tcol, trow, color);
    		}// end second for loop
    	}// end first for loop
	
    }// end ArtCollage one constructor

    /*
     * Three-arguments Constructor
     * 1. set default values of collageDimension to cd and tileDimension to td
     * 2. initializes original with the filename image
     * 3. initializes collage as a Picture of tileDimension*collageDimension x tileDimension*collageDimension, 
     *    where each pixel is black (see all constructors for the Picture class).
     * 4. update collage to be a scaled version of original (see scaling filter on Week 9 slides)
     *
     * @param filename the image filename
     */
    public ArtCollage (String filename, int td, int cd) {

    	collageDimension = cd;
    	tileDimension = td;
    	int w = tileDimension*collageDimension;
    	int h = tileDimension*collageDimension;
    	original = new Picture(filename); 
    	collage = new Picture(w,h);
    	
    	for (int tcol = 0; tcol < w; tcol++){
			for (int trow = 0; trow < h; trow++){
    	    int scol = tcol * original.width()  / w;
    	    int srow = trow * original.height() / h;
    	    Color color = original.get(scol, srow);
    	    collage.set(tcol, trow, color);
    		}// end second for loop
    	}// end first for loop


    }// end artcollage three part constructor

    /*
     * Returns the collageDimension instance variable
     *
     * @return collageDimension
     */
    public int getCollageDimension() {
     return collageDimension;
	
    }// end getCollageDimension()

    /*
     * Returns the tileDimension instance variable
     *
     * @return tileDimension
     */
    public int getTileDimension() {
    	return tileDimension;
	
    }// getTileDimension

    /*
     * Returns original instance variable
     *
     * @return original
     */
    public Picture getOriginalPicture() {
    	return original;
    }// end getOriginalPicture

    /*
     * Returns collage instance variable
     *
     * @return collage
     */
    public Picture getCollagePicture() {
    	return collage;
    }// end get Collage Picture
    
    /*
     * Display the original image
     * Assumes that original has been initialized
     */
    public void showOriginalPicture() {

    	original.show();

    }//end showOriginalPicture

    /*
     * Display the collage image
     * Assumes that collage has been initialized
     */
    public void showCollagePicture() {

    	 collage.show();

    }// showCollagePicture

    /*
     * Replaces the tile at collageCol,collageRow with the image from filename
     * Tile (0,0) is the upper leftmost tile
     *
     * @param filename image to replace tile
     * @param collageCol tile column
     * @param collageRow tile row
     */
    public void replaceTile (String filename,  int collageCol, int collageRow) {

    Picture temp = new Picture(filename); 

for (int tcol = 0; tcol < getTileDimension(); tcol++){
			for (int trow = 0; trow < getTileDimension(); trow++){
    	    int scol = tcol * temp.width()  / getTileDimension();
    	    int srow = trow * temp.height() / getTileDimension();
    	    Color color = temp.get(scol, srow);
    	    collage.set(tcol + (collageCol * getTileDimension()), trow + (collageRow * getTileDimension()), color);
    		}// end second for loop
    	}// end first for loop

    }// end replace tile
    
    /*
     * Makes a collage of tiles from original Picture
     * original will have collageDimension x collageDimension tiles, each tile
     * has tileDimension X tileDimension pixels
     */
    public void makeCollage () {


    for(int cdcol = 0; cdcol < getCollageDimension() ; cdcol++){	 
    for(int cdrow = 0; cdrow < getCollageDimension() ; cdrow++){
    	for (int tcol = 0; tcol < getTileDimension(); tcol++){
			for (int trow = 0; trow < getTileDimension(); trow++){
    	    int scol = tcol * original.width()  / getTileDimension();
    	    int srow = trow * original.height() / getTileDimension();
    	    Color color = original.get(scol, srow);
    	    collage.set(tcol + (cdrow * getTileDimension()), trow + (cdcol * getTileDimension()), color);
    		}// end fourth for loop
    	}// end third for loop
    }// end second for loop
}// end first 


    }// end make collage

    /*
     * Colorizes the tile at (collageCol, collageRow) with component 
     * (see Week 9 slides, the code for color separation is at the 
     *  book's website)
     *
     * @param component is either red, blue or green
     * @param collageCol tile column
     * @param collageRow tile row
     */
    public void colorizeTile (String component,  int collageCol, int collageRow) {

    	for (int tcol = 0; tcol < getTileDimension(); tcol++){
			for (int trow = 0; trow < getTileDimension(); trow++){
    	   //int scol = (tcol * original.width()  / getTileDimension()) + (collageCol * getTileDimension());
    	   // int srow = (trow * original.height() / getTileDimension()) + (collageRow * getTileDimension());
    	    Color color = collage.get(tcol + (collageCol * getTileDimension()), trow + (collageRow * getTileDimension()));
    	    	if(component == "red"){
    	    		int r = color.getRed();
  collage.set(tcol + (collageCol * getTileDimension()), trow + (collageRow * getTileDimension()), new Color(r,0,0));
    	    	}// end red

    	    	if(component == "green"){
    	    		int g = color.getGreen();
  collage.set(tcol + (collageCol * getTileDimension()), trow + (collageRow * getTileDimension()), new Color(0,g,0));
    	    	}// end green


    	    	if(component == "blue"){
    	    		int b = color.getBlue();
  collage.set(tcol + (collageCol * getTileDimension()), trow + (collageRow * getTileDimension()), new Color(0,0,b));
    	    	}// end blue

    		}// end fourth for loop
    	}// end third for loop


    }// end colorize tile

    /*
     * Greyscale tile at (collageCol, collageRow)
     * (see Week 9 slides, the code for luminance is at the book's website)
     *
     * @param collageCol tile column
     * @param collageRow tile row
     */

    public void greyscaleTile (int collageCol, int collageRow) {

 
    	for (int tcol = 0; tcol < getTileDimension(); tcol++){
			for (int trow = 0; trow < getTileDimension(); trow++){
    	   // int scol = tcol * original.width()  / getTileDimension();
    	    //int srow = trow * original.height() / getTileDimension();
    	   Color color = collage.get(tcol + (collageCol * getTileDimension()), trow + (collageRow * getTileDimension()));
    	    Color gray =  Luminance.toGray(color);
    	    collage.set(tcol + (collageCol * getTileDimension()), trow + (collageRow * getTileDimension()), gray);
    		}// end fourth for loop
    	}// end third for loop



    }// end greyscaleTile


    // Test client 
    public static void main (String[] args) {
    
	ArtCollage art = new ArtCollage(args[0],200,3);
	art.makeCollage();
	art.colorizeTile("red",2,2);
	art.colorizeTile("green",0,0);
	art.greyscaleTile(1, 0);
	art.replaceTile(args[1],2,1);
	art.colorizeTile("blue",2,1);
	art.replaceTile(args[1],2,0);
	art.showCollagePicture();


    }// end main
}// end artcollage 
