public class rev_arr {
    public static void main(String[] args) {
        int a[]={123,456,546};

        int temp=0;
        for(int i=0;i<a.length;i++){
            int rev=0;
            int num=a[i];
            while(num>0){
                temp=num%10;
                rev=rev*10+temp;
                num/=10;
            }
           a[i]=rev;
        }
        for (int i:
            a ) {
            System.out.print(i+" ");

        }
    }
}
