package flowcontrol;

public class Seventeen {
	public static void main(String[] args)
	{
		int k=Integer.parseInt(args[0]);
		int r,s=0,k1=k;
		while(k!='\0')
		{
			r=k%10;
			s=(s*10)+r;
			k=k/10;
		}
		if(k1==s)
		System.out.println(k1+" is a palindrome");
		else
		System.out.println(k1+" is not a palindrome");
		
	}
}
