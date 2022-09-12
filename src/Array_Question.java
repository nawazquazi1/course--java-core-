import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
//import java.util.*;

public class Deepak_sir {
    public static void revers(int n) {
        while (n > 0) {
            int rev = n % 10;
            n /= 10;
            System.out.print(rev);
        }
    }

    public static void ispalidrom(int x) {
        int temp = x;
        int rev = 0, rem;
        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        if (rev == x) {
            System.out.println(true);
        } else {
            System.out.println(false);
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


    public static void Binary_Search(int[] arr, int search) {
        int li = 0;
        int hi = arr.length - 1;
        int middle = (li - hi) / 2;
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

    public static int Kth_Largest_elements(int[] arr, int k) {
//        for (int i=0;i<arr.length-1;i++){
//            for (int j=i+1;j<arr.length;j++){
//                if (arr[i]<arr[j]){
//                    int temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//            if (i==k-1){
//                System.out.println(arr[i]);
//                break;
//            }
//        }
//        return arr;
        Arrays.sort(arr);
        return arr[k - 1];
    }
//    public static int Second_Largest(int [] arr){
//
//
//    }

    public static void Find_duplicate_element(int[] arr) {
//                for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j] && (i != j)) {
//                    System.out.println(arr[j]);
//                }
//            }
//        }

//        pattern 2
//        HashSet<Integer> set=new HashSet<>();
//        for (int i:arr){
//            if (!set.add(i)){
//                System.out.println(i);
//            }
//        }

//        patten 3
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            Integer count = map.get(i);
            if (count == null) {
                map.put(i, 1);
            } else {
                count++;
                map.put(i, count);
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Integer> me : entrySet) {
            if (me.getValue() > 1) {
                System.out.println(me.getKey());
            }
        }
    }

    public static void Find_First_duplicate_element(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int temp = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (set.contains(arr[i])) {
                temp = i;
            } else {
                set.add(arr[i]);
            }
        }
        if (temp != -1) {
            System.out.println(arr[temp]);
        } else {
            System.out.println("firs duplicate are not available");
        }
    }

    public static void Find_The_Element_That_Appears_Once_In_An_Array(int[] arr) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        System.out.println("single element are : " + res);
    }

    public static void Find_Missing_Number_In_Array_In(int[] arr) {
//        int exp=arr.length+1;
//        int Total_Sum=exp*(exp+1)/2;
//        int sum=0;
//        for (int i=0;i<arr.length;i++){
//            sum+=arr[i];
//        }
//       System.out.println("Missing number is : "+(Total_Sum-sum));"

//       pattern 2
        int xor1 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            xor1 = xor1 ^ arr[i];
        }
        int xor2 = 1;
        for (int i = 2; i <= arr.length + 1; i++) {
            xor2 = xor2 ^ i;
        }
        System.out.println(xor1 ^ xor2);
    }

