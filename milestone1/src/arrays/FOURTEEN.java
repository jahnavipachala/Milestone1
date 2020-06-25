package arrays;

public class FOURTEEN {
	public static void main(String[] args) {
		
	int a=args.length;
	if(a<9)
		System.out.println("enter nine integers");
	else
	{
		 int b[][],k=0,i,j,max=0;
		b=new int[3][3];
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j]=Integer.parseInt(args[k]);
				k++;
				if(b[i][j]>max)
					max=b[i][j];
			}
		}
		System.out.println(max);
	}
	}

}
