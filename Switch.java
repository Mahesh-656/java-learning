public class Switch {
    public static void main(String[] args) {
        String a="Orange";
        switch (a){
            case "Apple":
                System.out.println("An apple a day keeps the doctor away.");
                break;
            case "Banana":
                System.out.println("Bananas are a good source of potassium");
                break;
            case "Orange":
                System.out.println("Oranges are rich in vitamin C");
                break;
            case "Mango":
                System.out.println("Mangoes are delicious!");
                break;
            default:
                System.out.println("Enter a correct fruit");
        }
    }
}
