//Qn 9 HighestOccuredCharacter
package com.nt.exam;

public class HighestOccuredChar {
	public static char Highest(String str) {
		int max=0;
		char maxCh=0;
		for(char ch:str.toCharArray()) {
			int first=str.indexOf(ch);
			int last=str.lastIndexOf(ch);
			if(first!=last) {
				if(max<(last-first)) {
					max=(last-first);
					maxCh=ch;
				}
			}
		}
		return maxCh;
	}

	public static void main(String[] args) {
		System.out.println("Highest Character is :- "+Highest("aaaaabbcddddd"));

	}

}
