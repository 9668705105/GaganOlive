//LowerToUpper
public class LowertoUpper {

	public static void main(String[] args) {
		String str="abcdef";
		for(int i=0;i<str.length();i++) {
			if(i%2==0) {
				System.out.print((char)(str.charAt(i)-32));
			}
			else
				System.out.print(str.charAt(i));
		}
			

	}

}
