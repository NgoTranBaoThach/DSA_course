package sort.challenge2;

public class Main {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

//        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
//            int newElement = intArray[firstUnsortedIndex];
//
//            int i = firstUnsortedIndex;
//
//            intArray = insertionSort(intArray, i, newElement);
//
//        }
        intArray = insertionsort(intArray);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static int[] insertionsort(int[] intArray) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i = firstUnsortedIndex;

            intArray = insertionSort(intArray, i, newElement);
        }
        return intArray;
    }

    public static int[] insertionSort(int[] input, int i, int newElement) {
        if (i < 1) {
            input[i] = newElement;
            return input;
        }
        if (input[i - 1] > newElement) {
            input[i] = input[i - 1];
            i--;
            return insertionSort(input, i, newElement);
        } else {
            input[i] = newElement;
            return input;
        }
    }
}
