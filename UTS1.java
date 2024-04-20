import java.util.Scanner;

public class UTS1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan tiga digit integer: ");
            int number = scanner.nextInt();
            
            if (isPalindrome(number)) {
                System.out.println(number + " adalah palindrom");
            } else {
                System.out.println(number + " bukan palindrom");
            }
        }
    }
  
    public static boolean isPalindrome(int number) {
        int digit1 = number / 100; 
        int digit3 = number % 10;  

        return digit1 == digit3;
    }
}
