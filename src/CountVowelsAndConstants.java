//Question number 4
public class CountVowelsAndConstants {

	public static void main(String[] args) {
		String str="Nacre";
		str=str.toLowerCase();
		int j=0;
		int k=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				j++;
			else if(ch>='a' && ch<='z')
				k++;
		}
		
				System.out.println("Vowels are "+j);
				System.out.println("Consonants are "+k);
		}
	}
