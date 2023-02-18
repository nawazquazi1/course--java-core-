import java.util.*;

public class Meet_class {
    public static StringBuilder Roman(int num) {
        String[] str = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] number = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder roma = new StringBuilder();
        for (int i = 0; i < number.length; i++) {
            while (num >= number[i]) {
                num -= number[i];
                roma.append(str[i]);
            }
        }
        return roma;
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
                if (max < sum) {
                    max = sum;
                }
            }
        }
        return max;
    }

    public static int numberOfSteps(int num) {
        int step = 0;
        while (num != 0) {
            if (num % 2 > 0) {
                num--;
            } else {
                num /= 2;
            }
            step++;
        }
        return step;
    }

    public static boolean Palindrome(int[] arr) {
        if (arr[0] == arr[arr.length - 1]) {
            return true;
        } else {
            return false;
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }

    public static int addBinary(String a, String b) {
        StringBuilder str = new StringBuilder();
        int de = Integer.parseInt(a, 2);
        return de;
    }

    public static int removeDuplicates(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i : nums) {
            if (i != val) {
                nums[count++] = i;
            }
        }
        return count;
//        }
//        HashSet<Integer> st=new HashSet<>();
//        int co=0;
//        for (int i=0;i<nums.length;i++){
//            if (!st.add(nums[i])){
//                st.add(nums[i]);
//                co++;
//            }
//        }
//        return co++;
    }

    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (digits[0] == 0) {
            int[] re = new int[digits.length + 1];
            re[0] = 1;
            return re;
        }
        return digits;
    }

    public static int mySqrt(int x) {
        int sqrt = (int) Math.pow(x, 0.5);
        return sqrt;
    }

    public static int climbStairs(int n) {
        int prev = 0;
        int current = 1;

        for (int i = 0; i < n; i++) {
            int next = current + prev;
            prev = current;
            current = next;
        }

        return current;
    }

    public static Object[] containsDuplicate(int[] nums) {
        HashSet<Integer> str = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
//            if (!str.add(nums[i])){
            str.add(nums[i]);
//            }
        }
        return str.toArray();
    }

    public static int largestRectangleArea(int[] heights) {
        int[] rb = new int[heights.length];
        int[] lb = new int[heights.length];
        Stack<Integer> st = new Stack<>();
        st.push(heights.length - 1);
        rb[heights.length - 1] = heights.length;
        for (int i = heights.length - 2; i >= 0; i--) {
            while (st.size() > 0 && heights[i] <= heights[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                rb[i] = heights.length;
            } else {
                rb[i] = st.peek();
            }
            st.push(i);
        }
        st.push(0);
        lb[0] = -1;
        for (int i = 1; i < heights.length; i++) {
            while (st.size() > 0 && heights[i] <= heights[st.peek()]) {
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
        for (int i = 0; i < heights.length; i++) {
            int width = rb[i] - lb[i] - 1;
            int area = heights[i] * width;
            if (max < area) {
                max = area;
            }
        }
        return max;
    }

    public static int[] windo(int[] arr, int k) {
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr.length - 1);
        nge[arr.length - 1] = arr.length;
        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] >= arr[st.peek()]) {
                st.pop();
            }
            nge[i] = st.size() == 0 ? arr.length : st.peek();
            st.push(i);
        }
        int j = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            if (j < i) {
                j = i;
            }
            while (nge[j] < i + k) {
                j = nge[j];
            }
            System.out.println(arr[j]);
        }
        return arr;
    }

    public static int invix(String exp) {
        Stack<Character> operters = new Stack<>();
        Stack<Integer> number = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                operters.push(ch);
            } else if (Character.isDigit(ch)) {
                number.push(ch - '0');
            } else if (ch == ')') {
                while (operters.peek() != '(') {
                    char opert = operters.pop();
                    int v2 = number.pop();
                    int v1 = number.pop();
                    int inv = operter(v1, v2, opert);
                    number.push(inv);
                }
                operters.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (operters.size() > 0 && operters.peek() != '(' && handel(ch) <= handel(operters.peek())) {
                    char opert = operters.pop();
                    int v2 = number.pop();
                    int v1 = number.pop();
                    int rv = operter(v1, v2, opert);
                    number.push(rv);
                }
                operters.push(ch);
            }
        }
        while (operters.size() != 0) {
            char opert = operters.pop();
            int v2 = number.pop();
            int v1 = number.pop();
            int rv = operter(v1, v2, opert);
            number.push(rv);
        }
        System.out.println(number.peek());
        return number.peek();
    }

    public static int handel(char ch) {
        if (ch == '+') {
            return 1;
        } else if (ch == '-') {
            return 1;
        } else if (ch == '*') {
            return 2;
        } else {
            return 2;
        }
    }

    public static int operter(int v1, int v2, char operter) {
        if (operter == '+') {
            return v1 + v2;
        } else if (operter == '-') {
            return v1 - v2;
        } else if (operter == '*') {
            return v1 * v2;
        } else {
            return v1 / v2;
        }
    }

    public static int infixConversions(String exp) {
//        pre op num
//        post num op
        Stack<String> post = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<Character> operter = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == '(') {
                operter.push(ch);
            } else if (ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9' || ch >= 'A' && ch <= 'Z') {
                post.push(ch + "");
                pre.push(ch + "");
            } else if (ch == ')') {
                while (operter.peek() != '(') {
                    char c = operter.pop();
                    String pv2 = post.pop();
                    String pv1 = post.pop();
                    String rpv = pv1 + pv2 + c;
                    post.push(rpv);

                    String pev2 = pre.pop();
                    String pev1 = pre.pop();
                    String prpv = c + pev1 + pev2;
                    pre.push(prpv);
                }
                operter.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (operter.size() > 0 && operter.peek() != '(' && handel(ch) <= handel(operter.peek())) {
                    char c = operter.pop();
                    String pv2 = post.pop();
                    String pv1 = post.pop();
                    String rpv = pv1 + pv2 + c;
                    post.push(rpv);

                    String pev2 = pre.pop();
                    String pev1 = pre.pop();
                    String prpv = c + pev1 + pev2;
                    pre.push(prpv);
                }
                operter.push(ch);
            }
        }
        while (operter.size() != 0) {
            char c = operter.pop();
            String pv2 = post.pop();
            String pv1 = post.pop();
            String rpv = pv1 + pv2 + c;
            post.push(rpv);

            String pev2 = pre.pop();
            String pev1 = pre.pop();
            String prpv = c + pev1 + pev2;
            pre.push(prpv);
        }
        System.out.println(post.peek());
        System.out.println(pre.peek());
        return 0;
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
                int as = operter(v1, v2, ch);
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

    public static void prefix(String exp) {
        Stack<Integer> vl = new Stack<>();
        Stack<String> po = new Stack<>();
        Stack<String> in = new Stack<>();
        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                int v1 = vl.pop();
                int v2 = vl.pop();
                int v = operter(v1, v2, ch);
                vl.push(v);
                String p1 = po.pop();
                String p2 = po.pop();
                String p = p1 + p2 + ch;
                po.push(p);

                String i1 = in.pop();
                String i2 = in.pop();
                String n = "(" + i1 + ch + i2 + ")";
                in.push(n);
            } else {
                in.push(ch + "");
                po.push(ch + "");
                vl.push(ch - '0');
            }
        }
        System.out.println(in.pop());
        System.out.println(vl.pop());
        System.out.println(po.pop());
    }

    public static int[][] merge(int[][] intervals) {
        ArrayList<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for (int[] time : intervals) {
            if (list.size() == 0) {
                list.add(time);
            } else {
                int[] per = list.get(list.size() - 1);
                if (time[0] <= per[1]) {
                    per[1] = Math.max(time[1], per[1]);
                } else {
                    list.add(time);
                }
            }
        }
        System.out.println(list);

        return list.toArray(new int[list.size() - 1][]);
    }

    public static void smallestfollwpattern(String exp) {
        Stack<Integer> st = new Stack<>();
        int num = 1;
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (ch == 'd') {
                st.push(num);
                num++;
            } else {
                st.push(num);
                num++;
                while (st.size() > 0) {
                    System.out.print(st.pop());
                }
            }
        }
        st.push(num);
        while (st.size() > 0) {
            System.out.println(st.pop());
        }
    }


    public static boolean isValid(String s) {
//        HashMap<String, String> map = new HashMap<>();
//        map.put("(", ")");
//        map.put("[", "]");
//        map.put("{", "}");
//        Stack<String> st = new Stack<>();
//        for (char ch : s.toCharArray()) {
//            if (map.containsKey(String.valueOf(ch))) {
//                st.push(String.valueOf(ch));
//            } else {
//                String latest = st.pop();
//                System.out.println(latest);
//                String open = map.get(latest);
//                System.out.println(open);
//                if (open.equals(String.valueOf(ch))) {
//                    return true;
//                }
//            }
//        }
//        return false;

        LinkedList<Character> list = new LinkedList<>();
        char[] ch = s.toCharArray();
        int i = 0;
        while (i != ch.length) {
            if (ch[i] == '(' || ch[i] == '[' || ch[i] == '{') {
                list.addLast(ch[i]);
            } else if (list.peek() != null) {
                if (ch[i] == ')' && list.pollLast() != '(') {
                    return false;
                }
                if (ch[i] == ']' && list.pollLast() != '[') {
                    return false;
                }
                if (ch[i] == '}' && list.pollLast() != '{') {
                    return false;
                }
            } else {
                return false;
            }
            i++;
        }

        if (list.peek() != null) {
            return false;
        } else {
            return true;
        }
    }

