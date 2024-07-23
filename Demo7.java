import java.util.*;
public class Demo7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the marks:");
        int marks=s.nextInt();
        if(marks>=90&&marks<=100) {
            System.out.println("EXCELLENT");
        } else if (marks>=60&&marks<=90) {
            System.out.println("AVERAGE");
        } else if (marks>=40&&marks<=60) {
            System.out.println("NOT BAD");
        } else {
            System.out.println("BAD");

        }

    }
    }
