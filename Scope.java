import java.util.Scanner;

class Difference{
	private int[] elements;
  	public int maximumDifference;
  	
  	public Difference(int a[]) {
		// TODO Auto-generated constructor stub
  		elements=a;
	}
  	
  	void computeDifference() {
  		for(int i=0;i<elements.length;i++) {
  			for(int j=i+1;j<elements.length;j++) {
  				int k=Math.abs(elements[i]-elements[j]);
  				if(maximumDifference<k) {
  					maximumDifference=k;
  				}
  			}
  		}
  	}
}


public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);

	}

}
