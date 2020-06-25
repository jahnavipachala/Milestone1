package arrays;
public class SECOND {
	public static void main(String[] args) 
	{
		int A[],max=0;
		System.out.println("enter size of array");
		int k=Integer.parseInt(args[0]);
		A = new int[k];
		System.out.println("enter elemets in array");
		 for (int i=1;i<=k;i++)
		 {
				A[i-1]=Integer.parseInt(args[i]);
				if(max<A[i-1])
					max=A[i-1];	
		 }
		 System.out.println("max of arary "+max);
		 int min=max;
		 for (int i=1;i<=k;i++)
				if(min>A[i-1])
					min=A[i-1];	
		 System.out.println("min of arary "+min);	 
	}
}