//    public static Object[] mergeTwoLists(int[] arr1, int[] arr2) {
//        List<Integer> list = new ArrayList<>();
//        for (int El : arr1) {
//            list.add(El);
//        }
//        for (int El : arr2) {
//            list.add(El);
//        }
//        Collections.sort(list);
//        return list.toArray();
//    }

    public static int[] removeDuplicates1(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int[] a = new int[set.size()];
        int k = 0;
        for (int i : set) {
            a[k] = i;
            k++;
        }
        return a;
    }

    public static int strStr(String haystack, String needle) {
        if (!haystack.contains(needle)) {
            return -1;
        }
        return haystack.indexOf(needle);
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || target < nums[i]) {
                return i;
            }
        }
        return nums.length;
    }

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static int lengthOfLastWord1(String s) {
        String str = (s.replaceAll("\\s+", " "));
        String se = str.substring(str.length() - 1);
        return se.length();
    }

    public static int lengthOfLastWord(String s) {
        String[] sa = s.split(" ");
        return sa[sa.length - 1].length();
    }

    public static String convert(int n, int k) {
        int sum = 0;
        while (n != 0) {
            sum += n % k;
            n /= k;
        }
        return String.valueOf(sum);
    }

    public static void main(String[] args) {


//        System.out.println(bulbSwitch(16));

//        smallestfollwpattern("dddididi");

//        System.out.println(Arrays.deepToString(merge(new int[][]{{2, 6}, {8, 10}, {1, 3},{15, 18}})));
//        System.out.println(Arrays.deepToString(merge(new int[][]{{22,28}, {1,8}, {25,27},{14,19},{27,30},{5,12}})));
//        System.out.println(Arrays.deepToString(merge(new int[][]{{1,4}, {4,5}})));


//        postfixExpresion("264*8/+3");

//        System.out.println(infixConversions("2+6*4/8-3"));

//        System.out.println(invix("2 + 6 * 4 / 8 - 3"));

//        System.out.println(Arrays.toString(windo(new int[]{34, 23, 34, 45, 12, 34, 67, 3, 45}, 4)));

//        System.out.println(convert(42,2));

//        System.out.println(largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));


//        System.out.println(lengthOfLastWord(  " fly me   to   the moon  "));

//        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));

//        System.out.println(searchInsert(new int[]{1,3,5,6},5));
//        System.out.println(searchInsert(new int[]{1,3,5,6},2));
//        System.out.println(searchInsert(new int[]{1,3,5,6},7));

//        System.out.println(strStr("aaaaa","bba"));

//        System.out.println((Arrays.toString(removeDuplicates1(new int[]{1, 1, 2}))));

//        System.out.println(Arrays.toString(mergeTwoLists(new int[]{1, 2, 4}, new int[]{1, 3, 4})));

//        System.out.println(isValid("{[]}"));
//        System.out.println(isValid("(}"));

//        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));

//        System.out.println(Palindrome(new int[]{1,2,2,1}));
//        System.out.println(Palindrome(new int[]{1,2}));

//        System.out.println(numberOfSteps(2));

//        System.out.println(maximumWealth(new int[][]{{6,59,64,19,30,76,71,86,90,25,56,17,19,72,61,56,24,40,35,39,67,28,52,11,82,72,8,82,81,47}}));

//        fg(111001,2,3);

//        fd(111001,2);

//         f(57,2);

//        System.out.println(multi(3,
//                2200,122)
//        );


//        System.out.println(one(5, 2156, 4));

//        System.out.println(sub(8, 1, 100));


//        System.out.println(nawaz(5, 4344,1220));


//        System.out.println( 94%10);

//        System.out.println(Roman(3));


    }
}
