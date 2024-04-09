public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 2, 10};
        selectionSort(arr);

        for (int num :
                arr) {
            System.out.print(num + " ");
        }
    }

    public static void selectionSort(int[] array) {
        for (int fixo = 0; fixo < array.length - 1; fixo++) {
            int menor = fixo;

            for (int i = menor + 1; i < array.length; i++) {
                if (array[i] < array[menor]) {
                    menor = i;
                }
            }
            if (menor != fixo) {
                int t = array[fixo];
                array[fixo] = array[menor];
                array[menor] = t;
            }
        }
    }
}