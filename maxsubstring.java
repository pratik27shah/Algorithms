package prac;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/*Find the length of the longest substring T of a given string 
 * (consists of lowercase letters only) such that every character in T appears no less than k times.
 * eg:input :aabaaccee ,k=2
 * ouput:6 (aaccee)
 * 
 * input:abaabed,k=2
 * ouput:5 abaab
 *  */
public class maxsubstring {

	public static void main(String[] args) {
		HashMap<String, Integer> hashvalues = new HashMap<String, Integer>();
		HashMap<String, Integer> Quehashvalues = new HashMap<String, Integer>();
		Queue<String> que = new LinkedList<String>();
		int k = 2;
		String str = "abaabed";
		String newstr = "";
		for (int i = 0; i < str.length(); i++) {
			if (hashvalues.containsKey(str.substring(i,i+1))) {
				hashvalues.put(str.substring(i,i+1), hashvalues.get(str.substring(i,i+1)) + 1);

			}

			else
				hashvalues.put(str.substring(i,i+1), 1);

		}

		for (int i = 0; i < str.length(); i++) {
			if (Quehashvalues.containsKey(str.substring(i,i+1))) {
				Quehashvalues.put(str.substring(i,i+1), Quehashvalues.get(str.substring(i,i+1)) + 1);

			} else
			{
				Quehashvalues.put(str.substring(i,i+1), 1);
	
			}
			if (hashvalues.get(str.substring(i,i+1)) >= k) {
			//	newstr = newstr + str.substring(i,i+1);

			
				que.add(str.substring(i,i+1));
			} else {
				if(!que.isEmpty()){
				
				newstr=que.peek();
				if(Quehashvalues.get(newstr)<k)
				{
					que.poll();
					
				}
				}
			}
		}
		System.out.println(que);

	}

}
