import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapsex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> mp=new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            mp.put(name, phone);
        }
        while(n>=0){
            String s = in.next();
            // Write code heres
            if(mp.containsKey(s)){
            	System.out.println(s+"="+mp.get(s));
            }
            else{
            	System.out.println("Not found");
            }
            n--;
        }
        in.close();

	}

}
