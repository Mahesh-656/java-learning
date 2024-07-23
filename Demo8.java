public class Demo8 {
    public static void main(String[] args) {
        String day="Tuesday";
        switch (day){
            case "Monday": {
                System.out.println("Lets play Basket Ball");
                break;
            }
            case "Tuesday":{
                System.out.println("Lets play Tennies");
                break;
            }
            case "Wednesday":{
                System.out.println("lets play Basket Ball");
                break;
            }
            case "Thursday":{
                System.out.println("lets play cricket");
                break;
            }
            case "Friday":{
                System.out.println("lets play Tennies");
                break;
            }
            case "Saturday":{
                System.out.println("Lets do exercise");
                break;
            }
            case "Sunday":{
                System.out.println("Holiday");
            }
            default:
                System.out.println("Invalid day");

        }
    }
}
