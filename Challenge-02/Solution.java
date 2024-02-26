import java.util.Scanner;

public class Calculator {
    public static double add(int num1,int num2){
        return num1 + num2;
    }

    public static double sub(int num1,int num2){
        return num1 - num2;
    }

    public static double multiply(int num1,int num2){
        return num1 * num2;
    }

    public static double division(int num1,int num2){
        return (double) num1 / num2;
    }

    public static double Remainder (int num1,int num2){
        return num1 % num2;
    }

    public static double Exponent (int num1, int num2){
        return Math.pow(num1,num2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();

        System.out.println("Choose your Operator[+,-,*,/,%,**]");

        String Operator = input.next();

        switch (Operator) {
            case "+" -> System.out.println(add(number1, number2));
            case "-" -> System.out.println(sub(number1, number2));
            case "*" -> System.out.println(multiply(number1, number2));
            case "/" -> System.out.println(division(number1, number2));
            case "%" -> System.out.println(Remainder(number1, number2));
            case "**" -> System.out.println(Exponent(number1, number2));
            default -> System.out.println("Invalid Option");
        }
    }
}
