public class Demo12 {
    public static void main(String[] args) {
        int a[]={51,63,77,80,90};
        int sum=0;
        for(int b:a){
            if(b%2==0){
                sum+=b;


            }
        }
        System.out.println(sum+" :even marks");
    }
}
