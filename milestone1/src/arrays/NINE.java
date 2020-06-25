package arrays;

public class NINE {
	public static void main(String[] args) {
		int b[],c[],i,a=args.length,d=0,k=0,j=0;
		b=new int[a];
		c=new int[a];
		for(i=0;i<a;i++)
			b[i]=Integer.parseInt(args[i]);
		for(i=0;i<a;i++)
		{
			if(b[i]==10)
			{
				d++;
				k=1;
			}
			if(k!=1)
				c[j++]=b[i];
			k=0;
		}
		for(i=0;i<d;i++)
			c[j++]=0;
		for(i=0;i<a;i++)
			System.out.print(c[i]+" ");
		
			
			
	}

}
