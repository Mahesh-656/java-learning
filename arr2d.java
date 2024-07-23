public class arr2d {
    public static void main(String[] args) {
        int [][]a={{9,8,7},{6,5,4},{3,2,1}};
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                if(i==j){
                    a[i][j]=0;
                }
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
