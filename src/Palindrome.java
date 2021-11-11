//Palindrome
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		String org=str;
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
		     rev = rev+str.charAt(i);
		}
		if(org.equalsIgnoreCase(rev)) {
			System.out.println(org+" is a palindrome String  ");
		}
		else {
			System.out.println(org+" is not a palindrome String  ");
		}

	}

}
