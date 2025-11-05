// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String Dan = args[0];
		String Lisa = args[1];
		String Ron = args[2];
		int total = Integer.parseInt(args[3]);
		double each = total / 3.0;
		each = Math.ceil(each);
		System.out.println( "Dear "+ Ron +", "+ Lisa + " , and " + Dan + ": pay " + each + " Shekels each.");

	}
}
