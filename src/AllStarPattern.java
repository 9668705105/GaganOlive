
public class AllStarPattern {
	int assume=1;
	
	/*public void square() {
		for(int column=1;column<=7;column++) {
			  for(int row=1;row<=5;row++) {
			    System.out.print(" * ");
			  }
			System.out.println( );
	   }
		
    }*/
	
	/*public void one() {
		for(int column=1;column<=5;column++) {
			for(int row=1;row<=column;row++) {
				System.out.print("*");
			}
			
			System.out.println( );
		}
		System.out.println("----------------------------------------");
	}*/

	
	/*public void two() {
		for(int column=1;column<=5;column++) {
			    for(int s=4;s>=column;s--) {
			    	System.out.print(" ");
			    }
			    for(int row=1;row<=column;row++) {
			    	System.out.print("*");
			    }
			
			System.out.println();
		}
		System.out.println("----------------------------------------");
	}*/
	
	/*public void three() {
		for(int column=1;column<=5;column++) {
			   for(int row=1;row<=9;row++) {
				   if(row<=0+column || row>=10-column) {
					   System.out.print("*");
				   }
				   else
					   System.out.print(" ");
			   }
			     
			System.out.println();
		}
		System.out.println("----------------------------------------");
	}*/
	/*public void four() {
		for(int column=1;column<5;column++) {
			       for(int row=1;row<=5;row++) {
				
				        System.out.print(" "+row);
			}
			       System.out.println("");
		}
		System.out.println("----------------------------------------");
		
	}*/
	
	/*public void five() {
		for(int column=5;column>=1;column--) {
			       for(int row=1;row<=5;row++) {
				
				        System.out.print(" "+column);
			}
			       System.out.println("");
		}
		System.out.println("----------------------------------------");
		
	}*/
	
	/*public void six() {
		for(int column=5;column>=1;column--) {
			       for(int row=5;row>=1;row--) {
				
				        System.out.print(" "+row);
			}
			       System.out.println("");
		}
		System.out.println("----------------------------------------");
	}*/
	
	/*public void seven() {
		int extra=1;
	for(int column=1;column<=5;column++) {
		       for(int row=1;row<=5;row++) {
			
			        System.out.print("  "+extra++);
			        
		}
		       System.out.println("");
	}
	System.out.println("----------------------------------------");
}*/

	public void eight() {
		int extra=1;
	for(int column=1;column<=5;column++) {
		       for(int row=1;row<=5;row++) {
			
			        System.out.print("  "+(extra=extra+2));
			        //extra=extra+2;
		}
		       System.out.println("");
	}
	System.out.println("----------------------------------------");
}
	public void nine() {
		
	for(int column=1;column<=5;column++) {
		       for(int row=1;row<=5;row++) {
			
			        System.out.print(" "+(column*row));
			        
		}
		       System.out.println("");
	}
	System.out.println("----------------------------------------");
}
	public void ten() {
	
	for(int column=1;column<=5;column++) {
		       for(int row=1;row<=3;row++) {
			
			        System.out.print(row+" "+column+" ");
			        
		}
		       System.out.println("");
	}
	System.out.println("----------------------------------------");
}
	public static void main(String[] args) {
		new AllStarPattern().eight();
		new AllStarPattern().nine();
		new AllStarPattern().ten();
		//new AllStarPattern().square();
		 //new AllStarPattern().one();
		 //new AllStarPattern().two();
		//new AllStarPattern().three();
		//new AllStarPattern().four();
		//new AllStarPattern().five();
		//new AllStarPattern().six();
		//new AllStarPattern().seven();
		
		
		

	}

}
