import java.util.Scanner;

public class PrimeNumber8 {
    //8.WAP to input any number and check if its prime number or not
    //positive integer that is divisible only by itself and 1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number to check if it is prime number or not: ");
        int number = scanner.nextInt();
        int count = 0;//checking the factors of the number
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                count++;
        }
        if (count == 2)
            System.out.println(number + " is a Prime number");
        else
            System.out.println(number + " is not a prime number");
    }
}