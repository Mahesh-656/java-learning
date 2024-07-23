public class Facebkobj {
    public static void main(String[] args) {
        Facebk a1=Facebk.getFacebkobj("Mahesh","1233mahi","mahigowda416@gmail.com");
        Facebk a2=Facebk.getFacebkobj("theja","1233mahi","mahigowda416@gmail.com");
        System.out.println(a1.getName());
        System.out.println(a1.getPassword());
        System.out.println(a1.getEmail());
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a2.getName());


    }
}
