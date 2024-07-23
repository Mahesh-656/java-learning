import javax.swing.*;
import java.util.Scanner;

public class Demo13 {
    public static void main(String[] args) {
        int a[] = {10, 20, 43, 56, 72, 20};
        boolean f =false;        //we don't know wheather the value is present or not so we need to initialise boolean keyword
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
//       for (int b:a) {
//
//            if(b==c) {
//                System.out.println(c + " :Value is present");
//            } else{
//                System.out.println(c+" :not present");
//                }
//
//                }
               /* by checking array the value is present or not it prints mulitple times of output
                 because it keeps on checking the loop so it prints multiple times*/


        for (int b : a) {
            if (b == c) {
                f = true;
            }
        }
        if (f) {
            System.out.println(c + " :Value is present");
        } else {
            System.out.println(c + " :not present");


        }
    }


}

