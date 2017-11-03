/********************************************************************
 * Programmer:      McFadden
 * Class:           CS30S
 *
 * Assignment:      Array Exercise 1 Q7
 * Program Name:    Array Exercise 1 Q7
 *
 * Description:     
 *
 * Input:           where there should be a sentinel value or not
 *
 * Output:          prints the array, sum of array, average of array, 
 *                  minimum of array and maximum of array
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
        final int RANGE = 10;   //constant for the range of number values that can be in array
    
    // ********** declaration of variables **********
    
    	String strin;				// string data input from keyboard
    	String strout;				// processed info string to be output
    	String bannerOut;			// string to print banner to message dialogs
    	
    	String prompt;				// prompt for use in input dialogs
    	
    	String delim = "[ :]+";		// delimiter string for splitting input string
    	String tabSpace = "      ";	// six spaces
    	
        int[] Rn = new int[MAX];        //array for the random numbers
        Random rand = new Random();     //creates a new random generator
        
        int aLen = 0;                   //int for amount of numbers before sentinel value
        boolean SentinelVal = true;    //boolean that goes true if theres a sentinal value
        boolean ZeroCheck = false;     //boolean that goes true if there is a zero in array

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

        
        
        
    // ************************ processing ***************************
        
        for (int i = 0; i < MAX; i++){ //loop to assign values to array
            
            Rn[i] = rand.nextInt(RANGE);  //assignes a random value
            
        }//end of assignment for loop
        
        for(int i=0; i< MAX; i++){ //for loop which checks for zero
              if(Rn[i] == 0){//if which is true if there is zero
                ZeroCheck = true; //sets zerocheck to true
                break; //breaks loop
              }// end of zero if
              else { //executed if no there
                ZeroCheck = false; //sets zero check to false
              }//end of no zero else
        }//end of zero check loop
        
        if (SentinelVal && ZeroCheck){
            for (int i = 0; Rn[i] != 0; i++){//loop to count numbers before sentinel value
                aLen++;
            }//end of numbers before sentinel value count for loop
        }//end of sentinel value if
        else {
            aLen = MAX;
        }//end of aLen = MAX else
        
        for (int i = 0; i < aLen; i++){//loop to sum array
                sum += Rn[i]; //sums the array by running total
        }//end of summing for loop

        average = (double)sum / aLen; //calculates average
        
        min = Rn[0]; //  assume first elements as smallest number
 	max = Rn[0]; //  assume first elements as largest number
 
            for (int i = 0; i < aLen; i++)  // iterate for loop from arrays 1st index (second element)
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
            for (int i = 0; i < aLen; i++) {//loop to print array
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
