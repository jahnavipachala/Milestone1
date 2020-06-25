package arrays;

public class FIVE {
	public static void main(String[] args) {
		int A[],max1=0,max2=0,i,t=0;
		System.out.println("enter size of array");
		int k=Integer.parseInt(args[0]);
		A = new int[k];
		System.out.println("enter elemets in array");
		 for ( i=1;i<=k;i++)
				A[i-1]=Integer.parseInt(args[i]);
		 for(i=0;i<k;i++)
		 {
			 if(max1<A[i])
			 {	max2=max1;
				 max1=A[i];
				 
			 }
		 }
		 System.out.println("max1 of arary "+max1+" max2 of array"+max2);
		 int min1=max1,min2=max2;
		 for ( i=0;i<k;i++)
		 {
				if(min1>A[i])
				{
					min1=A[i];
					t=i;
				}
		 }
		A[t]=max1;
		 for ( i=0;i<k;i++)
				if(min2>A[i])
				min2=A[i];	 
		 System.out.println("min1 of arary "+min1+" min2 of array"+min2);
	}
}
