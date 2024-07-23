import java.util.Scanner;

public class array_1 {
    public static void main(String[] args) {
        int a[]={20,30,40,20,50,20};
        int b;
        System.out.println(m1(a));


    }
    public static int m1(int a[]){
        int sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value");
        int b=s.nextInt();
        for(int i:a){
            if(i==b){
                sum++;
            }
        }
       return sum;
    }
}
