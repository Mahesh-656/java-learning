public class Lap {
    String brand;
    int ram;
    int rom;
    int price;
    int modelno;
    String processor;

    public void Editing(){
        System.out.println("Graphics editing");

    }
    Lap(String brand,int ram,int rom,int price,String processor,int modelno){
        this.brand=brand;
        this.ram=ram;
        this.rom=rom;
        this.price=price;
        this.processor=processor;
        this.modelno=modelno;
    }
    Lap(String brand,int ram,int rom,int price,String processor){
        this.brand=brand;
        this.ram=ram;
        this.rom=rom;
        this.price=price;
        this.processor=processor;
    }
    Lap(String brand,int ram,int rom,int price){
        this.brand=brand;
        this.ram=ram;
        this.rom=rom;
        this.price=price;
    }
    Lap(){

    }
    public void data(){
        System.out.println("Storing the data in Excel");
    }
    public void movies(){
        System.out.println("Watching webseries");
    }
}
