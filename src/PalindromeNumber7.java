import java.util.Scanner;

public class PalindromeNumber7 {
    //7.WAP to input any number and check if is Palindrome number or not.
    //A palindrome number is a number that remains the same when its digits are reversed.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number to check of it is palindrome Number:");
        int number = scanner.nextInt();
        int temp = number;
        int rem;
        int reverse = 0;
        while (number > 0) {
            //to find out reminder
            rem = number % 10;
            //add reminder into sum
            reverse = reverse * 10 + rem;
            //change value of number variable
            number = number / 10;
        }
        if (temp == reverse) {
            System.out.println(" is palindrome number");
        } else {
            System.out.println(" is not palindrome number");
        }
    }
}
