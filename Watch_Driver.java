public class Watch_Driver{
    public static void main(String[] args) {
        Analog a1=new Analog("cell");
        Smart_Watch a=new Smart_Watch("Charging type");
        a1.Battery();
        a1.time();
        a.battery();
        a.call();
        a.health_monitor();
        a.time();
    }
}
