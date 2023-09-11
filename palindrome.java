import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if (isPalindrome(num)) {
            System.out.println(" is a palindrome.");
        } else
            System.out.print("no");

    }

    public static boolean isPalindrome(int num) {
        int originalNumber = num;
        int rev = 0;

        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return originalNumber == rev;
    }
}
