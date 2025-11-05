// Computes the future value of a saving investment.
public class FVCalc {
    public static void main(String[] args) {
        int currentValue = Integer.parseInt(args[0]);
        currentValue = Math.abs(currentValue);

        double rate = Double.parseDouble(args[1]);
        rate = rate / 100;

        int n = Integer.parseInt(args[2]);
        n = Math.abs(n);

        double futureValue = Math.pow(rate + 1, n) * currentValue;

        System.out.println("After " + n + " years, $" + currentValue +
                " saved at " + (rate * 100) + "% will yield $" + (int)(futureValue));
    }
}
