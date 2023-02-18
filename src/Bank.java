import java.io.Serializable;
import java.util.Scanner;

public class Bank implements Serializable {
    private int accountNumber;
    private String name;
    private float amount;
    private int IFCS_code;
    private String branchname;
    private String phonenumber;
    private Scanner sacn;

    public Bank() {
        super();
    }

    public Bank(int accountNumber, String name, int IFCS_code, String branchname, String phonenumber) {
        super();
        this.accountNumber = accountNumber;
        this.name = name;
        this.IFCS_code = IFCS_code;
        this.branchname = branchname;
        this.phonenumber = phonenumber;
        this.sacn = sacn;
    }

    public Scanner getSacn() {
        return sacn;
    }

    public void setSacn(Scanner sacn) {
        this.sacn = sacn;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = String.valueOf(phonenumber);
    }

    public String getBranchname() {
        return branchname;
    }

    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }

    public int getIFCS_code() {
        return IFCS_code;
    }

    public void setIFCS_code(int IFCS_code) {
        this.IFCS_code = IFCS_code;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                ", IFCS_code=" + IFCS_code +
                ", branchname='" + branchname + '\'' +
                ", phonenumber=" + phonenumber +
                '}';
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static void main(String[] args) {
        Bank b=new Bank(123,"nawaz",1234,"bhilwara","9460985441");
        System.out.println(b);

    }
}