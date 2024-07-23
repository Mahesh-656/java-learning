public class search_arr {
    public static void main(String[] args) {
        int a[]={1,23,2,45,6};
        System.out.println(m1(a,23));
//        searching an number by using method in array
    }
    public static boolean m1(int a[],int b) {
//        boolean f = false;
        for (int i : a) {
            if (i == b) {
                return true;
            }


        }

        return false;
    }
}
