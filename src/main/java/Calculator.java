import java.util.Scanner;

public class Calculator {
    public void getInput(Model values) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        values.setFirst(sc.nextDouble());
        values.setSecond(sc.nextDouble());
        sc.close();

    }

    public double add(double i, double j) {
        return i + j;
    }

    public double mul(double i, double j) {
        return i * j;
    }

    public double sub(double i, double j) {
        return i - j;
    }

    public double div(double i, double j) {
        if (j != 0) {
            return i / j;
        } else {
            return 0;
        }
    }


}
