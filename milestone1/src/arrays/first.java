package arrays;
public class first {
	public static void main(String[] args) 
	{
		int A[],s=0;
		System.out.println("enter size of array");
		int k=Integer.parseInt(args[0]);
		A = new int[k];
		System.out.println("enter elemets in array");
		 for (int i=1;i<=k;i++)
				A[i-1]=Integer.parseInt(args[i]);
		for(int i=0;i<k;i++)
			s=s+A[i];
		int g=s/k;
		System.out.println("sum of array "+s+"  average of array "+g);
	}
}
