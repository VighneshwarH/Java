public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 40, 15};
        int max = arr[0], min = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Max = " + max + ", Min = " + min);
    }
}
