package arrays;

public class SEVEN {
	public static void main(String[] args) {
		int b[],j,i,a=args.length,c[];
		b = new int[a];
		c=new int[a];
		for(i=0;i<a;i++)
		{
			b[i]=Integer.parseInt(args[i]);
			c[i]=0;
		}
		for(i=0;i<a;i++)
		{
			for(j=i+1;j<a;j++)
				if(b[i]==b[j])
					c[j]=1;
			if(c[i]==0)
				System.out.print(b[i]+" ");
		}
	}
}
