public class Sum_row {
    public static void main(String[] args) {
        int [][]a={{90,30,80},{70,33,85},{86,35,39},{22,25,34}};
        for (int i = 0; i <a.length ; i++) {
            int sum=0;
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
                    sum+=a[i][j];
            }
            System.out.println(" = "+sum);
        }
    }
}
