import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int no = sc.nextInt();
		int count=0;
		for(int i=1;i<=no;i++) {
			if(no%i==0) {
				count++;
			}
		}
		if(no%2==0) {
			System.out.print(no+" is Even and  ");
		}
		else {
			System.out.print(no+" is Odd and  ");
		}
		if(count==2) {
			System.out.println("This Is prime number");
		}
		else {
			System.out.println("This is not prime number");
		}
		
		
		
}
}
