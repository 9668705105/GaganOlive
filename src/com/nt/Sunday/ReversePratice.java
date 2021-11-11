package com.nt.Sunday;

public class ReversePratice {

	public static void main(String[] args) {
		String str="Refidgerator";
		char[] ch = str.toCharArray();
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		
		System.out.println("-----------------");
		
		StringBuffer sb=new StringBuffer(str);
		System.out.print(sb.reverse());

		System.out.println("-----------------");
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}
	

}
