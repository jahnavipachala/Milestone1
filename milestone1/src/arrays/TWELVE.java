package arrays;
public class TWELVE {
public static void main(String[] args) {
	int a[],b[],i,j;
	a=new int[3];
	b=new int[3];
	for(i=0;i<3;i++)
		a[i]=Integer.parseInt(args[i]);
	for(j=0;j<3;j++)
	{
		b[j]=Integer.parseInt(args[i]);
		i++;
	}
	System.out.println(a[1]+","+b[1]);
}
}
