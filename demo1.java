public class demo1 {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 60};
        int arr1[] = {8, 22, 4, 40, 55, 9};

        for(int i=0;i< arr.length;i++){
            for (int j=0;j< arr1.length;j++) {
                if(arr[i]==arr1[j]){
                    System.out.println(arr[i]);
                }

            }
        }
    }
}