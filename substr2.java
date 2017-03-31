import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
        List<String> list = new ArrayList<String>();
        for(int i=0;i<=s.length();i++)
        {
          if(s.length()-i>=n){
            list.add(s.substring(i,n+i));
          }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));

    }
}
