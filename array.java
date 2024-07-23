import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int  a []= new int[5];
//        first way to initialize the array
//       a[0]=10;
//        a[1]=20;
//        a[2]=30;
//        a[3]=40;
//        a[4]=50;
////to fetch the data in the array
////        System.out.println(a[4]);
//for(int i=0;i<a.length;i++){
//    System.out.println(a[i]);
//}          second way to initialize the array
        Scanner s=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();

        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
