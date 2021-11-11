package com.nt.array;
public class SecondLargestElemnet{  
public static int get(int[] a, int total){  
int let;  
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    let = a[i];  
                    a[i] = a[j];  
                    a[j] = let;  
                }  
            }  
        }  
       return a[total-2];  
}  
public static void main(String args[]){  
int a[]={10,20,30,40,50};    
System.out.println("Second Largest: "+get(a,5));  
}}  
