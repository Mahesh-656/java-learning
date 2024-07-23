public class Analog extends Watch {
    String Battery_Type;
    Analog(){

    }
    Analog(String Battery_Type){
        this.Battery_Type=Battery_Type;
    }
    public void Battery(){
        System.out.println("Battery type: "+this.Battery_Type);
    }
    @Override
    public void time(){
        System.out.println("Time is running");
    }
}
