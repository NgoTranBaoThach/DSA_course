package stacks.stackschallenge;

import java.util.EmptyStackException;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
//        // should return true
//        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
//        // should return true
//        System.out.println(checkForPalindrome("I did, did I?"));
//        // should return false
//        System.out.println(checkForPalindrome("hello"));
//        // should return true
//        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        ArrayStack stack = new ArrayStack(string.length());
        char[] strArray = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            stack.push(strArray[i]);
            System.out.println(strArray[i]);
        }
        boolean check = true;
        int start = 0;
        int constraint = stack.getTop() / 2 + 1;
        int top = stack.getTop();
        while (start <= constraint) {
            if (!Character.isAlphabetic(stack.getStack()[--top])) {
                System.out.println("Popped: " + stack.pop());
            }
            if (!Character.isAlphabetic(stack.getStack()[start])) {
                start++;
            }
            System.out.println("End: " + Character.toLowerCase(stack.getStack()[top - 1]) + " -- Start: " + Character.toLowerCase(stack.getStack()[start + 1]));
            System.out.println(start);
            check = Character.toLowerCase(stack.getStack()[top - 1]) == Character.toLowerCase(stack.getStack()[start++]);
        }
        return check;
    }
}

class ArrayStack {
    private char[] stack;

    private int top;

    public ArrayStack(int capacity) {
        stack = new char[capacity];
    }

    public void push(char character) {
        if (top == stack.length) {
            // need to resize the backing array
            char[] newArray = new char[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }

        stack[top++] = character;
    }

    public char pop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }

        char removedChar = stack[--top];
        stack[top] = ' ';
        return removedChar;
    }

    public char peek() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public boolean isEmpty() {
        return stack.length == 0;
    }

    public char[] getStack() {return stack;}

    public int getTop() {return top;}
}
