import java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a:");
        int a=s.nextInt();
        System.out.println("Enter b:");
        int b=s.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swap of a:"+a);
        System.out.println("Swap of b:"+b);
    }
}
