/**
 * 
 */
package naivetring;

/**
 * @author PRATIK SHAH
 *
 */
public class naivestring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		naive n1=new naive();
		n1.match("zzxxxsabacdcads", "saba");
	}

}

class naive {
	public void match(String s, String t) {
		int s1 = s.length();
		int t1 = t.length();
		int j = 0;
		for (int i = 0; i <= (s1 - t1); i++) { //complexity 0((n-m+1)m)
			for (j = 0; j < t1; j++) {
				if (s.charAt(i + j) != t.charAt(j))
					break;
			}
	if(j==t1)
		{System.out.println("OK");
		break;
		}
		}	
		
	}
}
