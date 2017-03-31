import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int n=A.length()+B.length();
        System.out.println(n);
        int x=A.compareTo(B);
        if(x>0){
        	System.out.println("Yes");
        }
        else{
        	System.out.println("No");
        }
        String C=A.substring(0,1).toUppperCase();
        String D=B.substring(0,1).toUppperCase();
        System.out.System.out.println(C+A.substring(1)+" "+D+B.substring(1));

    }
}
