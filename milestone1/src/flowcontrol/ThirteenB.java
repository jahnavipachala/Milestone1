package flowcontrol;

public class ThirteenB {
	public static void main(String[] args) 
	{
		int i,c=0;
		
		
		int k=Integer.parseInt(args[0]);
		if(k=='\0')
			System.out.println("Please enter an integer number ");
		if(k==0 ||k==1)
			System.out.println(k+" is neither prime nor composite");
		else
		{
			for(i=2;i<k;i++)
				if(k%i==0)
					c++;
			if(c==0)
				System.out.println(k+" is a prime number");
			else
				System.out.println(k+" is not a prime number");
			c=0;
		}
}
}