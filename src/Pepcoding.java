///                                                                       بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِي                                                                       م
//                                                                   لا إله إلا الله محمد رسول الله
//                   اَللّٰھُمَّ صَلِّ عَلٰی مُحَمَّدٍ وَّعَلٰٓی اٰلِ مُحَمَّدٍ کَمَا صَلَّیْتَ عَلٰٓی اِبْرَاھِیْمَ وَعَلٰٓی اٰلِ اِبْرَاھِیْمَ اِنَّکَ حَمِیْدٌ مَّجِیْدٌ اَللّٰھُمَّ بَارِکْ عَلٰی مُحَمَّدٍ وَّعَلٰٓی اٰلِ مُحَمَّدٍ کَمَا بَارَکْتَ عَلٰٓی اِبْرَاھِیْمَ وَعَلٰٓی اٰلِ اِبْرَاھِیْمَ اِنَّکَ حَمِیْدٌ مَّجِیْدٌ

import java.util.*;


public class Pepcoding {

    public static void differnce() {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }
        int[] diff = new int[n2];
        int c = 0;
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = diff.length - 1;
        while (k > 0) {
            int d = 0;
            int alv = i >= 0 ? a1[i] : 0;
            if (a2[j] + c > alv) {
                d = a2[j] + c - alv;
            } else {
                d = a2[j] + c + 10 - alv;
                c = -1;
            }
            diff[k] = d;
            i--;
            j--;
            k--;
        }
        int idx = 0;
        while (idx < diff.length) {
            if (diff[idx] == 0) {
                idx++;
            } else {
                break;
            }
            while (idx < diff.length) {
                System.out.println(diff[idx]);
                idx++;
            }

        }
    }


    //  1
    public static int fib(int n) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
        int prives = 0;
        int sum = 1;
        int c = 0;
        for (int i = 1; i < n; i++) {
            System.out.println(prives);
            c = prives + sum;
            prives = sum;
            sum = c;
        }
        System.out.println(sum);

