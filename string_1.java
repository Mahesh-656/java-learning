public class string_1 {
    public static void main(String[] args) {
        String s="Java is a programming language";
        int count=1;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
           if(ch==' '){
               count++;
            }
            System.out.println(count);
        }


    }
}
