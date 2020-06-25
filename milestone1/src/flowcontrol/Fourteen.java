package flowcontrol;

public class Fourteen {
	public static void main(String[] args) {
		int k=Integer.parseInt(args[0]);
		int r=0,s=0;
		while(k!='\0')
		{
			r=k%10;
			s=s+r;
			k=k/10;
		}
		System.out.println(s);
	}

	
}