//            int temp=sum;
//            sum=prives+sum;
//            prives=temp;
//        }
        return sum;
    }

    //2
    public static int count(int n) {
//        String str=Integer.toString(n);
//        return str.length();
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    //3
    public static int dig(int n) {
        int count = 0;
        int temp = n;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        int div = (int) Math.pow(10, count - 1);
        while (div != 0) {
            int q = n / div;
            System.out.println(q);
            n = n % div;
            div = div / 10;

        }
        return 0;
    }

    //4
    public static int reverse(int n) {
//        int dig=0;
        while (n > 0) {

            int dig = n % 10;
            n = n / 10;
            System.out.println(dig);
        }
        return 0;
    }

    //5
    public static int inverse(int n) {
        int inv = 0;
        int op = 1;
        while (n != 0) {
            int od = n % 10;
            int id = op;
            int ip = od;
            n = n / 10;
            inv = inv + id * (int) Math.pow(10, ip - 1);
            op++;
        }
        return inv;

//    1 2 3 4 5 6 7 8                  1 2 3 4 5 6 7 8
//    6 5 1 3 4 2 7 8                  3 6 4 5 2 1 7 8

    }

    //6
    public static int rotate(int n, int k) {
        int temp = n;
        int count = 0;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        k = k % count;
        if (k < 0) {
            k = k + count;
        }
        int div = 1;
        int mult = 1;
        for (int i = 1; i <= count; i++) {
            if (i <= k) {
                div = div * 10;
            } else {
                mult = mult * 10;
            }
        }
        int q = n / div;
        System.out.println(q);
        int r = n % div;
        int roa = r * mult + q;
        System.out.println(roa);
        return roa;
    }

    //7
    public static int[] gcd(int num1, int num2) {

        int on1 = num1;
        int on2 = num2;
        while (num1 % num2 != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        int gcd = num2;
        int icm = (on1 * on2) / gcd;
        return new int[]{gcd, icm};
    }

    // 7    https://www.youtube.com/watch?v=5gFC-ayyQMk&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=30
    public static int prime(int n) {
//        Scanner sc =new Scanner(System.in);
//        int n= sc.nextInt();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                n = n / i;
                System.out.println(i);
            }
        }
        if (n != 1) {
            System.out.println(n);
        }
        return 0;
    }

    // 8 https://www.youtube.com/watch?v=HjfQtaJaWP0&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=31
    public static boolean paythogorear(int a, int b, int c) {
        int max = a;
        if (b >= max) {
            max = b;
        }
        if (c >= max) {
            max = c;
        }
        if (max == a) {
            boolean flage = (b * b + c * c) == (a * a);
            return flage;
        } else if (max == b) {
            boolean flag = (a * a + c * c) == b * b;
            return flag;
        } else {
            boolean flag = (a * a + b * b) == c * c;
            return flag;
        }
    }

    //  9  https://www.youtube.com/watch?v=7IbWTFOUP1U&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=34
    public static int bulbs(int n) {
        for (int i = 1; i * i <= n; i++) {
            System.out.println(i * i);
        }
        return 0;
    }

    // 10   https://www.youtube.com/watch?v=3OUOKD-wj0Q&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=35
    public static int pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return 0;
    }

    // 11   https://www.youtube.com/watch?v=Y-AePs3E7FU&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=37
    public static int revercepattern(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return 0;
    }

    //12
    public static int patternright(int n) {
        int st = 1;
        int sp = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int k = 1; k <= st; k++) {
                System.out.print("*\t");
            }
            sp--;
            st++;
            System.out.println();
        }
        return 0;
    }

    // 13    https://www.youtube.com/watch?v=_xlkKJyNmuc&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=42
    public static int patternRightreverce(int n) {
        int st = n;
        int sp = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            sp++;
            st--;
            System.out.println();
        }
        return 0;
    }

    // 14    https://www.youtube.com/watch?v=hGWoXqF1qC8&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=44
    public static int pattern5(int n) {
        int st = 1;
        int sp = n / 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                sp--;
                st += 2;
            } else {
                sp++;
                st -= 2;
            }
            System.out.println();
        }
        return 0;
    }

    // 15
    public static void pattern6(int n) {
        int st = n / 2 + 1;
        int sp = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < st; j++) {
                System.out.print("*\t");
            }
            for (int j = 0; j < sp; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < st; j++) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                st--;
                sp += 2;
            } else {
                st++;
                sp -= 2;
            }
            System.out.println();
        }
    }

    // 16
    public static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println(" ");
        }

    }

    //17
    public static void pattern8(int n) {
//        for (int i=n;i>=1;i--){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print("*\t");
                } else if (i + j == n + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    //18
    public static void pattern9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    // 19
    public static void pattern10(int n) {
//        int st=1;
        int is = -1;
        int os = n / 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= os; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int j = 1; j <= is; j++) {
                System.out.print("\t");
            }
            if (i > 1 && i < n) {
                System.out.println("*\t");
            }
            if (i <= n / 2) {
                os--;
                is += 2;
            } else {
                os++;
                is -= 2;
            }
            System.out.println();
        }
    }

    public static void ftre(int n) {
    }

    //    20
    public static void pattern11(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    // 21
    public static void pattern12(int n) {
        int privessum = 0;
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(privessum + " ");
                int c = privessum + sum;
                privessum = sum;
                sum = c;
            }
            System.out.println();
        }
    }

    //    22
    public static void pattern13(int n) {
        for (int i = 0; i < n; i++) {
            int icj = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(icj + "\t");
                int icjp1 = icj * (i - j) / (j + 1);
                icj = icjp1;
            }
            System.out.println();
        }
    }

    //     23
    public static void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.format("%d * %d = %d \n", n, i, n * i);
        }
    }

    //24
    public static void pattern15(int n) {
        int sp = n / 2;
        int st = 1;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            int cval = count;
            for (int j = 1; j <= st; j++) {
                System.out.print(cval + "\t");
                if (j <= st / 2) {
                    cval++;
                } else {
                    cval--;
                }
            }
            if (i <= n / 2) {
                st += 2;
                sp--;
                count++;
            } else {
                sp++;
                st -= 2;
                count--;
            }
            System.out.println();
        }
    }

    //25
    public static void pattern16(int n) {
        int st = 1;
        int sp = 2 * n - 3;
        for (int i = 1; i <= n; i++) {
            int val = 1;//2
            for (int j = 1; j <= st; j++) {
                System.out.print(val + "\t");
                val++;
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            if (i == n) {
                st--;
                val--;
            }
            for (int j = 1; j <= st; j++) {
                val--;
                System.out.print(val + "\t");
            }
            st++;
            sp -= 2;
            System.out.println();
        }
    }

    //     26
    public static void pattern17(int n) {
        int sp = n / 2;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                if (i == n / 2 + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                st++;
            } else {
                st--;
            }
            System.out.println();
        }
    }

    //27
    public static void pattern18(int n) {
        int sp = 0;
        int st = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                if (i > 1 && i <= n / 2 && j > 1 && j < st) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }
            if (i <= n / 2) {
                st -= 2;
                sp++;
            } else {
                sp--;
                st += 2;
            }
            System.out.println();
        }
    }

    // self practice
    public static void omjd(int n) {
        int sp = 0;
        int st = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                if (i > 1 && i <= n / 2 && j > 1 && j < st) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }
            if (i <= n / 2) {
                st -= 2;
                sp++;
            } else {
                st += 2;
                sp -= 1;
            }
            System.out.println();
        }
    }

    //28
    public static void pattern19(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1) {
                    if (j == n || j <= n / 2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else if (i <= n / 2) {
                    if (j == n || j == n / 2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else if (i == n / 2 + 1) {
                    System.out.print("*\t");
                } else if (i < n) {
                    if (j == 1 || j == n / 2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else {
                    if (j == 1 || j >= n / 2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
    }

    //  29
    public static void pattern20(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n) {
                    System.out.print("*\t");
                } else if (i > n / 2 && (i == j || i + j == n + 1)) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void Barchart(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int floor = max; floor >= 1; floor--) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= floor) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void sumOfTowArray(int[] arr, int[] arr2) {
        int[] sum = new int[Math.max(arr.length, arr2.length)];
        int c = 0;
        int i = arr.length - 1;
        int j = arr2.length - 1;
        int k = sum.length - 1;
        while (k >= 0) {
            int d = c;
            if (i >= 0) {
                d += arr[i];
            }
            if (j >= 0) {
                d += arr2[j];
            }
            c = d / 10;
            d = d % 10;
            sum[k] = d;
            i--;
            j--;
            k--;
        }
        if (c != 0) {
            System.out.println(c);
        }
        for (int as : sum) {
            System.out.println(as);
        }
    }

    public static int add(int b, int n1, int n2) {
        int rv = 0;
        int p = 1;
        int c = 0;
        while (n1 > 0 || n2 > 0 || c > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;
            int d = d1 + d2 + c;
            c = d / b;
            d = d % b;
            rv += d * p;
            p *= 10;
        }
        return rv;
    }

    public static void differnc(int[] arr1, int[] arr2) {
        int[] diff = new int[arr2.length];
        int c = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = diff.length - 1;
        while (k >= 0) {
            int d = 0;
            int a1v = i >= 0 ? arr1[i] : 0;
            if (arr2[j] + c >= a1v) {
                d = arr2[j] + c - a1v;
            } else {
                d = arr2[j] + c + 10 - a1v;
                c = -1;
            }
            diff[k] = d;
            i--;
            j--;
            k--;
        }
        int idx = 0;
        while (idx < diff.length) {
            if (diff[idx] == 0) {
                idx++;
            } else {
                break;
            }
        }
        while (idx < diff.length) {
            System.out.println(diff[idx]);
            idx++;
        }
    }

    // stack
//    1
    public static void duplicate(String exp) {

//        Scanner sc=new Scanner(System.in);
//        String exp=sc.nextLine();
//        Stack<Character>st=new Stack<>();
//        for (int i=0;i<exp.length();i++){
//            char ch=exp.charAt(i);
//            if (ch!=')'){
//                st.push(ch);
//            }else {
//                if (st.peek() == '(') {
//                    return true;
//                }
//                while (st.peek() != '(') {
//                    st.pop();
//                }
//                st.pop();
//            }
//        }
//        return false;


//        patter 2
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == ')') {
                if (st.peek() == '(') {
                    System.out.println(true);
                    return;
                } else {
                    while (st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }
            } else {
                st.push(ch);
            }
        }
        System.out.println(false);
    }

    //2
    public static void balncedbracket(String exp) {
//        Stack<Character> st = new Stack<>();
//        for (int i = 0; i < exp.length(); i++) {
//            char ch = exp.charAt(i);
//            if (ch == '(' || ch == '[' || ch == '{') {
//                st.push(ch);
//            } else if (ch == ')') {
//                boolean b = as.handel(st, '(');
//                if (!b) {
//                    System.out.println(false);
//                    return;
//                }
//            } else if (ch == ']') {
//                boolean b = handel(st, '[');
//                if (!b) {
//                    System.out.println(false);
//                    return;
//                }
//            } else if (ch == '}') {
//                boolean b = handel(st, '{');
//                if (!b) {
//                    System.out.println(false);
//                    return;
//                }
//            }
//        }
//        if (st.size() == 0) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }

//        pattern 2
        HashMap<String, String> map = new HashMap<>();
        map.put("(", ")");
        map.put("[", "]");
        map.put("{", "}");
        Stack<String> st = new Stack<>();
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("(", "{", "[", ")", "}", "]"));
        for (char as : exp.toCharArray()) {
            if (!list.contains(String.valueOf(as))) {
                continue;
            }
            if (map.containsKey(String.valueOf(as))) {
                st.push(String.valueOf(as));
            } else {
                try {
                    String latest = st.pop();
                    String close = map.get(latest);
                    if (!Objects.equals(close, String.valueOf(as))) {
                        System.out.println(false);
                        return;
                    }
                } catch (Exception e) {
                }
            }
        }
        System.out.println(st.isEmpty());
    }


    public static boolean handel(Stack<Character> st, char corres) {
        if (st.size() == 0) {
            return false;
        } else if (st.peek() != corres) {
            return false;
        } else {
            st.pop();
            return true;
        }
    }

    //3
    public static int[] solve(int[] arr) {
//        int[] nge = new int[arr.length];
//        Stack<Integer> st = new Stack<>();
//        st.push(arr[arr.length - 1]);
//        nge[arr.length - 1] = -1;
//        for (int i = arr.length - 2; i >= 0; i--) {
//            while (st.size() > 0 && arr[i] >= st.peek()) {
//                st.pop();
//            }
//            if (st.size() == 0) {
//                nge[i] = -1;
//            } else {
//                nge[i] = st.peek();
//            }
//            st.push(arr[i]);
//        }
//        return nge;

        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                int pos = st.peek();
                nge[pos] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while (st.size() > 0) {
            int pos = st.peek();
            nge[pos] = -1;
            st.pop();
        }
        return nge;
    }

    public static int[] span(int[] arr) {
        int[] span = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        span[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        return span;
    }

    private static int area(int[] arr) {
        int[] rb = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr.length - 1);
        rb[arr.length - 1] = arr.length;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                rb[i] = arr.length;
            } else {
                rb[i] = st.peek();
            }
            st.push(i);
        }
        int[] lb = new int[arr.length];
        st.push(0);
        lb[0] = -1;
        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                lb[i] = -1;
            } else {
                lb[i] = st.peek();
            }
            st.push(i);
        }

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int width = rb[i] - lb[i]-1;
            int area = arr[i] * width;
            if (area > max) {
                max = area;
            }
        }
        return max;
    }


    public static int[] ee(int[] qrr, int k) {
        Arrays.sort(qrr);
        System.out.println(Arrays.toString(qrr));
        return qrr;
    }

    public static String[] reverseString(String[] s) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = s.length - 1; i >= 0; i--) {
            list.add(s[i]);
        }
        String[] arr = new String[list.size()];
