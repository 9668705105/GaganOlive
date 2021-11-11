
public class Third {

	public static void main(String[] args) {
		String input1="Welcome to Naresh It";
		char input2='e';
		
		int count=0;
		for(int i=0;i<input1.length();i++) {
			if(input1.charAt(i)==input2) {
				System.out.println("Character present on index:"+i);
				count++;
			}
				
		}
		System.out.println("Total no. of e present: "+count);
	
	}

}
