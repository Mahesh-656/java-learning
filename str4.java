public class str4 {
    public static void main(String[] args) {
        String s="java is a programming language";
        String a="";
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='a'){
                ch='@';
            }
          a+=ch;
        }
        System.out.println(a);
    }
}
