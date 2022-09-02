//                                                                       بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيم
//                                                                   لا إله إلا الله محمد رسول الله
//                   اَللّٰھُمَّ صَلِّ عَلٰی مُحَمَّدٍ وَّعَلٰٓی اٰلِ مُحَمَّدٍ کَمَا صَلَّیْتَ عَلٰٓی اِبْرَاھِیْمَ وَعَلٰٓی اٰلِ اِبْرَاھِیْمَ اِنَّکَ حَمِیْدٌ مَّجِیْدٌ اَللّٰھُمَّ بَارِکْ عَلٰی مُحَمَّدٍ وَّعَلٰٓی اٰلِ مُحَمَّدٍ کَمَا بَارَکْتَ عَلٰٓی اِبْرَاھِیْمَ وَعَلٰٓی اٰلِ اِبْرَاھِیْمَ اِنَّکَ حَمِیْدٌ مَّجِیْدٌ

import javax.swing.*;
import java.util.Arrays;

public class Sorting_program {


    //    bubble sorted
    public static int[] bubbleSorted(int[] no) {
//        for (int i = 0; i < no.length; i++) {
//            int flag = 0;
//            for (int j = 0; j < no.length - 1; j++) {
//                if (no[j] > no[j + 1]) {
//                    int temp = no[j];
//                    no[j] = no[j + 1];
//                    no[j + 1] = temp;
//                    flag++;
//                }
//            }
//            if (flag == 0) {
//                break;
//            }
//        }
//        return no;

//        patten 2
//        time Complexity = O(N^2);
        for (int i = 0; i < no.length - 1; i++) {
            for (int j = 0; j < no.length - i - 1; j++) {
                if (no[j] > no[j + 1]) {
                    //swap
                    int temp = no[j];
                    no[j] = no[j + 1];
                    no[j + 1] = temp;
                }
            }
        }
        return no;
    }

