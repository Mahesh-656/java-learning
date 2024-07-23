public class ATM_MAIN {
    public static void main(String[] args) {
        ATM a=new ATM(1000,"indian bank","hosur");
        System.out.println(a.getBankname());
        System.out.println(a.getLocation());
        System.out.println(a.getMoney());
    }
}
