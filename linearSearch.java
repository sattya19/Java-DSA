import java.util.Scanner;

public class linearSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int nextNum = sc.nextInt();
        int[] arr = new int[nextNum];
        int key;

        for (int i = 0; i < nextNum; i++) {
            System.out.print("Enter element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        key = sc.nextInt();
        sc.close();
        if (search(key, arr)) {
            System.out.println("Element found.");
        } else {
            System.out.println("Element not found.");
        }
    }

    public static boolean search(int key, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }
}
