public class str_lencount {
    public static void main(String[] args) {
        String s="e sala cup namdhe";
        char a='A';
        for (int i = 1; i <='z'; i++) {
            int count=0;
            for (int j = 0; j < s.length(); j++) {
                if(a==s.charAt(j)){
                    count++;
                }
            }
            if(count>=1) {
                System.out.println(a+" :" +count);

            }
            a++;
        }
    }
}
