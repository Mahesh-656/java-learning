public class STD_MAIN {
    public static void main(String[] args) {
        STD a=new STD("Mahesh",321,"mahi@gmail.com","1234321");
        System.out.println(a.getRollno());
        System.out.println("Name    : "+a.getName());
        System.out.println("Email   : "+a.getEmail());
        System.out.println("Password: "+a.getPassword());
        a.setRollno(321051);
        System.out.println("ROLL NO : "+a.getRollno());
    }
}
