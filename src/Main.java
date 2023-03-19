public class Main {
    public static void main(String[] args) {
        String word = "abc";
        Main main = new Main();
        main.insertionSort();
    }

    public void insertionSort() {
        String[] array = {"my", "name", "is", "Debabrata"};
        String max = "null";
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareToIgnoreCase(array[j]) > 0) {
                    max = array[i];
                    array[i] = array[j];
                    array[j] = max;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}