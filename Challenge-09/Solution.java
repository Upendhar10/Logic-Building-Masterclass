import java.util.Scanner;

public class sumANDproduct {

    // Sum of n natural numbers
    public static int sum(int n){
        int sum = 0;
        for(int i=0; i<=n; i++){
            sum += i;
        }
        return sum;
    }

    // Product of n natural numbers
    public static int product(int n){
        int product = 1;
        for(int i=1; i<=n; i++){
            product *= i;
        }
        return product;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter n value: ");
        int n = input.nextInt();

        System.out.println("Sum : " + sum(n));
        System.out.println("Product : " + product(n));
    }
}
