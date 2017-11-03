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
import java.util.Random;
 

public class ArrayExercise1Q7 {  // begin class
    
    public static void main(String[] args) throws IOException{  // begin main
    
    // ********* declaration of constants **********
    
        final int MAX = 10;     //constant for max size of array
    
    // ********** declaration of variables **********
    
    	String strin;				// string data input from keyboard
    	String strout;				// processed info string to be output
    	String bannerOut;			// string to print banner to message dialogs
    	
    	String prompt;				// prompt for use in input dialogs
    	
    	String delim = "[ :]+";		// delimiter string for splitting input string
    	String tabSpace = "      ";	// six spaces
    	
        int[] Rn = new int[MAX];        //array for the random numbers
        Random rand = new Random();     //creates a new random generator

        int sum = 0;                        //int for sum of the array
        double average = 0;                 //double for average of the array
        int min = 0;                        //int for minimum of array
        int max = 0;                        //int for maximum of array
    	
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

        for (int i = 0; i < MAX; i++){ //loop to assign values to array
            
            Rn[i] = rand.nextInt(10) + 1;  //assignes a random value
            
        }//end of assignment for loop

    // ************************ processing ***************************
    
        for (int i = 0; i < MAX; i++){//loop to sum array
                sum += Rn[i]; //sums the array by running total
        }//end of summing for loop
        
        average = (double)sum / MAX; //calculates average
        
            min = Rn[0]; //  assume first elements as smallest number
 	    max = Rn[0]; //  assume first elements as largest number
 
 		for (int i = 0; i < MAX; i++)  // iterate for loop from arrays 1st index (second element)
 		{
 			if (Rn[i] > max) //checks if number is greater
 			{
 				max = Rn[i]; //if its greater assignes it
 			}//end of if loop
 			if (Rn[i] < min) //checks if number is lesser
 			{
 				min = Rn[i]; //if its lesser assignes it
 			} //end of if loop
 		}//end of for loop
    
    // ************************ print output ****************************
        
            System.out.println("Array Values: ");//output header
            for (int i = 0; i < MAX; i++) {//loop to print array
                System.out.print(Rn[i] + ", ");
            }//end of print array for loop
            
            System.out.println("\n\nSum of Array: " + sum); //prints sum
            
            System.out.println("Average of Array: " + average); //prints average
            
            System.out.println("Minimum of Array: " + min); //prints min
            
            System.out.println("Maximum of Array: " + max); //prints max
            
        // ******** closing message *********
        
        System.out.println("\n\nend of processing.");
        fout.format("%n%nend of processing.");
        
        // ***** close streams *****
        
        //fin.close();			// close input buffer
        fout.close();			// close output buffer
    }  // end main
}  // end class
