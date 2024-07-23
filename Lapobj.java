public class Lapobj {
    public static void main(String[] args) {
        Lap a=new Lap("Hp",8,512,80000,"i5",2025);
        System.out.println(a.brand);
        System.out.println(a.ram);
        System.out.println(a.rom);
        System.out.println(a.modelno);
        System.out.println( a.processor);
        System.out.println(a.price);

        System.out.println();
Lap a1=new Lap("ASUS",16,512,70000,"i7");

        System.out.println( a1.brand);
        System.out.println(a1.ram);
        System.out.println(a1.rom);
        System.out.println( a1.processor);
        System.out.println(a1.price);
    }
}
