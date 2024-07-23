public class str3_vowels {
    public static void main(String[] args) {
        String str="Maheshwar";
        String str1="";
        int count=0;
        int ccount=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count++;
            }else{
                ccount++;
            }
        }
        System.out.println(count+" :vowels");
        System.out.println(ccount+" :consonants");
    }
}
