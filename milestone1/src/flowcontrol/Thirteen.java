package flowcontrol;

public class Thirteen {
	public static void main(String[] args) {
		int i,j,c=0;
		for(i=10;i<=99;i++)
		{
			
			for(j=2;j<i;j++)
			{
				if(i%j==0)
					c++;
			}
			if(c==0)
				System.out.println(i);
			c=0;
		}
	}
}
