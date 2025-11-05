// Generates three integer random numbers in a given range,
// and prints them in increasing order.

import java.util.function.IntPredicate;

public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int lim = Integer.parseInt(args[0]);
		int a = (int)(Math.random() * lim);
		int b = (int)(Math.random()*lim);
		int c = (int)(Math.random()*lim);
		int min1 = Math.min(a ,b);
		int min = Math.min(min1,c);
		int max1 = Math.max(a , b );
		int max = Math.max(max1,c);
		int middle = (int) (a + c + b - min - max);
		System.out.println(min +" " +middle + " " + max );

	}
}
