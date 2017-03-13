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
		int k = 2;
		String newstr="",tempstr="";
		String str = "aabaaccee";
	
		for (int i = 0; i < str.length(); i++) {
			if (hashvalues.containsKey(str.substring(i,i+1))) {
				hashvalues.put(str.substring(i,i+1), hashvalues.get(str.substring(i,i+1)) + 1);

			}

			else
				hashvalues.put(str.substring(i,i+1), 1);

		}
		
		for(int i=0;i<str.length();i++)
		{
			
			if(hashvalues.get(str.substring(i,i+1))<k)
			{
				
				if(newstr.length()<tempstr.length())
					newstr=tempstr;
				tempstr="";
			}
			
			else
			{
				
				tempstr=tempstr+str.substring(i,i+1);
			}
		}
		if(newstr.length()<tempstr.length())
			newstr=tempstr;
	System.out.println(newstr);
	}}
