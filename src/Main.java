public class Main {
    public static void main(String[] args) {
        String word = "abc";
        Main main = new Main();
        //   main.binarySearch();
        main.insertionSort();
        main.bubbleSort();
    }


    public void binarySearch() {
        String[] array = {"India", "is", "my", "country"};
        stringBinary(array, "India");
    }

    public static void stringBinary(String[] array, String search) {
        int mid;
        int min = 0, max = array.length - 1;
        while (min <= max) {
            mid = (min + max) / 2;
            if (array[mid].compareTo(search) < 0) {
                min = mid + 1;
            } else if (array[mid].compareTo(search) > 0) {
                max = mid - 1;
            } else if (array[mid].compareTo(search) == 0) {
                System.out.println("Key found");
                return;
            }
        }
        System.out.println("key not found ");
    }

    public void insertionSort() {
        String[] array = {"my", "name", "is", "Debabrata"};
        for (int i = 0; i < array.length; i++) {
            String word = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(word) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = word;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void bubbleSort() {
        int[] array = {1, 35, 63, 24, 85, 3, 9};
        int max = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    max = array[i];
                    array[i] = array[j];
                    array[j] = max;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}