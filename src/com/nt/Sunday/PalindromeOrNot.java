package com.nt.Sunday;

public class PalindromeOrNot {

	public static void main(String[] args) {
		String str="Madam";
		String org=str;
		String rev="";
		for(int i=0;i<str.length();i++) {
			rev=rev+str.charAt(i);
		}
		if(org.equalsIgnoreCase(rev)) {
			System.out.println(org+"  This is palindrome number");
		}
		else {
			System.out.println("This is not palindrome number");
		}

	}

}
