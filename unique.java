public class unique {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 1, 5, 3, 7, 8};
        for (int i : a) {
            int temp = i;
            int count = 0;
            for (int j : a) {
                if (j == temp) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(temp);
            }

        }
    }
}
