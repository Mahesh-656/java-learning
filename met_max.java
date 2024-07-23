public class met_max {
    public static void main(String[] args) {
        int b[] = {1, 3, 15, 7, 9};
        System.out.println(m1(b)+" maximum");
        System.out.println(m2(b)+" minimum");
    }
    public static int m1(int a[]) {

        int max = a[0];
        for (int i : a) {
            if (max < i) {
                max = i;
            }

        }
        return max;
    }
    public static int m2(int a[]) {

        int min = a[0];
        for (int i : a) {
            if (min > i) {
                min = i;
            }

        }
        return min;
    }
}
