//Q no 5swap
package com.nt.exam;


public class swap {  
    public static void main(String args[]) {  
        String a = "Jagannath";  
        String b = "Jay";  
        System.out.println("Before swap: " + a + " " + b);  
        a = a + b;
        System.out.println(a);
        b = a.substring(0, a.length() - b.length());  
        a = a.substring(b.length());  
        System.out.println("After : " + a + " " + b);  
    }  
}  