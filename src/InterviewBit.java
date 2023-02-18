public class InterviewBit {

    int i;
    static int j;

    {
        System.out.println(" Instance Block 1. Value of i = " + i);
    }

    static {
        System.out.println(" Static Block 1. Value of j = " + j);
        method_2();
    }

    {
        i = 5;
    }

    static {
        j = 10;
    }

    InterviewBit() {
        System.out.println(" Welcome to InterviewBit ");
    }

    public static void main(String[] args) {
        InterviewBit ib = new InterviewBit();

    }

    public void method_1() {
        System.out.println(" Instance method. ");
    }

    static {
        System.out.println(" Static Block 2. Value of j = " + j);
    }

    {
        System.out.println(" Instance Block 2. Value of i = " + i);
        method_1();
    }

    public static void method_2() {
        System.out.println(" Static method. ");
    }
}

class coding {

    public static void Binary_Search(int[] arr, int search) {
        int li = 0;
        int hi = arr.length - 1;
        int middle = (li + hi) / 2;
        while (li <= hi) {
            if (arr[middle] == search) {
                System.out.println(middle);
                break;
            } else if (arr[middle] < search) {
                li = middle + 1;
            } else {
                hi = middle - 1;
            }
            middle = (li + hi) / 2;
        }
        if (li > hi) {
            System.out.println("elemntes not found");
        }
    }

    private static int check_primer(int num) {

        int count = 0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                count++;
                return 1;
            }
        }
        if (count == 0) {
            return 0;
        }
        return 1;
    }
    public static void find(int num){
        for (int i=2;i<=num/2;i++){
            if (check_primer(i)==0){
                if (check_primer(num-i)==0){
                    System.out.println(num+" = "+ (num-i)+" "+i);
                }
            }
        }
    }
    public static void revers_String(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            System.out.print(ch);
        }
    }
    public static void isMagic(int num) {
        int sumofdigit = 0;

            while (num > 0 || sumofdigit > 9) {
                if (num == 0) {
                num = sumofdigit;
                sumofdigit = 0;
            }
            sumofdigit += num % 10;
            num /= 10;
        }
        if (sumofdigit==1){
            System.out.println("magic number");
        }else {
            System.out.println("npt a magic number");
        }}

    public static void main(String[] args) {
        isMagic(163);
    }
}
