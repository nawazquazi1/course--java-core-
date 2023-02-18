 import java.util.*;

public class as {
//            0) double the element in list
//    ex = [5,10,15,6,3,7,9,11,5,16,7]
//
//
//            1) remove duplicate from the list
//            ex = input [1,1,2,2,3,4,3,4,2]
//    output = [1,2,3,4]
//
//            2) get sum of the array
//    ex = [2,3,44,2,4,6]
//    output = 61
//
//     3) perform arithmetic operations
//    ex = [1,"+",2,"+",4,"*",2,"*",-1,"*",100,"/",10]
//    output = -


// 5  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//    You can return the answer in any order.
//            Example 1:
//,
//    Input: nums = [11,15,4,6,7,17,19,2,21,23,35], target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//    Example 2:
//
//    Input: nums = [3,2,4], target = 6
//    Output: [1,2]
//    Example 3:
//
//    Input: nums = [3,3],

//  6

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

//An input string is valid if:

//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.

//Example 1:

//Input: s = "()"
//Output: true
//Example 2:

//Input: s = "()[]{}"
//Output: true
//Example 3:

//Input: s = "(]"
//Output: false

//    Input: s = "([)]"
//Output: false

//  7
//    168. Excel Sheet Column Title
//    Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
//    For example:
//    A -> 1
//    B -> 2
//    C -> 3
//            ...
//    Z -> 26
//    AA -> 27
//    AB -> 28
//            ...
//
//    Example 1:
//    Input: columnNumber = 1
//    Output: "A"
//
//    Example 2:
//    Input: columnNumber = 28
//    Output: "AB"
//
//    Example 3:
//    Input: columnNumber = 701
//    Output: "ZY"

// 8
//    136. Single Number
//    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//    You must implement a solution with a linear runtime complexity and use only constant extra space.
//    Example 1:
//    Input: nums = [2,2,1]
//    Output: 1
//    Example 2:
//    Input: nums = [4,1,2,1,2]
//    Output: 4
//    Example 3:
//    Input: nums = [1]
//    Output: 1

// 9
//    217. Contains Duplicate
//    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//    Example 1:
//    Input: nums = [1,2,3,1]
//    Output: true
//    Example 2:
//    Input: nums = [1,2,3,4]
//    Output: false
//    Example 3:
//    Input: nums = [1,1,1,3,3,4,3,2,4,2]
//    Output: true

