public class Arraypairof2numbers {
    //    sum of pair of two numbers
    public static void main(String[] args) {
        int[] a = {60, 40, 70, 50, 30};
        int m = 0;
        int n = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (sum < a[i] + a[j]) {
                    sum = a[i] + a[j];
m=a[i];
n=a[j];
                }
            }
        }
        System.out.println(sum);
        System.out.println(m);
        System.out.println(n);
    }
}

