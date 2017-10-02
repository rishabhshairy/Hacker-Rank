import java.util.Scanner;

public class divipair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);

	}

	 static int divisibleSumPairs(int n, int k, int[] ar) {
		// TODO Auto-generated method stub
		 int count=0;
		 for(int i=0;i<n;i++){
			 for(int j=i+1;j<n;j++){
				 if((ar[i]+ar[j])%k==0){
					 count++;
				 }
			 }
		 }
		return count;
	}

}
