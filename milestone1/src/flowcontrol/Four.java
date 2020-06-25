package flowcontrol;

public class Four {
	public static void main(String[] args) 
	{
		char ch=args[0].charAt(0);
		char ch2=args[0].charAt(1);
		if(ch>ch2)
			System.out.println(ch2+","+ch);
		else
			System.out.println(ch+","+ch2);
		
		
	}

}
