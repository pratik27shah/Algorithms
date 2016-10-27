/**
 * 
 */
package sent_reverse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.management.Query;

/**
 * @author PRATIK SHAH
 *Reversing a Case Sensistive STring
 */
public class Sentrev {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I Love India, India is my NaTiOn";
		Reverse reverse = new Reverse();
		reverse.rev(test);
	}

}

class Reverse {
	String revnew = "";
	Stack stack = new Stack();
	HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	// Queue que= new LinkedList<String>();
	String temp = "";
	void rev(String str) {
		Stack stack = new Stack();
		
		int len = str.length() - 1;
		for (int i = 0, j = str.length() - 1; i < str.length(); i++, j--) {

			if (Character.isUpperCase(str.charAt(j))) {
				hashmap.put(len - j, str.charAt(i) + "");

			}
			if (hashmap.containsKey(i) && str.charAt(i) != ' ')
				temp = temp + Character.toUpperCase(str.charAt(i));
			else
				temp = temp + Character.toLowerCase(str.charAt(i));

			if (str.charAt(i) == ' ' ) {
				stack.push(temp);
				temp="";

			}
			
			if(i == str.length() - 1){stack.push(temp+" ");}
	}
			while (!stack.isEmpty()) {

				System.out.print(stack.pop());

			}

		
	}
}