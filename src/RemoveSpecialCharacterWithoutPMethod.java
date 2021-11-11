//RemovalSpecialCharacter
public class RemoveSpecialCharacterWithoutPMethod {

	public static void main(String[] args) {
		String str="ncaer Software";
		String s1="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a') {
				s1=s1+"";
			}
			else {
				s1=s1+str.charAt(i);
			}
		}
		System.out.println(s1);

	}

}
