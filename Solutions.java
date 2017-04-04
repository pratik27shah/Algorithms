package prac;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;
/*
 * First non-repeating character in a stream
 * Given an input stream of n characters consisting only of small case alphabets 
 * the task is to find the first non repeating character each time a character is inserted to the stream.
 * 
 * http://practice.geeksforgeeks.org/problems/first-non-repeating-character-in-a-stream/0
 * */
public class Solutions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aabcbdc";
		int flag = 0;
		String str = null;
		Queue que = new LinkedList<String>();
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		// System.out.println(input.substring(0, 1));
		que.add(input.substring(0, 1));
		System.out.println(que.peek());
		hashmap.put(input.substring(0, 1), 1);
		for (int i = 1; i < input.length(); i++) {
			flag = 0;
			if (!que.isEmpty()) {
				if (que.peek().toString().equals(input.substring(i, i + 1))) {
					flag = 1;
					que.poll();
					if (!que.isEmpty()) {
						System.out.println(que.peek());
					} else
						System.out.println("-1");
					// que.add(input.substring(i,i+1));
					hashmap.put(input.substring(i, 1 + i), hashmap.get(input.substring(i, i + 1)) + 1);

				}
			}
			if (flag == 0) {
				if (!hashmap.containsKey(input.substring(i, 1 + i))) {
					que.add(input.substring(i, i + 1));
					hashmap.put(input.substring(i, 1 + i), 1);

				}

				if (que.isEmpty())
					System.out.println("-1");
				else {
					System.out.println(que.peek());
				}

			}

		}

	}
}