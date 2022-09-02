public class SearchingArray {
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

    public static void LinearSearch(int[] arr, int search) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == search) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

//        LinearSearch(new int[]{2, 5, 7, 34, 56, 54}, 7);
        Binary_Search(new int[]{2,5,7,34,56,54,23,12,12,14,13,56,1234},7);
    }
}