    // 1
    public static int[] Remove_Duplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i <= arr.length - 1; i++) {
            set.add(arr[i]);
        }
        int[] a = new int[set.size()];
        int k = 0;
        for (int i : set) {
            a[k] = i;
            k++;
        }
        return a;
    }

    //  0
    public static int[] Double_The_Element_In_List(int[] arr) {
        int[] Double = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            Double[i] = arr[i] + arr[i];
        }
        return Double;
    }

    //3
    public static int Get_Sum_Of_The_Array(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //4
    public static int Perform_Arithmetic_Operations(Object[] arr) {
        //    ex = [1,"+",2,"+",4,"*",2,"*",-1,"*",100,"/",10]
        int val = (int) arr[0];
        for (int i = 1; i < arr.length - 1; i += 2) {
            if (arr[i] == "+") {
                val = val + (int) arr[i + 1];
            } else if (arr[i] == "-") {
                val = val - (int) arr[i + 1];
            } else if (arr[i] == "*") {
                val = val * (int) arr[i + 1];
            } else if (arr[i] == "/") {
                val = val / (int) arr[i + 1];
            }
        }
        return val;
    }

    // 5
    public static int[] target(int[] arr, int target) {
        int[] n = new int[2];
        outerloop:
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    n[0] = i;
                    n[1] = j;
                    break outerloop;
                }
            }
        }
        return n;
    }

    //6
    public static boolean brackets(String str) {
        HashMap<String, String> map = new HashMap<>();
        map.put("(", ")");
        map.put("[", "]");
        map.put("{", "}");
        Stack<String> st = new Stack<>();
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("(", "{", "[", ")", "}", "]"));
        for (char as : str.toCharArray()) {
            if (!list.contains(String.valueOf(as))) {
                continue;
            }
            if (map.containsKey(String.valueOf(as))) {
                // open bracket
                st.push(String.valueOf(as));
            } else {
                // closing bracket
                String latest_open_bracket = st.pop();
                String close_bracket = map.get(latest_open_bracket);
                if (!Objects.equals(close_bracket, String.valueOf(as))) {
                    return false;
                }
            }
        }
        return st.isEmpty();


    }

    //7
    public static int Single_number(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])) {
                set.remove(arr[i]);
            }
        }
        return (int) set.toArray()[0];
    }

    //8
    public static ArrayList<Integer> is_prime(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 1; j < n; j++) {
            int count = 0;
            for (int i = 2; i * i <= j; i++) {
                if (j % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                list.add(j);
            }
        }
        return list;
    }

    //9
    public static boolean Contains_Duplicate(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /*
        ((a + b) + (c + d)) -> false
          (a + b) + ((c + d)) -> true
        1-  function duplicate  input= string output=true,false
        2-  stack
        3-  loop string as  i
            2.1-if i!= ) than push in stack                                                                                                                                                                                                                                                                             (
            2.2-else loop stack as j in reverse
                2.2.1 if j is ( stack.pop & break
                2.2.2 else stack.pop
                2.2.3
     */
    public static boolean duplicate(String str) {
//        Stack<Character> st = new Stack<>();
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch != ')') {
//                st.push(ch);
//            } else {
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

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                if (st.peek() == '(') {
                    return true;
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
        return false;
    }

    public static boolean Balanced_Brackets(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else if (ch == ')') {
                handel(st, '(');
            } else if (ch == ']') {
                handel(st, '[');
            } else if (ch == '}') {
                handel(st, '{');
            }
        }
        if (st.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean handel(Stack<Character> st, char closing) {
        if (st.size() == 0) {
            return false;
        } else if (st.peek() != closing) {
            return false;
        } else {
            st.pop();
            return true;
        }
    }

    public static int[] Next_Greater_Element_on_the_Right(int[] arr) {
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length - 1]);
        nge[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] > st.peek()) {
                st.pop();
            }
            if (st.size() == 0) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return nge;
    }


    public static void infix(String exp) {
        Stack<Integer> opernts = new Stack<>();
        Stack<Character> optors = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                optors.push(ch);
            } else if (Character.isDigit(ch)) {
                opernts.push(ch - '0');
            } else if (ch == ')') {
                while (optors.peek() != '(') {
                    char op = optors.pop();
                    int v2 = opernts.pop();
                    int v1 = opernts.pop();
                    int opv = opertion(v1, v2, op);
                    opernts.push(opv);
                }
                optors.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (optors.size() > 0 && optors.peek() != '(' && persdenr(ch) <= persdenr(optors.peek())) {
                    char op = optors.pop();
                    int v2 = opernts.pop();
                    int v1 = opernts.pop();
                    int opv = opertion(v1, v2, op);
                    opernts.push(opv);
                }
                optors.push(ch);
            }
        }
        while (optors.size() != 0) {
            char op = optors.pop();
            int v2 = opernts.pop();
            int v1 = opernts.pop();
            int opv = opertion(v1, v2, op);
            opernts.push(opv);
        }
        System.out.println(opernts.peek());
    }

    public static int persdenr(char optro) {
        if (optro == '+' || optro == '-') {
            return 1;
        } else if (optro == '*' || optro == '/') {
            return 2;
        } else {
            return 0;
        }
    }

    public static int opertion(int v1, int v2, char opert) {
        if (opert == '+') {
            return v1 + v2;
        } else if (opert == '-') {
            return v1 - v2;
        } else if (opert == '*') {
            return v1 * v2;
        } else {
            return v1 / v2;
        }
    }


    public static void confix(String exp) {
        Stack<String> post = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<Character> opertors = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                opertors.push(ch);
            } else if (ch >= '0' && ch <= '9' || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                post.push(ch + "");
                pre.push(ch + "");
            } else if (ch == ')') {
                while (opertors.peek() != '(') {
                    char op = opertors.pop();
                    String postv2 = post.pop();
                    String postv1 = post.pop();
                    String pv12 = postv1 + postv2 + op;
                    post.push(pv12);

                    String pre2 = pre.pop();
                    String pre1 = pre.pop();
                    String pr12 = op + pre1 + pre2;
                    pre.push(pr12);
                }
                opertors.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (opertors.size() > 0 && opertors.peek() != '(' && persdenr(ch) <= persdenr(opertors.peek())) {
                    char op = opertors.pop();
                    String postv2 = post.pop();
                    String postv1 = post.pop();
                    String pv12 = postv1 + postv2 + op;
                    post.push(pv12);

                    String pre2 = pre.pop();
                    String pre1 = pre.pop();
                    String pr12 = op + pre1 + pre2;
                    pre.push(pr12);
                }
                opertors.push(ch);
            }
        }
        while (opertors.size() != 0) {
            char op = opertors.pop();
            String postv2 = post.pop();
            String postv1 = post.pop();
            String pv12 = postv1 + postv2 + op;
            post.push(pv12);

            String pre2 = pre.pop();
            String pre1 = pre.pop();
            String pr12 = op + pre1 + pre2;
            pre.push(pr12);
        }
        System.out.println(post.peek());
        System.out.println(pre.peek());
    }

    public static void postfixExpresion(String exp) {
        Stack<Integer> value = new Stack<>();
        Stack<String> infix = new Stack<>();
        Stack<String> pre = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int v2 = value.pop();
                int v1 = value.pop();
                int as = Meet_class.operter(v1, v2, ch);
                value.push(as);

                String i2 = infix.pop();
                String i1 = infix.pop();
                String sv = "(" + i1 + ch + i2 + ")";
                infix.push(sv);


                String sv21 = pre.pop();
                String sv11 = pre.pop();
                String sv12 = ch + sv11 + sv21;
                pre.push(sv12);

            } else {
                value.push(ch - '0');
                pre.push(ch + "");
                infix.push(ch + "");
            }
        }
        System.out.println(value.pop());
        System.out.println(infix.pop());
        System.out.println(pre.pop());
    }


    public static void main(String[] args) {


//        postfixExpresion("2+6 * 4 / 8 - 3");

//        confix("a*(b-c+d)/e");

//        infix("2+(5-3*6/2)");
//        infix("2+6 * 4 / 8 - 3");


//        System.out.println(Arrays.toString(Next_Greater_Element_on_the_Right(new int[]{32, 245, 42, 45, 2, 5, 24})));

//        System.out.println(Balanced_Brackets("[(a + b) + {(c + d) * (e / f)}] -> true"));
//        System.out.println(Balanced_Brackets("[(a + b) + {(c + d) * (e / f)]} -> false"));
//        System.out.println(Balanced_Brackets("[(a + b) + {(c + d) * (e / f)} -> false"));
//        System.out.println(Balanced_Brackets("([(a + b) + {(c + d) * (e / f)}] -> false"));


//        System.out.println(duplicate(" ((a+ b) + (c + d)) "));
//        System.out.println(duplicate(" (a + b) + ((c + d)) "));

//        System.out.println(Contains_Duplicate(new int[]{1, 3, 3, 4, 3, 2, 4, 2}));
//        System.out.println(Contains_Duplicate(new int[]{1, 2, 3, 4}));

//        System.out.println(is_prime(100));

        System.out.println(Single_number(new int[]{3,3,2,4,2,3}));



//        System.out.println(brackets("[(a+b)+{(c+d)*(e/f)}]"));
//        System.out.println(brackets("[(a + b) + {(c + d) * (e / f)]}"));

//        System.out.println(Arrays.toString(target(new int[]{11, 15, 4, 6, 7, 17, 19, 2, 21, 23, 35}, 9)));

//        System.out.println(Perform_Arithmetic_Operations(new Object[]{1, "+", 2, "+", 4, "*", 2, "*", -1, "*", 100, "/", 10}));

//        System.out.println(Get_Sum_Of_The_Array(new int[]{2, 3, 44, 2, 4, 6}));

//        System.out.println(Arrays.toString(Double_The_Element_In_List(new int[]{2, 3, 44, 2, 4, 6})));

//        System.out.println(Arrays.toString(Remove_Duplicate(new int[]{1, 1, 2, 2, 3, 4, 3, 4, 2})));
    }

}
