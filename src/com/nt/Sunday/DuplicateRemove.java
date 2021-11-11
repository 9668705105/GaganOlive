package com.nt.Sunday;

public class DuplicateRemove {

	public static void main(String[] args) {
		String str="gagan";
	  StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++) {
			char charAt = str.charAt(i);
			int indexOf = str.indexOf(charAt,i+1);
			if(indexOf==-1) {
				sb.append(charAt);	
			}
		}
		System.out.println(sb);

	}

}
