package milestone1;

public class twentysix {
	public static void main(String[] args) {
		int A[],i;
		char x;		
		System.out.println("enter size of array");
		int k=Integer.parseInt(args[0]);
		A = new int[k];
		System.out.println("enter elemets in array");
		 for (i=1;i<=k;i++)
		 {
				A[i-1]=Integer.parseInt(args[i]);
				x=(char) (A[i-1]);
				System.out.print(x);
		 } 
	}

}