    public static void How_to_find_common_elements_from_Two_arrays(int[] arr, int[] arr2) {
//        Set<Integer>set=new HashSet<>();
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr2.length;j++){
//                if (arr[i]==arr2[j]){
//                   set.add(arr[i]);
//                   break;
//                }
//            }
//        }
//    System.out.println(set);

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int no : arr) {
            set1.add(no);
        }
        for (int no1 : arr2) {
            set2.add(no1);
        }
        for (int no : set2) {
            boolean flag = set1.add(no);
            if (!flag) {
                System.out.println(no);
            }
        }
    }

    public static void How_to_find_common_elements_from_Two_arrays(int[] arr1, int[] arr2, int[] arr3) {
        int x = 0, y = 0, z = 0;
        ArrayList<Integer> al = new ArrayList<>();
        while (x < arr1.length && y < arr2.length && z < arr3.length) {
            if (arr1[x] == arr2[y] && arr2[y] == arr3[z]) {
                al.add(arr1[x]);
                x++;
                y++;
                z++;
            } else if (arr1[x] < arr2[y]) {
                x++;
            } else if (arr2[y] < arr3[z]) {
                y++;
            } else {
                z++;
            }
        }
        for (int no : al) {
            System.out.println(no);
        }
    }

    public static void Longest_Consecutive_Sequence_In_An_Array(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int longest = 0;
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i] - 1)) {
                int no = arr[i];
                while (set.contains(no)) {
                    no++;
                }
                if (longest < no - arr[i]) {
                    longest = no - arr[i];
                }
            }
        }
        System.out.println(longest);
    }

    public static void Maximum_sum_SubArray(int[] arr) {
        int min = Integer.MIN_VALUE;
        int Max_ending = 0;
        int s = 0, start = 0, end = 0;
        for (int i = 0; i < arr.length; i++) {
            Max_ending += arr[i];
            if (min < Max_ending) {
                min = Max_ending;
                start = s;
                end = i;
            }
            if (Max_ending < 0) {
                Max_ending = 0;
                s = i + 1;
            }
        }
        System.out.println(min);
        System.out.println("Starting index position " + start);
        System.out.println("ending index position " + end);
    }

    public static void Insert_An_Element_Into_An_Array(int[] arr, int pos, int element) {
//        arr[pos-1]=element;
//        System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1; i > pos - 1; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos - 1] = element;
        System.out.println(Arrays.toString(arr));

    }

    public static void How_to_Delete_An_Element_From_An_Array(int[] arr, int delete_element) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (delete_element == arr[i]) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Element not found");
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.println((arr[i]));
            }
        }
    }

    public static void Remove_Duplicate_Elements_from_Sorted_and_Unsorted_Array(int[] arr) {
//        sorted an array
//        int[] temp = new int[arr.length];
//        int j = 0;
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] != arr[i + 1]) {
//                temp[j] = arr[i];
//                j++;
//            }
//        }
//        System.out.println(Arrays.toString(temp));

//        pattern 2
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(Arrays.toString(set.toArray()));
    }

    public static void Merge_Two_Arrays_in(int[] arr1, int[] arr2) {
//        ArrayList<Integer>list=new ArrayList<>();
//        for (int i : arr1){
//            list.add(i);
//        }
//        for (int i:arr2){
//            list.add(i);
//        }
//        System.out.println(Arrays.toString(list.toArray()));

//        pattern 2
        int a = arr1.length;
        int b = arr2.length;
        int c = a + b;
        int[] arr = new int[c];
        for (int i = 0; i < a; i++) {
            arr[i] = arr1[i];
        }
        for (int i = 0; i < b; i++) {
            arr[a + i] = arr2[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void MaxREpChar(String str) {
//        int[] arr = new int[127];
//        int max = -1;
//        for (int i = 0; i < str.length(); i++) {
//            arr[str.charAt(i)] = arr[str.charAt(i)] + 1;
//        }
//        char c = ' ';
//        for (int i = 0; i < str.length(); i++) {
//            if (max < arr[str.charAt(i)]) {
//                max = arr[str.charAt(i)];
//                c = str.charAt(i);
//            }
//        }
//        System.out.println("MAX REP CHAR   " + c);

//        pattern 2
        Map<Character, Integer> map = new HashMap<>();
        char[] ch = str.toCharArray();
        for (char c : ch) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int max = 0;
        char maxChar = ' ';
        for (Map.Entry<Character, Integer> me : map.entrySet()) {
            if (max < me.getValue()) {
                max = me.getValue();
                maxChar = me.getKey();
            }
        }
        System.out.println(Arrays.toString(map.entrySet().toArray()));
        System.out.println("maximum repeated character is " + maxChar);
    }

    public static void naaz() {
        System.out.println("asdcvb");
    }

    public static void main(String[] args) throws FileNotFoundException {

//        MaxREpChar("demonetise");
//        Merge_Two_Arrays_in(new int[]{10, 20, 30},  new int[]{40, 50, 60, 70, 80});
//        Remove_Duplicate_Elements_from_Sorted_and_Unsorted_Array(new int[] {1,2,2,3,4,4,4,5,5,6,6,2,3,6,7,8,4,9,9,2});
//        How_to_Delete_An_Element_From_An_Array(new int[]{12, 45, 67, 7543, 234, 567}, 100);
//        Insert_An_Element_Into_An_Array(new int[]{2, 1, 3, 4, 5, 6}, 2, 10);
//        Maximum_sum_SubArray(new int[]{4,-2,-3,4,-1,-2,1,5,-3});
//        Longest_Consecutive_Sequence_In_An_Array(new int[]{3, 9, 1, 10, 4, 20, 2});
//        How_to_find_common_elements_from_Two_arrays(new int[]{2,4,8,10}, new int[]{2,3,4,8,10,16},new int[]{2,8,10,40});
//        Find_Missing_Number_In_Array_In(new int[]{1,2,3,4,6,7,8,9,10});
//        Find_The_Element_That_Appears_Once_In_An_Array(new int[]{1,2,1,7,5,3,4,5,2,3,4,});
//        Find_First_duplicate_element(new int[]{12,3,4,2,4,2,45,64,4});
//        Find_duplicate_element(new int[]{12, 3, 2, 4, 3, 2, 2, 2, 2, 12, 4, 7, 67, 8, 6, 7});
//        int[] arr = {5, 8, 12, 7, 6, 2, 4};
//        System.out.println((Kth_Largest_elements(arr, 4)));
    }


}

