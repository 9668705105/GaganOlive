//Question no.2
package com.nt.array;
import java.util.*;

class MaxMinDiffInArray
{
public static void main(String args[])
{
int large,small,i,diff;
int a[] = new int[]{1,5,4,10,30,25,99,88,75};
int n = a.length;
large=small=a[0];
for(i=1;i<n;++i)
{
if(a[i]>large)
large=a[i];

if(a[i]<small)
small=a[i];
}

System.out.println("The smallest element is " + small );
System.out.println("The largest element is " + large );
diff=large-small;
System.out.println("Difference is:"+large+"-"+small+"="+diff);

}
}
