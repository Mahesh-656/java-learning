public class arr_demo2 {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40};
        int b[] = {50, 60, 70, 80};
        int c[] = new int[a.length + b.length];
//        merging two numbers in the array
        int index=0;
        for (int i = 0; i < (a.length+b.length); i++) {
            c[index] = a[i]+b[i];
            index++;
        }

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+" ,");
        }
    }
}
