public class Main {
    public static void main(String[] args) {
        String word = "abc";
        System.out.println("Iterative Method");
        permutation(word);
        System.out.println("\n\nRecursive Method");
        solve(word.toCharArray(), 0);
    }

    public static void permutation(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                for (int k = 0; k < word.length(); k++) {
                    if (word.charAt(i) != word.charAt(j) && word.charAt(j) != word.charAt(k)
                            && word.charAt(k) != word.charAt(i))

                        System.out.print((word.charAt(i) + "" + word.charAt(j) + "" + word.charAt(k)) + " ");
                }
            }
        }
    }

    public static void swap(char[] arr, int index, int index2) {
        char temp = arr[index];
        arr[index] = arr[index2];
        arr[index2] = temp;
    }

    public static void solve(char[] arr, int index) {
        if (index == arr.length - 1) { //Base condition of recursion
            System.out.print(String.valueOf(arr) + " ");
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr, index, i);
            solve(arr, index + 1);
            swap(arr, index, i);
        }
    }
}