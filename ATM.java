public class ATM {
    private int money;
    private String bankname;
    private String location;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    ATM(int money,String bankname,String location){
        this.money=money;
        this.bankname=bankname;
        this.location=location;
    }
}
