public class SumOdd {

    public static boolean isOdd(int number) {
        if (!(number % 2 == 0)) {
            return true;
        } else return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ((end >= start) && (end > 0) && (start > 0)) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum = sum + i;
                }
            }
        } else return -1;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("1 - 100: \t" + sumOdd(1, 100));
        System.out.println("(-1) - 100: \t" + sumOdd(-1, 100));
        System.out.println("100 - 100: \t" + sumOdd(100, 100));
        System.out.println("100 - (-100): \t" + sumOdd(100, -100));
        System.out.println("100 - 1000: \t" + sumOdd(100, 1000));
        System.out.println(sumOdd(100, 1000));
    }
}
