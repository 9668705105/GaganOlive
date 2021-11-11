//Q3 ReverseString sentence
package com.nt.exam;

public class ReverseSentence {

	public static void main(String[] args) {
		String input="How are you";
		System.out.println("Original String is::" +input);
		String output="";
		
		String[] words=input.split(" ");
	
		
		
		for(String word:words) {
			String revword="";
			for(int i=word.length()-1 ;i>=0;i--) {
				revword=revword+word.charAt(i);
			}
			output=output+revword+" ";
			
		}
		System.out.print("After Reverse ::"+output);
		
	}

}
