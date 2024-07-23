public class Facebk {
   static Facebk a;           //Singleton process
    private String name;
    private String password;
    private String Email;

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
    private Facebk(String name,String password,String Email){
        this.name=name;
        this.password=password;
        this.Email=Email;
    }
    public static Facebk getFacebkobj(String name,String password,String Email){
        if(a==null) {
            a = new Facebk(name, password, Email);
        }
        return a;
    }
}
