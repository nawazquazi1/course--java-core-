import java.util.Arrays;

public class Interview {

    public static void evenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("this number is even");
        } else {
            System.out.println("this number is odd");
        }
    }

    public static void LepYear(int n) {
        if (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            System.out.println("Leap year");
            ;
        } else {
            System.out.println("Not a leap year");
        }
    }


    public static void findFact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }

    public static void revers(int n) {
        int i = 0, revers = 0;
        while (n != 0) {
            i = n % 10;
            revers = revers * 10 + i;
            n /= 10;
        }
        System.out.println(revers);
    }

    public static String reversString(String name) {
//      StringBuffer buffer=new StringBuffer(name);
//      return buffer.reverse();
        String revers = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            revers += name.charAt(i);
        }

        return revers;
    }

    public static void checkPrime(int n) {
        int count = 0;
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("this is a prime number");
        } else {
            System.out.println("this is a not prime number");
        }
    }

    public static void prime(int n) {
        for (int i = 0; i <= n; i++) {
            int count = 0;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("number is prime " + i);
            } else {
                count = 0;
            }
        }
    }

    public static void fibonacci(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }


    public static String MaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
            if (min >= arr[i]) {
                min = arr[i];
            }
        }
        return "max : " + max + " mini " + min;
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static String[] bubble_string_sort(String[] str) {
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    String temp = str[j];
                    str[j] = str[i];
                    str[i] = temp;
                }
            }
        }
        return str;
    }

    public static int[] Selection_sort(int[] arr) {
        int min;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
                int tmp = arr[i];
                arr[i] = arr[min];
                arr[min] = tmp;
            }
        }
        return arr;
    }

    public static String[] Selection_sorts(String[] arr) {
        int min;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
                String temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        return arr;
    }

    public static int[] insertion_sort(int[] arr) {

        int temp, j;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = temp;
        }
        return arr;
    }

    public static void palindrome(int n) {
        int temp = n;
        int reves = 0;
        int rem = 0;
        while (temp != 0) {
            rem = temp % 10;
            reves = reves * 10 + rem;
            temp /= 10;
        }
        if (n == reves) {
            System.out.println(n + " :- this number is palindrome");
        } else {
            System.out.println(n + " :- this number is not palindrome");
        }
    }

    public static void armstrongNumber(int n) {
        int t1 = n;
        int count = 0;
        while (t1 != 0) {
            t1 /= 10;
            count++;
        }
        int t2 = n;
        int rem = 0, arm = 0;
        while (t2 != 0) {
            int multi = 1;
            rem = t2 % 10;
            for (int i = 1; i <= count; i++) {
                multi *= rem;
            }
            arm += multi;
            t2 /= 10;
        }
        if (n == arm) {
            System.out.println("no is armstrong ");
        } else {
            System.out.println(" no is not armstrong ");
        }

    }

    public static int ArmstrongNumber(int n) {
        int temp = n;
        int count = 0;
        int rev = 0;
        while (temp != 0) {
            temp /= 10;

            count++;
        }
        int rem;
        while (n != 0) {
            rem = n % 10;
            rev += (int) Math.pow(rem, count);
            n /= 10;
        }
        return rev;
    }


        int[] arrr;
        int[] temp;
         int length;


        public void merge_array(int lover, int middle, int high) {
            for (int i = lover; i <= high; i++) {
                temp[i] = arrr[i];
            }

            int i = lover;
            int j = middle + 1;
            int k = lover;

            while (i <= middle && j <= high) {
                if (temp[i] <= temp[j]) {
                    arrr[k] = temp[i];
                    i++;
                } else {
                    arrr[k] = temp[j];
                    j++;
                }
                k++;
            }
            while (i <= middle) {
                arrr[k] = temp[i];
                k++;
                i++;
            }
        }



        public  void sort1(int[] arr) {
            this.arrr = arr;
            this.length = arr.length;
            this.temp = new int[length];
            divide(0, length-1);
        }


        public void divide(int lower, int higher) {
            if (lower < higher) {
                int middle = lower + (higher - lower) / 2;
//            it will sort left side of an array
                divide(lower, middle);
//            it will sort the right side of an array
                divide(middle + 1, higher);
                merge_array(lower, middle, higher);
            }
        }

    public static void main(String[] args) {


            Interview in=new Interview();
            in.sort1(new int[]{48,36,13,19,99,52,21});
        System.out.println(Arrays.toString(in.arrr));


//        System.out.println(Arrays.toString(insertion_sort(new int[]{234, 4456, 45465, 4, 4, 5, 2, 4645, 76, 23, 5, 23, 78854, 4, 23, 1, 90, 34, -122, 19, 34})));
//        armstrongNumber(153);
//        palindrome(344);
//        fibonacci(10);
//        prime(100);
        // revers(2345);
        //evenOdd(15);
        //LepYear(1920);
        //findFact(6);
//        System.out.println(reversString("nawaz"));
//        checkPrime(9);
//        System.out.println(Arrays.toString(Selection_sorts(new String[]{"nawaz", "akib", "ateeq", "nawaz", "mohammd", "aafiya", "naawaz", "aakib", "sohail", "quaiz"})));

//        System.out.println(Arrays.toString(Selection_sort(new int[]{14, 53, 56, 3, 765, 34, 7654, 1, 14, 1, 3, 53, 1})));
    }
}
class mergeSort{
    int [] arr;
    int []tempArr;
    int length;

    public  void sort(int[] arr) {
        this.arr = arr;
        this.length = arr.length;
        this.tempArr = new int[length];
        divide(0, length-1);
    }

    public void divide(int lower, int higher) {
        if (lower < higher) {
            int middle = lower + (higher - lower) / 2;
//            it will sort left side of an array
            divide(lower, middle);
//            it will sort the right side of an array
            divide(middle + 1, higher);
            mergeArr(lower, middle, higher);
        }
    }
    public void mergeArr(int lover,int middle,int higher){
        for (int i=lover;i<=higher;i++){
            tempArr[i]=arr[i];
        }
        int i=lover;
        int j=middle+1;
        int k=lover;

        while (i <= middle && j <= higher) {
            if (tempArr[i] <= tempArr[j]) {
                arr[k] = tempArr[i];
                i++;
            }else {
                arr[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            arr[k] = tempArr[i];
            k++;
            i++;
        }
    }

    public static void main(String[] args) {

        mergeSort me=new mergeSort();
        me.sort(new int[]{48,36,13,19,99,52,21});
        System.out.println(Arrays.toString(me.arr));

    }

}