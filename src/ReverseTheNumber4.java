import java.util.Scanner;

public class ReverseTheNumber4 {
    //4.WAP to Input any fiv-digit number and then reverse the number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any five digit number to reverse it:");
        int number = scanner.nextInt();
        int rem = 0;
        int reverse = 0;
        while (number > 0) {
            //to find out reminder
            rem = number % 10;//12345%10=5,1234%10=4,123%10=3,12%10=2,1%10=0
            //add reminder into sum
            reverse = reverse * 10 + rem;//0*10+5=5,5*10+4=54,54*10+3=543,543*10+2=5432,5432*10+1=54321
            //change value of number variable
            number = number / 10;//12345/10=1234,1234/10=123,123/10=12,12/1=1
        }
        System.out.println("Reverse Number is " + reverse);

    }

}
