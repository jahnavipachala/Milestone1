package flowcontrol;

public class FirstB {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);

		if(a%10==b%10)
			System.out.println("lastDigit("+a+"," +b+") → true");
		else
			System.out.println("lastDigit("+a+"," +b+") → false");
			
	}

}
