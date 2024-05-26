public class ArrCheckSum {
    public static boolean checkSum(int[] a, int size, int N) {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (a[i] + a[j] == N) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] arr = { 1, 2, 3, 4, 5 };
        int targetSum = 9;
        int arrSize = arr.length;

        boolean hasPair = checkSum(arr, arrSize, targetSum);
        System.out.println("Has pair with sum " + targetSum + ": " + hasPair);
    }
}