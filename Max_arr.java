public class Max_arr {
    public static void main(String[] args) {
        int a[] = {10, 20, 43, 56, 72, 20};
//        to find max starts form index
        int max=a[0];
        for (int b : a) {
            if(b>max){
                max=b;

            }
        }
        System.out.println(max+" is maximum");
    }
}
