public class SwapNumbers {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 14;

        swapNum(num1,num2);
        swapNumbers(num1,num2);
    }

    // # Using extra variable
    private static void swapNum(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
    }

    // # Without using extra variable
    private static void swapNumbers(int num1, int num2){
        num1 = num1 + num2; // 12 + 14 = 26
        num2 = num1 - num2; // 26 - 14 = 12
        num1 = num1 - num2; // 26 - 12 = 14

        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
    }

}
