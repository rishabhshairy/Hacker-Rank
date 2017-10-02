import java.util.Scanner;

public class Pangrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		String s1=sc.nextLine();
		String s=s1.toLowerCase();
		System.out.println(s);
		int[] ch=new int[26];
		int m=97;
		for(int i=0;i<26;i++) {
			ch[i]=m;
			m=m+1;
		}
		for(int i=0;i<s.length();i++) {
			num=(int)s.charAt(i);
			if(num>=97&&num<=122) {
				for(int j=0;j<26;j++) {
					if(ch[j]==num) {
						ch[j]=0;
						break;
					}
				}
			}
		}
		int count=0;
		for(int i=0;i<26;i++) {
			if(ch[i]==0) {
				count++;
			}
		}
		if(count==26) {
			System.out.println("pangram");
		}
		else {
			System.out.println("not pangram");
		}
		

	}

}
