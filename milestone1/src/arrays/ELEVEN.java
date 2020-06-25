package arrays;

public class ELEVEN {
public static void main(String[] args) {
	int i,p=0, a=args.length,b[];
	b=new int[a];
	for(i=0;i<a;i++)
	{
		b[i]=Integer.parseInt(args[i]);
	if(b[i]!=4 && b[i]!=1)
	{
		System.out.println("false");
		i=a;
		p=1;
	}
	}
	if(p==0)
	System.out.println("true");
	
	
}
}
