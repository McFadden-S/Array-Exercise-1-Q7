/********************************************************************
 * Programmer:      McFadden
 * Class:           CS30S
 *
 * Assignment:      Array Exercise 1 Q7
 * Program Name:    Array Exercise 1 Q7
 *
 * Description:     
 *
 * Input: data to be input
 *
 * Output: results to be output
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 import java.text.DecimalFormat;
 import java.io.*; 					// import file io libraries
 

public class ArrayExercise1Q7 {  // begin class
    
    public static void main(String[] args) throws IOException{  // begin main
    
    // ********* declaration of constants **********
    
    // ********** declaration of variables **********
    
    	String strin;				// string data input from keyboard
    	String strout;				// processed info string to be output
    	String bannerOut;			// string to print banner to message dialogs
    	
    	String prompt;				// prompt for use in input dialogs
    	
    	String delim = "[ :]+";		// delimiter string for splitting input string
    	String tabSpace = "      ";	// six spaces
    	
    
    	
    	//BufferedReader fin = new BufferedReader(new FileReader("name of file"));
    	PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("testOut.txt")));
    	
    // ********** Print output Banner **********
    
    	System.out.println("*******************************************");
    	System.out.println("Name:		McFadden");
    	System.out.println("Class:		CS30S");
    	System.out.println("Assignment:	Array Exercise 1 Q7");
    	System.out.println("*******************************************");

    	bannerOut = "*******************************************\n";
    	bannerOut += "Name:		McFadden\n";
    	bannerOut += "Class:		CS30S\n";
    	bannerOut += "Assignment:	Array Exercise 1 Q7\n";
    	bannerOut += "*******************************************\n\n";
    	
    	fout.println("*******************************************");
    	fout.println("Name:		McFadden");
    	fout.println("Class:		CS30S");
    	fout.println("Assignment:	Array Exercise 1 Q7");
    	fout.println("*******************************************");
 	    	
    // ************************ get input **********************

   

    // ************************ processing ***************************
    
    // ************************ print output ****************************

    
        // ******** closing message *********
        
        System.out.println("end of processing.");
        fout.format("%n%nend of processing.");
        
        // ***** close streams *****
        
        //fin.close();			// close input buffer
        fout.close();			// close output buffer
    }  // end main
}  // end class
