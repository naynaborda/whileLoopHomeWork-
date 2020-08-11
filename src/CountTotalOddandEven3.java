import java.util.Scanner;

public class CountTotalOddandEven3 {
    /*3.WAP to input any five-digit number then count total no of odd and even digit and find sum of
    them
     */
    public static void main(String[] args) {

        int evenCount = 0;
        int oddCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 5 digits number to count total no of odd & even numbers:");
        int number = scanner.nextInt();
        while (number > 0) {
            int rem = number % 10;

            if (rem % 2 == 0)
                evenCount++;
            else
                oddCount++;
            number = number / 10;
        }
        System.out.println("Even Count =" + evenCount);
        System.out.println("Odd Count =" + oddCount);
        System.out.println("Sum of even & Odd Number is = " + (evenCount + oddCount));


    }
}
