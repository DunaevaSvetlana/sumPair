public class sumPair {
    public static void main(String[] args) {
        int sum = 0;
        int n = 100;
        for (int i = 1; i < n + 1; i++) {
            if (i % 2 == 0) {
                sum = sum - i;
            } else {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
