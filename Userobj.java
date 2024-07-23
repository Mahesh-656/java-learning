public class Userobj {
    public static void main(String[] args) {
        User a=new User("Mahesh","1234543","mahi@gmail.com","7/10/2005");
      /**  a.user="Mahesh";
        a.Email="Mahi@gmail.com";
        a.dob="22/08/2003";
        a.password="Mahir0056";
        System.out.println("User name: "+a.user);
        System.out.println("Email    : "+a.Email);
        System.out.println("DOB      : "+a.dob);
        System.out.println("Password : "+a.password);
        a.Login();
        a.Logout();         this code is done by default constructor **/

//      using parameterized constructor
        System.out.println("User name: "+a.user);
        System.out.println("Email    : "+a.Email);
        System.out.println("DOB      : "+a.dob);
        System.out.println("Password : "+a.password);
        System.out.println("\n\n");

User a1=new User("theja","theja1234","theja@gmail.com","12/09/2004");
        System.out.println("User name: "+a1.user);
        System.out.println("Email    : "+a1.Email);
        System.out.println("DOB      : "+a1.dob);
        System.out.println("Password : "+a1.password);

        User a2=new User("Mahi","123jffj3","t10@gmail.com");
        System.out.println("User name: "+a2.user);
        System.out.println("Email    : "+a2.Email);
        System.out.println("password : "+a2.password);

        User a3=new User("kishore","123456");
        System.out.println("User name: "+a3.user);
        System.out.println("password : "+a3.password);
    }
}
