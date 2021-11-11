//Q no8 Remove Duplicate character
package com.nt.exam;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		String str="banaans";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			int idx=str.indexOf(ch,i+1);
			if(idx==-1)
				sb.append(ch);
		}
     System.out.println("Out put is "+sb);
	}
	

}
