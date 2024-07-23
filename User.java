public class User {
//    constructor
String user;
    String password;
    String Email;
    String dob;
//    No arugment construction
    User(String user,String password,String Email,String dob){
/*this.user=user;
this.password=password;
this.Email=Email; instead of this use this() function*/
        this(user,password,Email);
this.dob=dob;
    }
    User(String user,String password,String Email){
       /* this.user=user;
        this.password=password;*/
        this(user,password);
        this.Email=Email;

    }
    User(String user,String password){
        this.user=user;
        this.password=password;
    }
    User(String user){
        this.user=user;
    }
    User(){

    }
    public  void Login(){
        System.out.println("LOGIN");
    }
    public void Logout(){
        System.out.println("\nLOG_OUT");
    }
}
