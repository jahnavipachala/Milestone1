package milestone1;
public class ten
{	public static void main(String[] args)
	{
		char ch=args[0].charAt(0);
		if(ch>='a'&&ch<='z')
		System.out.println((char) (ch-32));
		else
		System.out.println((char) (ch+32));
			
	}
}
