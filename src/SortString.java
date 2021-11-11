//Question number 5
import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		String str="naresh";
		char extra;
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					extra=ch[i];
					ch[i]=ch[j];
					ch[j]=extra;
				}
			}
		}
		System.out.println(new String(ch));
	}

}
