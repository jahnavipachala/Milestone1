package milestone1;

public class twenty {
	public static void main(String[] args) {
		int k=Integer.parseInt(args[0]);
		int r,s=0;
		while(k!='\0')
		{
			r=k%10;
			s=(s*10)+r;
			k=k/10;
		}
		System.out.println(s);
	}

}
