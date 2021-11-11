package com.nt.oop;

public class Hello {
	public static void main(String[] args) {
		String str="Binod";
		char[] charArray = str.toCharArray();
		char temp;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;i<str.length();i++) {
				if(charArray[i]>charArray[j]) {
					temp=charArray[i];
					charArray[i]=charArray[j];
					charArray[i]=temp;
					//System.out.println(temp);
				}
			}
		}
		System.out.println(new String(charArray));
		
	}

}
