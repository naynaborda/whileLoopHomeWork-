import java.util.Scanner;

public class ArmStrongNumber6 {
    //6.WAP to input any number rand check if it is ArmStrong number or not
    // to check armstrong number eg.153(1*1*1)+(5*5*5)+(3*3*3)=1+125+27=153
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Number to check if it is ArmStrong Number or not: ");
        int number = scanner.nextInt();
        int temp = number;
        int rem;
        int sum = 0;
        while (number > 0) {
            //to find out reminder or separate last digit
            rem = number % 10;//153%10=3,15%10=5,1%10=1
            //change value of number variable
            number = number / 10;//153/10=15,15/10=1,1/10=1
            sum = sum + rem * rem * rem;//0+3*3*3=27,27+(5*5*5=125)152,152+(1*1*1)=153
        }
        if (temp == sum) {
            System.out.println("It is an ArmStrong Number");

        } else {
            System.out.println("It is not an ArmStrong Number");
        }
    }
}



