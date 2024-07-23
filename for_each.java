public class for_each {
    public static void main(String[] args) {
        int []a={10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160};
        int sum=0;
//        by using this loop it will internally take all the elements in the index value
        for (int b:a
             ) {
            sum+=b;


        }
        System.out.println(sum);
    }
}
