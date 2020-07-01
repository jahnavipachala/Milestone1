package exceptionhandling;
import java.util.*;
public class second {
	public static void main(String[] args) {
		int a =args.length,i,s=0;
		int[] b = new int[a];
		double e = 0;
		try {
			for (i = 0; i < a; i++)
				b[i] = Integer.parseInt(args[i]);
			for (i = 0; i < a; i++)
				s += b[i];
			e=s/a;
			System.out.println("sum: "+s);
			System.out.println("avg: "+e);
		} catch (NumberFormatException o) {
			System.out.println("NumberFormatException");
		} catch (ArithmeticException o) {
			System.out.println("ArithmeticException");
		} catch (InputMismatchException o) {
			System.out.println("InputMismatchException");
		}
	}}
