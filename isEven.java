import java.util.Scanner;

public class isEven {

    public static boolean Even(int num) {
        if (num % 2 == 0) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        sc.close();

        if (Even(num)) {
            System.out.print("even");
        } else
            System.out.print("odd");

    }
}