import java.io.*;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Account_Mange implements Serializable  {
    ObjectOutputStream oos_book = null;
    ObjectInputStream ois_book = null;
    File book_file = new File("Book.dat");
    ArrayList<Bank> books_list = null;

    public Account_Mange() throws FileNotFoundException {
        books_list = new ArrayList<>();
        try {
            if (book_file.exists()) {
                ois_book = new ObjectInputStream(new FileInputStream(book_file));
                books_list = (ArrayList<Bank>) ois_book.readObject();
            }
        } catch (IOException | ClassNotFoundException io) {
            io.printStackTrace();
        }
    }

    public void addAccount(Bank bank) {
        books_list.add(bank);
    }

    public Bank searchAccount(String name) {
        for (Bank bank : books_list) {
            if (bank.getName() == name) {
                return bank;
            }
        }
        return null;
    }

    public boolean deleteAccount(int accountNumber) {
        ListIterator<Bank> bankListIterator = books_list.listIterator();
        while (bankListIterator.hasNext()) {
            Bank bank = bankListIterator.next();
            if (bank.getAccountNumber() == accountNumber) {
                books_list.remove(bank);
                return true;
            }
        }
        return false;
    }
    public boolean Update_Account(int accountNumber, String name, float amount, int IFCS_code, String branchname, int phonenumber, Scanner sacn){
        ListIterator<Bank> bankListIterator=books_list.listIterator();
        while (bankListIterator.hasNext()){
            Bank bank=bankListIterator.next();
            if (bank.getAccountNumber()==accountNumber){
                bank.setName(name);
                bank.setIFCS_code(IFCS_code);
                bank.setBranchname(branchname);
                bank.setPhonenumber(phonenumber);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {

        Account_Mange ac=new Account_Mange();
        Bank b=new Bank(23456,"nawaz",3435467,",bhilwara","94609853441");
        Bank b1=new Bank(23456,"nawa",3435467,",bhilwara","94609853441");
        ac.addAccount(b);
        ac.addAccount(b1);
        System.out.println(ac.searchAccount("nawa"));
    }
}


