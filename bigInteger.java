import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc=new Scanner(System.in);
       BigInteger a,b,c,d;
        a=sc.nextBigInteger();
        b=sc.nextBigInteger();
        c=a.add(b);
        d=a.multiply(b);
        String s=""+c;
        String str=""+d;
        System.out.println(s);
        System.out.println(str);
    }
}