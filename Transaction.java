public class Transaction {
    public static void main(String[] args) {
        int Bounes=100;
        int Transaction_bounes=2;
        int Transaction=3;
        int Transaction1=25;
        int Transaction2=20;
        int Transaction3=50;
        int Totaltransaction=Transaction_bounes*Transaction;
        int Finalmoney=Bounes+Totaltransaction-Transaction1-Transaction2+Transaction3;
        System.out.println("Login bounes:"+Bounes);
        System.out.println("For first 3 Transaction bounes :"+Transaction_bounes);
        System.out.println("no of transaction done:"+Transaction);
        System.out.println("He transferred money to his friend:"+Transaction1);
        System.out.println("He bought an item:"+Transaction2);
        System.out.println("received a money from is fatherTransaction3:"+Transaction3);
        System.out.println("Total transaction bounes:"+Totaltransaction);
        System.out.println("Ewallet balance:"+Finalmoney);


    }
}
