package com.nt.array;

import java.util.Scanner;

public class AdditionString {

	public static void main(String[] args) {
      int sum = 0;
      
      Scanner scan =  new Scanner(System.in);
      System.out.print("Enter String:: ");
      String str = scan.next();

      for(int i=0; i<str.length(); i++) {
		     // find character
		       char  ch = str.charAt(i);

          // check character or digit?
		      // Character.isDigit() is an inbuilt method in java which determines whether a specified 
		       //character is a digit or not
          if(Character.isDigit(ch)) { 
              // find numeric value of character
               int  n = Character. getNumericValue(ch);
               sum=sum+n;
           }
		  else {
		    	   System.out.println("Given input is wrong PLEASE PASS CORRECT INPUT");  
		    	   return;
		     }
          
       }


      // display result
      System.out.println("The sum of "
                                      +" digits in the string "+str
                                                                     +" = "+ sum);

      
   }
}
