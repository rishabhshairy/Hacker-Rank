import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int i,p=0;
        for(i=1;i<=10;i++){
        	p=i*N;
        	System.out.println(N+" x "+i+" = "+p);
        }

    }
}
