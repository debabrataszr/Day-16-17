public class Main {
    public static void main(String[] args) {
        String word = "abc";
        binarySearch();
    }

    public static void binarySearch() {
        String[] array = {"we", "the", "people", "of", "India"};
        stringBinary(array, "people");
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
        System.out.println("Key not found ");
    }
}