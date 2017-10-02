import java.util.Arrays;
import java.util.Scanner;

public class Stock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);

	}

		static int sockMerchant(int n, int[] ar) {
		// TODO Auto-generated method stub
			int count=0;
			int c[]=new int[101];
			Arrays.sort(ar);
			for(int i=0;i<n;i++){
				c[ar[i]]++;
			}
			for(int i=0;i<c.length;i++){
				count+=(c[i]/2);
			}
			
		return count;
	}

}
