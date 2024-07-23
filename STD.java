public class STD {
    private String name;
    private long  rollno;
    private String Email;
    private String password;

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

    public long getRollno() {
        return rollno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRollno(long rollno) {
        this.rollno = rollno;
    }

    STD(String name, long rollno, String Email, String password){
        this.name=name;
        this.rollno=rollno;
        this.Email=Email;
        this.password=password;
    }
}
