import java.util.Scanner;

public class main {
    public static void binaryToDecimal(int n) {
        int myNum = n;
        int power = 0;
        int binnNum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            binnNum = binnNum + (lastDigit * (int)Math.pow(2, power));
            power++;
            n = n / 10;
        }
        System.out.println("Binary number " + myNum + " is " + binnNum + " in decimal." );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        binaryToDecimal(n);
    }
}
