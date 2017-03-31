import java.io.*;
import java.util.*;

public class Solution {

public static void main(String[] args) {
  static boolean isAnagram(String a, String b) {

       // Complete the function by writing your code here.
      b=b.toLowerCase();
      a=a.toLowerCase();
      char [] c1=a.toCharArray();
      char [] c2=b.toCharArray();
      Arrays.sort(c1);
      Arrays.sort(c2);
      return Arrays.equals(c1,c2);

   }

    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();
    boolean ret = isAnagram(a, b);
    System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
}
}
