public class max2_array {
    public static void main(String[] args) {
        int a[] = {1, 100, 2, 98, 3, 4, 5, 78};
        int max = a[0];
        int smax = 0;
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                smax = max;
                max = a[i];

            } else if (smax<a[i]) {
                smax=a[i];
            }
        }
        System.out.println(max);
        System.out.println(smax);

    }
}
