import java.util.Scanner;

public class migbirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] ar = new int[n];
	        for(int ar_i = 0; ar_i < n; ar_i++){
	            ar[ar_i] = in.nextInt();
	        }
	        int result = migratoryBirds(n, ar);
	        System.out.println(result);

	}

	static int migratoryBirds(int n, int[] ar) {
		// TODO Auto-generated method stub
		int fr[]=new int[6];
		for(int i=0;i<n;i++){
			fr[ar[i]]++;
		}
		int max=0,id=0;
		for (int i = 0; i <n; i++) {
			if(max<fr[i]){
				max=fr[i];
				id=i;
			}
		}
		
		return id;
	}

}
