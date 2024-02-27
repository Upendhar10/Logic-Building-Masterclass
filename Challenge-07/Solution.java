import java.util.Scanner;

public class LargestAmongThreeNum {

    // # Largest among three numbers
    public static void largestAmongThree(double num1, double num2, double num3){

        if(num1 > num2){
            if(num1 > num3){
                System.out.println(num1 + " is greater");
            }else{
                System.out.println(num3 + " is greater");
            }
        }else{
            if(num2 > num3){
                System.out.println(num2 + " is greater");
            }else{
                System.out.println(num3 + " is greater");
            }
        }
    }

    // # Smallest among three numbers
    public static void smallestAmongThree(double num1, double num2, double num3){

        if(num1 < num2){
            if(num1 < num3){
                System.out.println(num1 + " is smaller");
            }else{
                System.out.println(num3 + " is smaller");
            }
        }else{
            if(num2 < num3){
                System.out.println(num2 + " is smaller");
            }else{
                System.out.println(num3 + " is smaller");
            }
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        System.out.println("Largest Among three numbers");
        largestAmongThree(num1,num2,num3);
        System.out.println("Smallest Among three numbers");
        smallestAmongThree(num1,num2,num3);
    }
}
