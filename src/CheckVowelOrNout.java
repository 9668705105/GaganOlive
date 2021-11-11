//Question number 1
public class CheckVowelOrNout {

	public static void main(String[] args) {
		String str="nacre123";
		int j=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				j++;
		}
		if(j>0)
				System.out.println("Given String is contain vowels");
			else
				System.out.println("Given String is not contain vowels");
		}
	}

