import java.util.Scanner;

public class rec1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		@SuppressWarnings("unused")
		int x=sc.nextInt();
		@SuppressWarnings("unused")
		int n=sc.nextInt();
		sc.close();
		int res= solve(x,n,0);
		System.out.println(res);

	}
	static int solve(int x,int n,int i){
		x-=Math.pow(i, n);
		if(x==0){
			return 1;
		}
		if(x>0){
			System.out.println(x);
			int sum=0;
			for(int j=i+1;Math.pow(j,n)<=x;j++){
				sum+=solve(x,n,j);
				System.out.println("the sum is "+sum);
				
			}
			
			return sum;
		}
		else
			return 0;
	}

}
