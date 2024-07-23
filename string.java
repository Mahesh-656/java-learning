import java.lang.String;
public class string {
    public static void main(String[] args) {
      String str="Hello";
      int i=0;
        while (i<str.length()) {
            char ch=str.charAt(i);
            if(ch>='a'&&ch<='z'){                    //first we should check the given str is cap or lowerr letter ...
                 ch = (char) (str.charAt(i) - 32);
            }
            i++;
            System.out.print(ch);

}
    }
}
