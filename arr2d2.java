public class arr2d2 {
    public static void main(String[] args) {
        int [][]a=new int[4][4];
        int num=1;
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=num;
                if(i==j){
                    sum=sum+num;
                    a[i][j]=num;
                }
             System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("sum of diagonal: "+sum);
    }
}
