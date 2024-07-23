public class countoccurance {
    public static void main(String[] args) {
        int []a={1,2,3,14,1,2,3,1,14,33,333,1,3,5,333,6,5,0,0};

        for( int b=0;b<a.length;b++){
            int count=0;
            for (int i = b+1; i < a.length; i++) {
                if(a[b]==a[i]){
                    count++;
                    a[i]=Integer.MAX_VALUE;
                }

            }
            if(a[b]!=Integer.MAX_VALUE) {
                System.out.println(a[b] + " : " + count);
            }
        }
    }
}
