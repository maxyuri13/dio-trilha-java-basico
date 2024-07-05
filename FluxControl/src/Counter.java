import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Enter the first parameter");
        int firstParameter = terminal.nextInt();
        System.out.println("Enter the second parameter");
        int secondParameter = terminal.nextInt();

        try {

            count(firstParameter, secondParameter);

        } catch (InvalidParametersException exception) {
            System.out.println("The second parameter must be greater than the first");
        }

    }

    static void count(int firstParameter, int secondParameter) throws InvalidParametersException {
        if (firstParameter > secondParameter) {
            throw new InvalidParametersException("The second parameter must be greater than the first");
        }

        int score = secondParameter - firstParameter;
        for (int i = 1; i <= score; i++) {
            System.out.println(i);
        }
    }
}

class InvalidParametersException extends Exception {
    public InvalidParametersException(String message) {
        super(message);
    }
}