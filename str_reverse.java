public class str_reverse {
    public static void main(String[] args) {
        String s="malayalaM";
        String a="";
        for (int i = s.length()-1; i >=0; i--) {
            char ch=s.charAt(i);
         a+=ch;

        }
        if(s.equalsIgnoreCase(a)){
            System.out.println(a+" :Is a palindrome");
        }else{
            System.out.println(a+" :Not a palindrome");
        }

    }
}
