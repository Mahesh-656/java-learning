public class diagonalarr {
    public static void main(String[] args) {
        int [][]a={{1,2,3,4},{5,6,7,8},{9,7,6,4},{3,5,7,9}};
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            for(int j=0;j<a.length;j++){
                if(i+j==3){
                    sum+=a[i][j];
//                    a[i][j]=sum;
                }
                System.out.print(a[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println("sum of diagonal: "+sum);
    }
}
