package arrays;
public class THIRD {
	public static void main(String[] args) {

		int A[];
		System.out.println("enter size of array");
		int k=Integer.parseInt(args[0]);
		int i;
		A = new int[k];
		System.out.println("enter elemets in array");
		 for (i=1;i<=k;i++)
				A[i-1]=Integer.parseInt(args[i]);
		 int l=Integer.parseInt(args[i]);
		 for(i=1;i<=k;i++)
			 if(A[i-1]==l)
				 break;
		 if(i==k+1)
			 System.out.println("-1");
		 else
			 System.out.println(i-1);
	}
}