    public static void bubble_string_sort(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //    Selection sort
    public static void Selection_sort(int[] arr) {
        int min;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
//
        System.out.println(Arrays.toString(arr));
//        pattern 2
//        time complexity = O(n^2)
//        for (int i = 0; i < arr.length - 1; i++) {
//            int small = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[small] > arr[j]) {
//                    small = j;
//                }
//            }
//            int temp = arr[small];
//            arr[small] = arr[i];
//            arr[i] = temp;
//        }
//        System.out.println(Arrays.toString(arr));
    }


    public static void Selection_sorts(String[] arr) {
        int min;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    //    Insertion Sort
    public static int[] insertion_sort(int[] arr) {
//        int temp, j;
//        for (int i = 1; i < arr.length; i++) {
//            temp = arr[i];
//            j = i;
//            while (j > 0 && arr[j - 1] > temp) {
//                arr[j] = arr[j - 1];
//                j = j - 1;
//            }
//            arr[j] = temp;
//        }
//        5 1 6 2 4 3    temp 5  j=1   j=temp
//        1 5 6 2 4 3    temp 1  j=5   j=temp
//        1 2 5 6 4 3    temp 2  j=2   j=temp
//        1 2 3 5 6 4    temp 3  j=3   j=temp
//        1 2 3 4 5 6    temp 4  j=4   j=temp
//        return arr;

//        pattern 2

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j > 0 && arr[current] < arr[j - 1]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        return arr;
    }

    //  Quick_Sort
    public static int Quick_Sort_Middle(int[] arr, int low, int high) {
//        int pivot = arr[low];
        int pivot = arr[(low + high) / 2];
        while (low <= high) {
            while (arr[low] < pivot) {
                low++;
            }
            while (arr[high] > pivot) {
                high--;
            }
            if (low <= high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        System.out.println("low " + low);
        return low;
    }

    static void Quick_Sort_Middle_Recursion(int[] arr, int low, int high) {
        int pi = Quick_Sort_Middle(arr, low, high);
        System.out.println("pi " + pi);
        if (low < pi - 1) {
            Quick_Sort_Middle_Recursion(arr, low, pi - 1);
        }
        if (pi < high) {
            Quick_Sort_Middle_Recursion(arr, pi, high);
        }

    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }

    //   Merge sort
    int[] arr;
    int[] TempMergeArr;
    int length;

    public void sort(int[] arr) {
        this.arr = arr;
        this.length = arr.length;
        this.TempMergeArr = new int[length];
//        divide(0, length - 1);
    }

//    public void divide(int lower, int higher) {
//        if (lower < higher) {
//            int middle = lower + (higher - lower) / 2;
////            it will sort left side of an array
//            divide(lower, middle);
////            it will sort the left side of an array
//            divide(middle + 1, higher);
//            merge_array(lower, middle, higher);
//        }
//    }

    public void merge_array(int lower, int middle, int higher) {
        for (int i = lower; i <= higher; i++) {
            TempMergeArr[i] = arr[i];
        }
        int i = lower;
        int j = middle + 1;
        int k = lower;
        while (i <= middle && j <= higher) {
            if (TempMergeArr[i] <= TempMergeArr[j]) {
                arr[k] = TempMergeArr[i];
                i++;
            } else {
                arr[k] = TempMergeArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            arr[k] = TempMergeArr[i];
            k++;
            i++;
        }
    }

    public static void conquer(int[] arr, int si, int mid, int ei) {
        int[] merged = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x] = arr[idx1];
                x++;
                idx1++;
            } else {
                merged[x] = arr[idx2];
                x++;
                idx2++;
            }
        }
        while (idx1 <= mid){
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }
        for (int i = 0, j =si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;//(si+ei)/2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si,mid,ei);
    }


    //    heap sorted
    public static void sort1(int[] arr) {
        int length = arr.length;
        for (int i = length / 2 - 1; i >= 0; i--) {
            heapify(arr, length, i);
        }
//        swap the elements and heapify again
        for (int i = length - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i; //parent note index position
        int li = 2 * i + 1;   // left child node index position
        int ri = 2 * i + 2;   // right child node index position
        if (li < n && arr[li] > arr[largest]) {
            largest = li;
        }
        if (ri < n && arr[ri] > arr[largest]) {
            largest = ri;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }


    public static void main(String[] args) {


        int[] arr = {6, 3, 9, 5, 2, 8};
        int n=arr.length;
        divide(arr, 0, n-1 );
       for (int i=0;i<n;i++){
           System.out.println(arr[i]+" ");
       }
        System.out.println();


//        bubble_string_sort(new String[]{"nawaz","akib","aakib"});

//        sort1(new int[]{34, 45, 56, 34, 456, 34, 45, 232, 7, 12, 454, 7, 12, 4, 6, 8, 2, 4, 78, 4, 23245, 7});

//        int[] arr = {2234, 45, 456, 4546, 3456, 345, 45, 45, 45, 12, 565, 3, 21, 78};
//        Deepak_sir d = new Deepak_sir();
//        d.sort(arr);
//        for (int i : arr) {
//            System.out.println(i);
//        }
//        int[] arr = {23, 5, 34, 65, 67, 234, 1, 34, 56};
//        Quick_Sort_Middle_Recursion(arr, 0, arr.length - 1);
//        print(arr);
//        System.out.println(Arrays.toString(bubbleSorted(new int[]{36, 19, 29, 12, 5, 23, 345, 4, 34546, 44, 345, 3456, 2, 3, 3454, 4, 546, 2, 432, 345, 34, 354, 234, 5, 44, 3354, 32, 45, 4, 3435, 4, 35, 4, 3, 34, 5, 35, 443, 5, 32, 45, 43, 5, 34, 54, 345, 43, 5, 43, 45, 4, 35, 53, 5, 3, 45, 345, 435, 4, 3, 5, 3, 5, 4, 55, 3, 5, 43, 45, 3, 24, 3, 5325, 32, 544, 5, 432, 5, 42, 5, 45453, 45, 5, 6, 5, 5, 45, 6, 553, 435, 3445, 34, 5, 2, 46, 3, 5, 4, 6, 4, 43546, 645, 45, 4, 35, 35, 45, 54, 53, 435, 54, 55, 43, 4, 45, 4, 34546, 35345, 43, 3543, 45, 4, 6, 54, 464665465, 5, 5466545, 56, 5, 5, 5, 5, 4654, 54, 5, 644, 4, 65, 66, 6, 6, 6, 6, 65, 65,})));
//        System.out.println(Arrays.toString(bubbleSorted(new int[]{3, 5, 23, 456, 34, 56, 43})))
//        Selection_sort(new int[]{36, 19, 29, 12, 5, 23, 345, 4, 34546, 44, 345, 3456, 2, 3, 3454, 4, 546, 2, 432, 345, 34, 354, 234, 5, 44, 3354, 32, 45, 4, 3435, 4, 35, 4, 3, 34, 5, 35, 443, 5, 32, 45, 43, 5, 34, 54, 345, 43, 5, 43, 45, 4, 35, 53, 5, 3, 45, 345, 435, 4, 3, 5, 3, 5, 4, 55, 3, 5, 43, 45, 3, 24, 3, 5325, 32, 544, 5, 432, 5, 42, 5, 45453, 45, 5, 6, 5, 5, 45, 6, 553, 435, 3445, 34, 5, 2, 46, 3, 5, 4, 6, 4, 43546, 645, 45, 4, 35, 35, 45, 54, 53, 435, 54, 55, 43, 4, 45, 4, 34546, 35345, 43, 3543, 45, 4, 6, 54, 464665465, 5, 5466545, 56, 5, 5, 5, 5, 4654, 54, 5, 644, 4, 65, 66, 6, 6, 6, 6, 65, 65});//        Selection_sorts(new String[]{"nawaz", "quzi", "akib", "aakib", "mohammd", "nawaj"});
//        System.out.println(Arrays.toString(insertion_sort(new int[]{2, 345,67, 89, 2345, 467, 245, 34, 23, 1245, 54, 234, 12, 14, 5})));
    }


}