//     for (int i=0;i<s.length;i++){
//         arr[i]=list.get(i);
//     }
        return list.toArray(((arr)));
    }

    public static void reverseString1(int[] s) {
        int left = 0;
        int i = s.length - 1;
        while (left < i) {
            int c = s[left];
            s[left] = s[i];
            s[i] = c;
            left++;
            i--;
        }
        System.out.println(Arrays.toString(s) + " ");
    }

    public static int missingNumber(int[] arr) {
//        Arrays.sort(arr);
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return arr.length;
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                int temp = arr[i];
                arr[i] = arr[temp];
                arr[temp] = temp;
                i--;
            }
        }
    }

    public static int missingNumber1(int[] nums) {
        HashSet<Integer> hash = new HashSet<Integer>();
        for (int n : nums)
            hash.add(n);
        for (int i = 0; i < nums.length; i++) {
            if (!hash.contains(i)) {
                return i;
            }
        }
        return nums.length;
    }
    public static int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return nums[i];
            }
        }

        return nums.length;
    }

    public static void main(String[] args) {

        System.out.println(area(new int[]{2,1,5,6,2,3}));

        System.out.println(Arrays.toString(span(new int[]{0,100,80,60,70,60,75,85})));

//        System.out.println(findDuplicate(new int[]{1,3,3,4,2,2}));

//        System.out.println(missingNumber1(new int[]{4, 3, 1, 6, 0, 7, 9, 8, 2}));

//        reverseString1(new int[]{23,43,3,45,86,54,23});

//        System.out.println(Arrays.toString(reverseString(new String[]{"h", "e", "l", "l", "o"})));

//        System.out.println(Arrays.toString(ee(new int[]{12, 11, -13, -5, 6, -7, 5, -3, -6}, 3)));

//        System.out.println(Arrays.toString(solve(new int[]{5,3,8,-2 ,7})));

//        balncedbracket("[(a + b) + {(c + d) * (e / f)}])");
//        balncedbracket("[(a + b) + {(c + d) * (e / f)]} ");
//        balncedbracket("[(a + b) + {(c + d) * (e / f)} ");
//        balncedbracket("([(a + b) + {(c + d) * (e / f)}],");

//        duplicate("(a + b) + ((c + d))");
//        duplicate("((a + b) + (c + d))");

//        System.out.println(Arrays.toString(arr(new int[]{1,2,3,2,3,4,4,5,5})));

//        System.out.println(Arrays.toString(containsDuplicate(new int[]{1, 2, 3, 4, 1})));

//        System.out.println(climbStairs(4));

//        System.out.println(mySqrt(12));

//        System.out.println(singleNumber(new int[]{2, 3, 4, 2, 3, 4, 1, 1}));
//        System.out.println(singleNumber(new int[]{1, 2, 1, 3, 4, 2}));

//        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9,3})));

//        System.out.println(removeElement(new int[]{2, 3, 2, 3}, 3));

//        System.out.println(removeDuplicates(new int[]{3, 2, 2, 3}, 3));

//        System.out.println(addBinary("1010","1011"));


//        differnc(new int[]{9,9,9},new int[]{1,0,0,0});

//        System.out.println(add( 2,1010, 1011));

//        sumOfTowArray(new int[]{3, 1, 0, 7, 5}, new int[]{1, 1, 1, 1, 1, 1});
//            Barchart(new int[]{2,3,0,1,6,4,5});


//        pattern20(5);

//        pattern19(7);

//        omjd(7);

//        pattern18(7);

//        pattern17(5);

//        pattern16(4);

//        pattern15(5);

//        pattern14(10);

//        pattern13(6);//samj nhi aaya h y waale queion no.22

//         pattern12(6); //Fibonacci

//        pattern11(5);

//        pattern10(5);

//            pattern9(5);

//        pattern8(5);

//        pattern7(5);

//         pattern6(5);

//        System.out.println(Pepcoding.pattern5(5));

//            System.out.println(Pepcoding.patternRightreverce(5));

//        System.out.println(Pepcoding.patternright(5));

//            System.out.println(Pepcoding.revercepattern(5));

//            System.out.println(Pepcoding.pattern1(5));

//            System.out.println(Pepcoding.bulbs(20));

//            System.out.println(Pepcoding.paythogorear(45,45,3));


//            System.out.println(Pepcoding.prime(1440));


//        System.out.println(Arrays.toString(Pepcoding.gcd(36,24)));


//        System.out.println(Pepcoding.rotate(51234, -2));


//        System.out.println(Pepcoding.inverse(87243156));

//        System.out.println(Pepcoding.reverse(754));

//        System.out.println(Pepcoding.dig(754));

//        System.out.println(Pepcoding.count(234565));

//        System.out.println(Pepcoding.fib(9));


//

//        1. You are given as input marks of a student.
//        2. Display an appropriate message based on the following rules:
//        2.1 for marks above 90, print excellent.
//        2.2 for marks above 80 and less than equal to 90, print good.
//        2.3 for marks above 70 and less than equal to 80, print fair.
//        2.4 for marks above 60 and less than equal to 70, print meets expectations.
//        2.5 for marks less than equal to 60, print below par.

//        int marks = 45;
//        if (marks > 90) {
//            System.out.println("Excellent");
//        } else if (marks > 80) {
//            System.out.println("Good");
//        } else if (marks > 70) {
//            System.out.println("fair");
//        } else if (marks > 60) {
//            System.out.println("Meets Expectations");
//        } else {
//            System.out.println("Below par");
//        }
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();

//        for (int i = 0; i < t; i++) {
//            int n = sc.nextInt();
//            int co = 0;
//            for (int div = 1; div <= n; div++) {
//                if (n % div == 0) {
//                    co++;
//                }
//            }
//                if (co == 2) {
//                    System.out.println("prime");
//                } else {
//                    System.out.println("not prime");
//                }
//            }
//        Scanner scn=new Scanner(System.in);
//        int low=scn.nextInt();

//        int high=scn.nextInt();
//        for (int i=low;i<=high;i++){
//            int count=0;
//            for (int div=2;div*div<=i;div++) {
//                if (i % div == 0) {
//                    count++;
////                    break;
//                }
//            }if (count==0){
//                System.out.println(i);


    }
}







