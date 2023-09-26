import java.util.Scanner;

public class sumOfDigits {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        sc.close();

        sum(num);

    }

    public static int sum(int num) {

        int sumOfnum = 0;
        while (num > 0) {
            int rem = num % 10;
            sumOfnum = rem + sumOfnum;
            num = num / 10;
        }

        return sumOfnum;
    }

}
