package sort.challenge3;

public class Main {

    public static void main(String[] args) {
        String[] stringsArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        radixSort(stringsArray, 5);

        for (int i = 0; i < stringsArray.length; i++) {
            System.out.println(stringsArray[i]);
        }
    }

    public static void radixSort(String[] input, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(input, i);
        }
    }

    public static void radixSingleSort(String[] input, int position) {

    }

    public static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }

    public static char getCharacter(int position, String value) {
        return value.charAt(position);
    }

}
