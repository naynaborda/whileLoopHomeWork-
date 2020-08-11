import java.util.Scanner;

public class SumOfFirstAndLastDigits5 {
    //5.WAP to input any five-digit number and then find sum of first and last digit.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any five digit number to find sum of first and last digit : ");
        int number = scanner.nextInt();
        int lastDigit = number % 10;//will return last digit of number
        //12345%10=5,1234%10=4,123%10=3,12%10=2,1%10=1
        int firstDigit = number;
        while (firstDigit >= 10) {//12545>=10
            firstDigit = firstDigit / 10; //12345/10=1234,1234/10=123,123/10=12,12/10=1
        }
        System.out.println(firstDigit);
        System.out.println(lastDigit);
        System.out.println("Sum of First and Last digit is = " + (firstDigit + lastDigit));

    }


}
