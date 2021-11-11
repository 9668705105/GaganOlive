//Question number 2
public class countCharacterSpecialCharacter {

	public static void main(String[] args) {
		String str="Nacre@123%";
		int character=0,specialcharacter=0,digit=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
                character++;
                else if(ch>='0' && ch<='9')
                	digit++;
                else
                	specialcharacter++;
		}
		System.out.println("Character are "+character);
		System.out.println("digit are "+digit);
		System.out.println("Specialcharacter are "+specialcharacter);

	}

}
