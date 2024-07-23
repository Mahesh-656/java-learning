public class Demo9 {
    public static void main(String[] args) {
//        String light="Yellow";
//        switch (light){
//            case "Red":
//                System.out.println("Stop");
//                break;
//            case "Yellow":
//                System.out.println("Prepare to Stop");
//                break;
//            case "Green":
//                System.out.println("GO");
//                break;
//            default:
//            }

        String month="may";
        switch (month){
            case "december","january","febuary":
                System.out.println("Winter");
                break;
            case "march","april","may":
                System.out.println("spring");
                break;
            case "june","july","augest":
                System.out.println("Summer");
                break;
            case "september","october","november":
                System.out.println("Autumn");
        }
    }
}
