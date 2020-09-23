/*************************************************************************
 *  Compilation:  javac RunLengthEncoding.java
 *  Execution:    java RunLengthEncoding
 *
 *  @author: Shivali Patel sbp132@scarletmail.rutgers.edu 195000927
 *
 *************************************************************************/

public class RunLengthEncoding {

    /* 
     * Encode the original string by finding sequences in the string
     * where the same character repeats. Replace each such sequence
     * by a token consisting of: the number of characters in the sequence
     * followed by the repeating character.
     * Return the encoded string.
     */
    public static String encode (String original)  {
    	int nbr = 1;
    	String encde = "";
    	int lngth = original.length();
    for(int i = 0; i < lngth; i++){
    	while(i < lngth-1 && original.charAt(i) == original.charAt(i+1)){
    		nbr++;
    		i++;
    	}// end while loop for counting number of chars

    	if(nbr == 1){
    		encde = encde + original.charAt(i);
    	}// end if for single char in string
    	else{
    		encde = (encde + nbr) + original.charAt(i-1);
    	}// end else for if there are more than one of a char

    	nbr = 1;

    }// end for loop for encoding each string of letters

    return encde;

    }// end encode

    // an append function!!!!!!!!!

    public static String append(char original, int n){

		if (n== 1){
    		return original + "";
    	}// end if 

    	return append(original,n-1) + original;

    }// end append


    /*
     * Decodes the original string encoded with the encode method.
     * Returns the decoded string.
     *
     * YOUR decode METHOD MUST BE RECURSIVE, do not use while, do/while, 
     * or for loops
     */
    public static String decode (String original)  {
	
	

	if(original.length()== 1 ){
		
		return original.charAt(0) + "";
	}// end basecase zero

	if(Character.isDigit(original.charAt(0))== true){

		if(original.length()== 2 ){
		
		return append(original.charAt(1), (original.charAt(0) - '0'));
	}// end basecase zero
		else{
		return append(original.charAt(1), (original.charAt(0) - '0')) + decode(original.substring(2));
		}// end base case else

		}// end if statement for digit
		else
		{
			
			return original.charAt(0) + decode(original.substring(1));
		}// end else statement

   }// decode

    public static void main (String[] args) {
    	System.out.print(encode("w"));
    	//System.out.print(decode("word"));

    }// main
}//end RunLengthEncoding
