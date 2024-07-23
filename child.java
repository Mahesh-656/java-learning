public class child extends parent {
    String study;
    String car="AUDI";
    String playing_games;

     child() {
//         System.out.println(super.car);
    }

    public void games(){
        System.out.println("games valorant");
    }
    public void study(){
        System.out.println("Studying");
    }
    public void clg(){
        System.out.println("Need to go clg");
    }

    public static void main(String[] args) {
//        child a=new child();
//        parent p =(parent)a;
        parent p = new child();
        child c=(child)p;
        System.out.println(p.car);
        System.out.println(c.car);

    }
}
