import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        int reversed = 0;

        while (num != 0) {
            int remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num /= 10;
        }

        System.out.println("Reversed number = " + reversed);
    }
}
