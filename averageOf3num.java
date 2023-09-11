public class averageOf3num {

    public static int average(int a, int b, int c) {

        int avg = (a + b + c) / 3;
        return avg;
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int c = 2;
        int avg = average(a, b, c);
        System.out.println(avg);
    }

}
