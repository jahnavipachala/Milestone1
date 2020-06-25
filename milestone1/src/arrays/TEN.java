package arrays;
public class TEN {
	public static void main(String[] args) {	
		int b[],i,j=0,k=0,e[],o[],a=args.length;
		b=new int[a];
		e=new int[a];
		o=new int[a];
		for(i=0;i<a;i++)
		{
			b[i]=Integer.parseInt(args[i]);
			if(b[i]%2==0)
				e[j++]=b[i];
			else
				o[k++]=b[i];
		}
		for(i=0;i<j;i++)
			System.out.print(e[i]+" ");
		for(i=0;i<k;i++)
			System.out.print(o[i]+" ");
	}
}
