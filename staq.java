import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class staq {
	Stack<Character> st;
	Queue<Character> ch;
	public staq() {
		// TODO Auto-generated constructor stub
		st=new Stack<Character>();
		ch=new LinkedList<Character>();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();
       

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        staq p = new staq();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );


	}

	private void pushCharacter(char c) {
		// TODO Auto-generated method stub
		st.push(c);
		
	}

	private void enqueueCharacter(char c) {
		// TODO Auto-generated method stub
		
		ch.add(c);
		
		
	}

	private Object dequeueCharacter() {
		// TODO Auto-generated method stub
		
		return ch.poll();
	}

	private Object popCharacter() {
		// TODO Auto-generated method stub
				
		return st.pop();
		
	}

}
