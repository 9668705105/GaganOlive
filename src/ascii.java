import java.util.Scanner;

public class ascii {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		String str=sc.next();
		char ch=str.charAt(0);
		int ascii=ch;
		System.out.println(+ascii);

	}

}
