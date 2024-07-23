public class sum_col {
    public static void main(String[] args) {
        int[][] a = {{90, 30, 80}, {70, 33, 85}, {86, 35, 39}, {22, 25, 34}};
        for (int i = 0; i < a.length; i++) {
            int b=0;
            int sum[] = new int[a[0].length];
            for (int j = 0; j < a[i].length; j++) {
                for(int k:a[i]){
                 b+=a[k][j];
                    System.out.print(a[k][j] + " ");
                }
                System.out.println();

            }
        }
    }
}

