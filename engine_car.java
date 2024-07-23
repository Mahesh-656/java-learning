public class engine_car {
 private String brand;
 private String color;
 private int no_seats;
  Engine engine=new Engine();
  Tyre []tyre=new Tyre[4];
    {
        for (int i = 0; i < tyre.length; i++) {
            tyre[i]=new Tyre();
        }
    }
 private int no_tyres;

    public engine_car(String brand,String color,int no_seats,int no_tyres) {
        this.brand=brand;
        this.color=color;
        this.no_seats=no_seats;
        this.no_tyres=no_tyres;
        this.engine=engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNo_seats() {
        return no_seats;
    }

    public void setNo_seats(int no_seats) {
        this.no_seats = no_seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getNo_tyres() {
        return no_tyres;
    }

    public void setNo_tyres(int no_tyres) {
        this.no_tyres = no_tyres;
    }

    public void moveing(){
      System.out.println("PO");
  }
  public void stop(){
      System.out.println("NIL");
  }
}
