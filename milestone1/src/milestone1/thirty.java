package milestone1;
public class thirty
{
	public static void main(String[] args) {
		int A[],i=0,m=0,n=0,s=0;
		System.out.println("enter size of array");
		int k=Integer.parseInt(args[0]);
		A = new int[k];
		System.out.println("enter elemets in array");
		 for ( i=1;i<=k;i++)
				A[i-1]=Integer.parseInt(args[i]);
		 for(i=0;i<k;i++)
			 if(A[i]==6)
				  m=i;
		 for(i=m;i<k;i++)
			 if(A[i]==7)
				 n=i;
		 for(i=0;i<k;i++)
		 {
			 if(i>=m && i<=n)
				 continue;
			 else
				 s=s+A[i];
		 }
		 System.out.println(s);
		
	}

}
