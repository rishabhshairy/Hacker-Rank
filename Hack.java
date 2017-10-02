import java.util.Scanner;

public class Hack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        String s1="hackerrank";
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here
            if(s.length()<s1.length()) {
            	System.out.println("NO");
            }
            int j=0;
            for(int i=0;i<s.length();i++) {
            	if(j<s1.length()&&s.charAt(i)==s1.charAt(j)) {
            		j++;
            	}
            }
            if(j==s1.length()) {
            	System.out.println("YES");
            }
            else {
            	System.out.println("NO");
            }
        
        }
        }

	}


