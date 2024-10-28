package SLIDING_WINDOW;

public class PrintStartAndEndIndex {
    public static void print(int arr[], int k) {
        int n = arr.length;
        int startIndex = 0;
        int endIndex = k - 1;
        while (endIndex < n) {
            System.out.println(startIndex + "-" + endIndex);
            startIndex++;
            endIndex++;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 9, 8, -2, 6, 65, 19 };
        int k = 3;
        print(arr, k);
    }
}
