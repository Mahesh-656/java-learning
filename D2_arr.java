public class D2_arr {
    public static void main(String[] args) {
        int [][]a=new int[3][3];
        a[0][0]=1;
        a[0][1]=2;
        a[0][2]=3;
        a[1][0]=2;
        a[1][1]=3;
        a[1][2]=4;
        a[2][0]=1;
        a[2][1]=6;
        a[2][2]=5;
    for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }


    }
}
