public class Driver {
    public static void main(String[] args) {
        engine_car a=new engine_car("BMW","black",4,4);
        System.out.println(a.getBrand());
        System.out.println(a.getColor());
        System.out.println(a.getNo_seats());
        System.out.println(a.getNo_tyres());
        a.engine.start();
        a.engine.stop();
        System.out.println(a.engine.no_valve);
        a.stop();
        System.out.println(a.tyre[0].type);
        System.out.println(a.tyre[1].size);
        System.out.println(a.tyre[2].brand);
        System.out.println(a.tyre[3].capacity);
    }
}
