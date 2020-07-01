package exceptionhandling;
	import java.util.*;

	public class first {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("enter the no of elements in array");
			int p = sc.nextInt();
			int [] d = new int[p];
			System.out.println("enter the elements in  arr");
			for(int i=0;i<p;i++)
			{
				d[i]=sc.nextInt();
			}
			System.out.println("enter the i of the array element you want access ");
			int r = sc.nextInt();
			System.out.println("element at i "+r+" = "+d[r]);
			System.out.println("successfully");
		}
		catch(ArrayIndexOutOfBoundsException d)
		{
			System.out.println(d);
		}
		catch(InputMismatchException p)
		{
			System.out.println(p);
		}
		sc.close();
	}
	}
