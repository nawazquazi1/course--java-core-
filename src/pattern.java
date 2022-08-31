//                                                                    بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيم
//                                                                   لا إله إلا الله محمد رسول الله
//                   اَللّٰھُمَّ صَلِّ عَلٰی مُحَمَّدٍ وَّعَلٰٓی اٰلِ مُحَمَّدٍ کَمَا صَلَّیْتَ عَلٰٓی اِبْرَاھِیْمَ وَعَلٰٓی اٰلِ اِبْرَاھِیْمَ اِنَّکَ حَمِیْدٌ مَّجِیْدٌ اَللّٰھُمَّ بَارِکْ عَلٰی مُحَمَّدٍ وَّعَلٰٓی اٰلِ مُحَمَّدٍ کَمَا بَارَکْتَ عَلٰٓی اِبْرَاھِیْمَ وَعَلٰٓی اٰلِ اِبْرَاھِیْمَ اِنَّکَ حَمِیْدٌ مَّجِیْدٌ
public class pattern {
    //    1  solid rectangle
    public static void pattrn1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    //  2 hollow rectangle
    public static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1; j++) {
                if (i == 1 || i == n || j == 1 || j == n + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
    }

    // 5 half pyramid
    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    // 4   inverted half pyramid
    public static void pattern4(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    // 5  Inverted & Rotated Half Pyramid
    public static void pattern5(int n) {
        int sp = n - 1;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
//        sp--;
//        st++;
            System.out.println();
        }
    }

    // 6  Half Pyramid with Numbers
    public static void pattern6(int n) {
//    for (int i=n;i>=1;i--) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //7 Inverted Half Pyramid with Numbers
    public static void pattern7(int n) {
        int val = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(val + "  ");
                val++;
            }
            System.out.println();
        }
    }

    // 8 0-1 Triangle
    public static void pattern8(int n) {
        int z = 0;
        int one = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print(one + " ");
                } else {
                    System.out.print(z + " ");
                }
            }
            System.out.println();
        }
    }

    // 9 solid rhombus.
    public static void pattern9(int n) {
        int st = n;
        int sp = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            sp--;
            System.out.println();
        }
    }

    //10 number pyramid.
    public static void pattern10(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    //  11  palindromic number pyramid.
    public static void pattern11(int n) {
//    int st=1;
//    int sp=n;
//    int count=1;
//    for (int i=1;i<=n;i++){
//        for (int j=1;j<=sp;j++){
//            System.out.print("\t");
//        }
//        for (int j=1;j<=st;j++){
//            System.out.print(count+"\t");
//            if (j<=st/2){
//                count--;
//            }else {
//                count++;
//            }
//        }
//        sp--;
//        st+=2;
//        System.out.println();
//    }
//    pattern 2
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // 12 Dimand pattern
    public static void pattern12(int n) {

//  pattern 1

//    int st = 1;
//    int sp = n / 2 + 1;
//    for (int i = 1; i <= n; i++) {
//        for (int j = 1; j <= sp; j++) {
//            System.out.print(" ");
//        }
//        for (int j = 1; j <= st; j++) {
//            if (i == n && j>n+2) {
//                System.out.print(" ");
//            } else {
//                System.out.print("*");
//            }
//        }
//        if (i <= n / 2 + 2) {
//            st += 2;
//            sp--;
//        } else {
//            st -= 2;
//            sp += 1;
//        }
//        System.out.println();
//    }
//    for (int i = n; i >=1; i--) {
//        for (int j = 1; j <= sp; j++) {
//            System.out.print(" ");
//        }
//        for (int j = 1; j <= st; j++) {
//                System.out.print("*");
//        }
//            st -= 2;
//            sp++;
//
//        System.out.println();
//    }
//    pattern 2
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    // 13  butterfly pattern
    public static void pattern13(int n) {
//    problam
        int sp = n + 2;
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            st++;
            sp -= 2;
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            st -= 1;
            sp += 2;
            System.out.println();
        }
//    pattern 2
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    //14 hollow Butterfly.
    public static void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1 | j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // 15     hollow Rhombus.
    public static void pattern15(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print("*\t");
                } else {
                    if (j == 1 || j == n) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
    }

    //    16 Pascal’s Triangle.
    public static void pattern16(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            int c = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c = c * (i - j) / j;
            }
            System.out.println();
        }
    }

    //  17  number  half Pyramid.
    public static void pattern17(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // 18    Inverted Half Pyramid.
    public static void pattern18(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
//  19 diamond

    public static void main(String[] args) {

//     pattern18(5);

//     pattern17(5);

//     pattern16(5);

//    pattern15(5);

//    pattern14(10);

//    pattern13(4);//problam h

//    pattern12(4);

//    pattern11(5);

//    pattern10(5);

//    pattern9(5);

//    pattern8(5);

//    pattern7(5);

//    pattern6(5);

//    pattern5(4);

//    pattern4(5);

//    pattern3(5);

//    pattern2(4);

//    pattrn1(4);


    }
}
