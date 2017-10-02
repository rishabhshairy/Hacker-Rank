import java.util.Scanner;

public class Twochar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int k=sc.nextInt();
		StringBuffer sb=new StringBuffer(s);
		int z=0;
		for(int i=0;i<n;i++) {
			z=0;
			char ch;
			ch=s.charAt(i);
			if((int)ch<=90&&(int)ch>=65) {
				z=(int)ch+k;
				if(z>90) {
					z=64+z-90;
				}
				sb.setCharAt(i,(char)z);
			}
			if((int)ch>=97&&(int)ch<=122) {
				z=(int)ch+k;
				if(z>122) {
					z=96+z-122;
				}
				sb.setCharAt(i,(char)z);
			}
		}
		System.out.println(sb);
		sc.close();
		
		
}
}
