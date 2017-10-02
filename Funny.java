import java.util.Scanner;

public class Funny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        int q = in.nextInt();
	        for(int a0 = 0; a0 < q; a0++){
	            String s = in.next();
	            String result = funnyString(s);
	            System.out.println(result);
	        }
	}

	 static String funnyString(String s) {
		// TODO Auto-generated method stub
		 String r=new StringBuffer(s).reverse().toString();
		 for(int i=1;i<s.length();i++) {
			 
		 }
		return null;
	}

}
