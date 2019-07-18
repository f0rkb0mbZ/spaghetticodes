import java.util.Scanner;

class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}

class MyCalculator{
    long power(int n, int p) throws MyException{
        long result = 1;
        if (n < 0 || p < 0) {
            throw new MyException("java.lang.Exception: n or p should not be negative.");
        } else if (n == 0 && p == 0) {
            throw new MyException("java.lang.Exception: n and p should not be zero.");
        } else {
            while (p-- != 0) {
                result *= n;
            }
            return result;
        }
    }
}

public class customException {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}