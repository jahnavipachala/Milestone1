package flowcontrol;

public class Five {
	public static void main(String[] args) {
		
		char ch=args[0].charAt(0);
		if(ch>='A' &&ch<='z')
			System.out.println("Alphabets");
		else if(ch>='0'&&ch<='9')
			System.out.println("Digits");
		else
			System.out.println("Special Character");
		}

}
