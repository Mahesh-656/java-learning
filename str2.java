public class str2 {
    public static void main(String[] args) {
        String s = "mahigowda416@gmail.com";
        String a="";
        int count=0;
        int Icount=0;
        int scount=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
              a+=ch;
               count++;
            }
          else if(ch>='1'&&ch<='9'){
               Icount++;
           }else{
              scount++;
            }
        }
        System.out.println(count+" :no of characters");
        System.out.println(Icount+" :numbers");
        System.out.println(scount+" :No of special characters");
    }
}
