    public class bank {
    private int accno;
    private int balance;
    private String name;

    public bank(int accno,int balance,String name;){
    this.accno=accno;
    this.balance=balance;
    this.name=name;
    }
    public void setaccno(int accno){
    this.accno=accno;
    }

    public int getaccno(){
    return accno;
    }

    public void setname(String name){
    this.name=name;
    }

    public String getname(){
    return name;
    }

    public void setbalance(int balance){
    this.balance=balance;
    }

    public int getbalance(){
    return balance;
    }
    public String toString(){
    return "Account Number:"+accno+"Costumer Name:"+name+"Account Balance"+balance;
    }

    }
