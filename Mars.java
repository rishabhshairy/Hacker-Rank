import java.util.Scanner;

public class Mars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=0;
		String s=sc.next();
		String t="SOS";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=t.charAt(i%3))
				count++;
		}
		System.out.println(count);
	}

}
