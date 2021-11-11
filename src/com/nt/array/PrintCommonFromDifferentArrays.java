//question no4
package com.nt.array;

import java.util.Arrays; 
public class PrintCommonFromDifferentArrays {
public static void main(String[] args) 
    {
      int[] arr1 = {11,14,18,2,5};
      int[] arr2 = {22,45,18,11,4};
 
       System.out.println("Array1 : "+Arrays.toString(arr1));
       System.out.println("Array2 : "+Arrays.toString(arr2));
 
      
        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if(arr1[i] == (arr2[j]))
                {
                 System.out.println("Common element is : "+(arr1[i]));
                 }
            }
        }
 
    }
}