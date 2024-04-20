import java.util.Scanner;

public class UTS3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan sebuah bilangan bulat: ");
            int number = scanner.nextInt();
            
            if (isPalindrome(number)) {
                System.out.println(number + " adalah palindrom.");
            } else {
                System.out.println(number + " bukan palindrom.");
            }
        }
    }

    // Return the reversal of an integer, i.e., reverse(456) returns 654
    public static int reverse(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }

    // Return true if number is a palindrome
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}
