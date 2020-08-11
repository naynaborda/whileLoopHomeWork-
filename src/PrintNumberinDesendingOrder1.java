import java.util.Scanner;

public class PrintNumberinDesendingOrder1 {
    public static void main(String[] args) {
        //1.WAP to print 10,9,8,7,6 to 0
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to decrease to 0:");
        int number = scanner.nextInt();
        while (number >= 0) {
            System.out.println(number);
            number--;
        }
    }
}
