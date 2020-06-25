package classandobjects;
 class calculator
 {

static double powerDouble(double n1,double n2)
	 {
		return(Math.pow(n1,n2));
	 }
static int powerInt(int n1,int n2)
{
	return (int) (Math.pow(n1,n2));
}
 }

public class Second {
	public static void main(String[] args) {
		
		System.out.println(calculator.powerDouble(2.0,3.0));
		System.out.println(calculator.powerInt(4, 4));
		
		}

}
