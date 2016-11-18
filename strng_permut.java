package string_permutations;

public class strng_permut {
//String permutation algo TIme:0(n*n!)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="dfgd554";
strings s1=new strings();
s1.permutations(str, 0, str.length()-1);
	}

}
class strings
{
	public void  permutations(String str,int k,int length)
	{
		if(k==length){
			System.out.println(str);}
		else
		for(int i=k;i<=length;i++)
		{
			
			str=swap(i,k,str);
			permutations(str, k+1, length);
			str=swap(i,k,str);
			
		}
		
	}

	private String swap(int i, int k, String str) {
		// TODO Auto-generated method stub
String new1="";
		for(int j=0;j<str.length();j++)
{
			if(j!=i && j!=k)
				new1=new1+str.charAt(j);
			if(j==i)
				new1=new1+str.charAt(k);
			else if(j==k)
			new1=new1+str.charAt(i);
}
return new1;	
	}

}