import java.util.Random;
import java.util.Scanner;

 public class game {
    public int number;
    public int inputnumber;
    public int noofguesses=0;

    public int getInputnumber(){
        return noofguesses;
    }
    public void setNoofguesses(int noofguesses){
        this.noofguesses=noofguesses;
    }
    game(){
        Random re =new Random();
        this.number=re.nextInt(100);
    }
    void takeuserinput(){
        System.out.println("guess the number");
        Scanner sc =new Scanner(System.in);
        inputnumber=sc.nextInt();
    }
    boolean iscorrctnumber(){
        noofguesses++;
        if (inputnumber==number){
            System.out.printf("Yes you guessed it right, it was %d \n You guessed it in %d attempts, number, noOfGuesses");
            return true;
        }else if (inputnumber<number){
            System.out.println("Too lpw..");
        }else {
            System.out.println("Too high...");
        }
        return false;
    }

     public static void main(String[] args) {
         game g=new game();
         boolean b = false;
         while (!b){
             g.takeuserinput();
             g.iscorrctnumber();
         }
     }
         }

//1 ==> https://www.learnvern.com/course/core-java-programming-tutorial
//        2 ==> https://www.youtube.com/watch?v=cDd-eUtbm2k&list=PLlhM4lkb2sEhfuXL-2BDrJ67WkUdQ2v9b

//        3 ==> https://www.youtube.com/playlist?list=PLbGui_ZYuhij8Oplrvjt_RlDliZQgdxoV
//
//}
