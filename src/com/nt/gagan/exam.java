package com.nt.gagan;

public class exam {
	public void one() {
		for(int column=1;column<=5;column++) {
			    for(int row=1;row<=5;row++) {
			    	if((row==1 || row==5) || (column==1 || column==5))
			    		System.out.print("*");
			    	else
			    		System.out.print(" ");
			    }
			System.out.println();
		}
		System.out.println("-----------------------------");
	}
	public void two() {
		for(int column=1;column<=7;column++) {
			  for(int row=1;row<=7;row++) {
				  if(column==row || row+column==7+1)
					  System.out.print("*");
				  else
					  System.out.print(" ");
			  }
			System.out.println();
		}
		System.out.println("-----------------------------");
	}
	public void three() {
		int extra=1;
		int space=5*2-1;
		 for(int column=1;column<=5;column++) {
			     for(int row=1;row<=5*2;row++) {
			    	 if(row==extra||row==space) 
			    		 System.out.print("*");
			    	else
			    		System.out.print(" ");
			    	 }
			        }
		          extra++;
	              space--;
	              
	              
	              
			 System.out.println();
			 
		 }

	public void five() {
		for(int column=1;column<=5;column++) {
			for(int row=5;row>=column;row--)
				System.out.print(row);
			System.out.println();
		}
		System.out.println("-----------------------------");
	}
	
	public void six() {
		
		for(int column=1;column<=5;column++) {
			       for(int row=1;row<=3;row++) {
				
				        System.out.print(row+" "+column+" ");
				        
			}
			       System.out.println("");
		}
		System.out.println("----------------------------------------");
	}
	
	//print Amstrong number
	public void seven() {
	int n=153;
	int temp=n;
	int r; int sum=0;
	while(n>0) {
		r=n%10;
		n=n/10;
		sum=sum+r*r*r;
	}
	if(temp==sum)
		System.out.println("It is Amstrong number");
	else
		System.out.println("It is not amstrong number");
	System.out.println("----------------------------------------");
	}
	
	//Fibonacci Series
	public void eight() {
		int n1=0,n2=1,sum=0;
		System.out.println(n1+"  +  "+n2);
		for(int i=2;i<10;i++) {
			sum=n1+n2;
			System.out.println(" "+sum);
			n1=n2;
			n2=sum;
		}
	}
	//print All prime number betweeen 1 to 100
	public void nine() {
		int n=100;
		int c;
		int count;
		System.out.println("List of Prime number from 1 to 100");
		for(int i=1;i<=100;i++) {
			c=i;
			count=0;
			for(int j=1;j<=c;j++) {
				if(c%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(""+c);
			}
		}
		System.out.println("--------------------------------");
	}
	public void ten() {
		
		int extra;
		for(int column =1;column<=5;column++) {
			extra=column;
			for(int row=1;row<=column;row++) {
				   System.out.print(" "+extra);
				   extra=extra+(5-row);
			}
			System.out.println(" ");
		}
	}
	
	public void eleven() {
		int extra = 1;
		for(int column=1;column<=4;column++) {
			if(column%2==0) {
				for(int row=column*3;row>3;row--) {
					System.out.print(" "+row);
				}
				
			}
			else {
			for(int row=1;row<=3;row++) {
				//System.out.println("*");
				System.out.print(" "+extra++);
			}
		  }
			System.out.println();
		}
	}
	
	public void twelve() {
		
		for(int column=1;column<=5;column++) {
			for(int row=5;row>=1;row--) {
				if(column>=row) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("----------------------------------");
			
			
	}
	
public void thirteen() {
		
		for(int column=5;column>=1;column--) {
			for(int row=5;row>=1;row--) {
				if(column>=row) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
			
			
	}
public void fourteen() {
	int extra=1;
	for(int i=1;i<=9;i++) {
		   for(int j=1;j<=extra;j++) {
			   System.out.print("*");
		   }
		   
		System.out.println();
		if(i<=9/2)
			extra++;
		else
			extra--;
	}
	System.out.println("-----------------------------------");
}
public void fifteen() {
	int n=9;
	int extra=n/2+1;
	for(int i=1;i<=n;i++) {
		   for(int j=1;j<=n/2+1;j++) {
			   if(j>=extra)
				   System.out.print("*");
			   else
				   System.out.print(" ");
			   
		   }
		   
		System.out.println();
		if(i<=n/2)
			extra--;
		else
			extra++;
	}
	
}
	
	public static void main(String[] args) {
		new exam().one();
		new exam().two();
		new exam().three();
		
		new exam().five(); 
		new exam().six();
		new exam().seven();
		new exam().eight();
		new exam().nine();
		new exam().ten();
		new exam().eleven();
		new exam().twelve();
		new exam().thirteen();
		new exam().fourteen();
		new exam().fifteen();

	}

}
