package longstringsubsequence;

public class longsubseq {
/*
 * Here there are 2 cases
 * 1)If the last character of both sting is  same then delete that characater and call LCS again
 * 20IF the last character is different then delete it from one of the strings and called LCS agian
 * and return the string of greater length
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*recursive code to find longest substring*/
String st1="acbaed";
String st2="abcadf";
st1=lcs(st1,st2);
 System.out.println(st1+"  Length--->"+st1.length());

	}



public static String  lcs(String  a, String  b){
    int aLen = a.length();
    int bLen = b.length();
    if(aLen == 0 || bLen == 0){
        return "";
    }else if(a.charAt(aLen-1) == b.charAt(bLen-1)){
        return lcs(a.substring(0,aLen-1),b.substring(0,bLen-1))
    + a.charAt(aLen-1);
    }else{
        String  x = lcs(a, b.substring(0,bLen-1));
        String  y = lcs(a.substring(0,aLen-1), b);
        return (x.length() > y.length()) ? x : y;
    }
}

	

}
