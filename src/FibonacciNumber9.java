import java.util.Scanner;

public class FibonacciNumber9 {
    //9.WAP to input any number (n) and find out Fibonacci number in between 0 to given number(n).
    //Fibonacci number is the sum of two preceding numbers,starting from 0 and 1 eg 0+1=1.1+1=2,2+1=3,2+3=5
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number up to you want to check Fibonacci number: ");
        int number = scanner.nextInt();
        System.out.print(n1 + ", " + n2);//0+1=1

        while (n3 <= number) {//0<100
            n3 = n1 + n2;//0=0+1(answer is 1)
            if (n3 >= number)//1>=100
                break;
            System.out.print(", " + n3);//1
            n1 = n2;//0=1
            n2 = n3;//1=1

        }
    }


}


