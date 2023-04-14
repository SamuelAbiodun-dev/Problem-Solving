package ProblemSolving;

public class ValueOfPi {
    public static void main(String[] args) {
        double pi = 0.0;
        int plus_minus = 1;
        int term_counter = 0;

        for (int i = 1; i <= 200000; i += 2) {
            pi += plus_minus * (4.0 / i);
            plus_minus *= -1;

            if (term_counter == 0 && String.format("%.5f", pi).startsWith("3.14159")) {
                term_counter = i;
                System.out.printf("%n No of terms needed for pi to begin with 3.14159 is: %d%n", term_counter);
            }
        }
        for (int i = 1; i <= 10; i++) {
            int numTerms = (int) Math.pow(10, i);
            double piApprox = 0.0;
            int termSign = 1;

            for (int j = 1; j <= numTerms; j += 2) {
                piApprox += termSign * 4.0 / j;
                termSign *= -1;
            }
        }
    }
}

