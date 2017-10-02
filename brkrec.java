import java.util.Scanner;

public class brkrec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] s = new int[n];
	        for(int s_i=0; s_i < n; s_i++){
	            s[s_i] = in.nextInt();
	        }
	        int[] result = getRecord(s);
	        String separator = "", delimiter = " ";
	        for (Integer val : result) {
	            System.out.print(separator + val);
	            separator = delimiter;
	        }
	        System.out.println("");

	}

	public static int[] getRecord(int[] s) {
		// TODO Auto-generated method stub
		int res[]=new int[2];
		int max,min;
		int h[]=new int [s.length];
		int l[]=new int [s.length];
		max=s[0];
		min=s[0];
		for(int i=0;i<s.length;i++){
			if(max<=s[i]){
				max=s[i];
				h[i]=max;
			}
			else{
				h[i]=max;
			}
		}
		for(int i=0;i<s.length;i++){
			if(min>=s[i]){
				min=s[i];
				l[i]=min;
			}
			else{
				l[i]=min;
			}
		}
		max=h[0];
		min=l[0];
		for(int i=1;i<s.length;i++){
			if(max<h[i]){
				max=h[i];
				res[0]++;
			}
			
		}
		
		for(int i=1;i<s.length;i++){
			if(min>l[i]){
				min=l[i];
				res[1]++;
			}
			
		}
		
		return res;
	}

}
