public class Smart_Watch extends Watch{
    String Battery_Type;
//    String Can_make_Calls;
//    String Health_Monitor;
    Smart_Watch(){

    }
    Smart_Watch( String Battery_Type){
        this.Battery_Type=Battery_Type;
//        this.Can_make_Calls=Can_make_Calls;
//        this.Health_Monitor=Health_Monitor;
    }
    public void battery(){
        System.out.println("Battery mode: "+this.Battery_Type);
    }
    public void call(){
        System.out.println("can make calls");
    }
    public void health_monitor(){
        System.out.println("it informs the health details");
    }

    @Override
    public void time() {
        System.out.println("Time is running");
    }
}
