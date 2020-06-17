package milestone1;

public class nine {
	public static void main(String[] args) 
	{
		if(args[0].equals("Male"))
		{
			int a=Integer.parseInt(args[1]);
			if(a>=1 && a<=58)
				System.out.println("the percentage of interest is 8.4%");
			if(a>=59 && a<=100)
				System.out.println("the percentage of interest is 10.5%");
		}
		else 
		{	int a=Integer.parseInt(args[1]);
			if(a>=1 && a<=58)
				System.out.println("the percentage of interest is 8.2%");
			if(a>=59 && a<=100)
				System.out.println("the percentage of interest is 9.2%");
		}
		
	}

}
