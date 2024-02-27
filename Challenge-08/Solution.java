/*
To determine if a year is a leap year, the following rules are used:

1. If the year is evenly divisible by 4, go to step 2.
2. If the year is evenly divisible by 100, go to step 3.
3. If the year is evenly divisible by 400, the year is a leap year.
4. If the year is not evenly divisible by 100 or is evenly divisible by 400, the year is a leap
year.
5. If none of the above conditions are met, the year is not a leap year.

Using these rules, you can determine if a year is a leap year by checking the following conditions:

If the year is evenly divisible by 4 and not by 100, or is evenly divisible by 400, the year is a leap year.
If none of these conditions are met, the year is not a leap year.

*/

import java.util.Scanner;

public class LeapYear {
    public static void leapyear(int year){

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " is a leap year");
        }else {
            System.out.println(year + " is not a leap year");
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Year! : ");
        int year = input.nextInt();
      
        leapyear(year);
      
    }
}
