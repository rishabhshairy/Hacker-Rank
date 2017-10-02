import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class strEx {

    static StringBuffer super_reduced_string(StringBuffer s){
		
    	for(int i=1;i<s.length();i++) {
			if(s.charAt(i)==s.charAt(i-1)) {
				s.delete(i-1,i+1);
				i=0;
			}
			
		}
    	if(s.length()==0) {
			System.out.println("Empty String");
		}
		
		return s;
    	
    	
    
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer s = new StringBuffer(in.nextLine());
        StringBuffer result = super_reduced_string(s);
        System.out.println(result);
    }
}
