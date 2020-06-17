package milestone1;

public class ninteen
{
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int i,j;
		for(i=0;i<a;i++)
		{
			for(j=0;j<=i;j++)
				System.out.print("* ");
			System.out.println("");
		}
		
	}

}
