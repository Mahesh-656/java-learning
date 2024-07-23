public class arr_search {
    public static void main(String[] args) {
        int a[]={1,2,3,4,2,3};
        int b=2;
        int count=0;
        for (int i:a
             ) {
            if(i==b){
                count++;
            }
        }
        System.out.println(b+" is printed "+count+" times present");
    }
}
