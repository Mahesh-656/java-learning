import java.util.Arrays;

public class Arraysorting {
    public static void main(String[] args) {
        int []a={2,0,0,2,2,2,0,2,0};
        int b=a.length-1;
        int c=0;
        int d[]=new int[a.length];
        for (int i = 0; i <a.length; i++) {
            if(a[i]==0){
                d[b]=a[i];
                b--;
            }else{
                d[c]=a[i];
                c++;
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(d));
    }
}
