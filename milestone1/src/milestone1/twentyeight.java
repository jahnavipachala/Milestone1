package milestone1;

public class twentyeight {
	public static void main(String[] args) {
		int A[],i,j,t=0;
		System.out.println("enter size of array");
		int k=Integer.parseInt(args[0]);
		A = new int[k];
		System.out.println("enter elemets in array");
		 for (i=1;i<=k;i++)
				A[i-1]=Integer.parseInt(args[i]);
		 for(i=0;i<k;i++)
			 for(j=i;j<k;j++)
				 if(A[i]>A[j])
				 {
					 t=A[i];
					 A[i]=A[j];
					 A[j]=t; 
				 }
		 for(i=0;i<k;i++)
			 System.out.print(A[i]+" ");
					 
		 
	}

}
