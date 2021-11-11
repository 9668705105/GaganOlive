
public class AutoBoxing {

	public static void main(String[] args) {
		int i=10;
		Integer in=Integer.valueOf(i);//Auto Boxing
		int un=in.intValue(); //Auto Unboxing
		
		
		System.out.println("i value"+i);
		System.out.println("in value"+in);
		System.out.println("un value"+un);
		
	
	}
}
