package queues.queueschallenge;

import queues.queuesArray.ArrayQueue;

import javax.sound.sampled.Line;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        // should return true
//        System.out.println(checkForPalindrome("abccba"));
//        // should return true
//        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
//        // should return true
//        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
//         should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        LinkedList<Character> stack = new LinkedList<>();
        LinkedList<Character> queue = new LinkedList<>();
        String newString = string.toLowerCase();
        for (int i = 0; i < newString.length(); i++) {
            if (newString.charAt(i) >= 'a' && newString.charAt(i) <= 'z') {
                stack.push(newString.charAt(i));
                queue.addLast(newString.charAt(i));
            }
        }

        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.removeFirst())) {
                return false;
            }
        }
        return true;
    }
}
