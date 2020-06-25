package arrays;

public class THIRTEEN {
public static void main(String[] args) {
	int a=args.length;
	if(a<4)
		System.out.println("enter four integers");
	else
	{
		int b[][],i,j,k=0;
		b=new int[a/2][a/2];
		for(i=0;i<a/2;i++)
			for(j=0;j<a/2;j++)
			{
				b[i][j]=Integer.parseInt(args[k]);
				k++;
			}	
		for(i=a/2-1;i>=0;i--) {
			for(j=a/2-1;j>=0;j--)
			{
				System.out.print(b[i][j]+" ");
			}	
			System.out.println(" ");
	}
	}
}
}
