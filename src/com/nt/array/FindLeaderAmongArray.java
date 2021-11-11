package com.nt.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Arrays; 

public class FindLeaderAmongArray
{
 

public static void main(String[] args)
    {
      int arr[] = {10, 9, 14, 23, 15, 0, 9};
      int j;
        for (int i = 0; i < arr.length; i++) 
        {
            
            for ( j = i + 1; j < arr.length; j++) 
            {
                if (arr[i] <= arr[j])
                    break;
            }
			if (j == arr.length) 
                System.out.print(arr[i] + " ");
        }
    }
}
