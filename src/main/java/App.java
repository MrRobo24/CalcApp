public class App {

    public static void main(String[] args) {
        System.out.println("CalcApp\n");
        //initializing the values for calculation
        Model values = new Model(0, 0);

        //getting values from user
        Calculator calc = new Calculator();
        calc.getInput(values);

        //performing calculations
        double sum = calc.add(values.getFirst(), values.getSecond());
        double sub = calc.sub(values.getFirst(), values.getSecond());
        double mul = calc.mul(values.getFirst(), values.getSecond());
        double div = calc.div(values.getFirst(), values.getSecond());

        //displaying answers
        System.out.println("Addition is: " + sum);
        System.out.println("Subtraction is: " + sub);
        System.out.println("Product is: " + mul);
        System.out.println("Quotient is: " + div);

        System.out.println();

    }
}