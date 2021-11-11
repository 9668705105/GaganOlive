package com.nt.Sunday;

public class Concate {

	public static void main(String[] args) {
		String str1="I  love@^%*!    You";
		//String store=str1.replaceAll("[^a-zA-Z0-9]","");
		String store=str1.replaceAll("\\s", "");
		System.out.println(store);
		
	}

}
