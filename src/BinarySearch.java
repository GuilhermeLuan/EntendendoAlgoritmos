public class BinarySearch {
    public static void main(String[] args) {
        int[] meuArray = new int[100];

        for (int i = 0; i < 100; i++) {
            meuArray[i] = i + 1;
        }

        System.out.println(binarySearch(meuArray, 99));
        System.out.println(binarySearch(meuArray, -1));
    }

    public static Object binarySearch(int[] array, int target){
        int left = 0;
        int right = array.length  - 1;

        while (left <= right){
            int mid = (left + right) / 2;
            int guess = array[mid];

            if (guess == target) return mid;
            if (guess > target) right = mid - 1;
            else left = mid + 1;
        }
        return null;

    }
}


