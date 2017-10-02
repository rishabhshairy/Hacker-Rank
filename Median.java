import java.util.Arrays;
import java.util.Scanner;


public class Median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] x=new int[n];
		if(n%2!=0) {
			for(int i=0;i<x.length;i++) {
				x[i]=sc.nextInt();
			}
		}
		Arrays.sort(x);
		System.out.println(x[x.length/2]);
	}

}
