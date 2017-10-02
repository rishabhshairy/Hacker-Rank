import java.util.Scanner;

public class Bonapetit {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int[] ar = new int[n];
    for(int ar_i = 0; ar_i < n; ar_i++){
        ar[ar_i] = in.nextInt();
    }
    int b = in.nextInt();
    bonAppetit(n, k, b, ar);
}

private static void bonAppetit(int n, int k, int b, int[] ar) {
	// TODO Auto-generated method stub
	int actual=0;
	for(int i=0;i<n;i++) {
		if(i==k) {
			actual+=0;
			
		}
		else {
			actual+=ar[i];
		}
	}
	actual=actual/2;
	if(b!=actual) {
		System.out.println(b-actual);
	}
	else {
		System.out.println("Bon Appetit");
	}
	
	
}
}
