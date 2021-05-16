package bai_11_dsa_stack_and_queue.bai_tap.dao_nguoc_phan_tu_su_dung_stack;

import java.util.Stack;

public class Reverse {
    public static void reverserArrayElement(int[] array) {
        int n = array.length;
        System.out.print("Mang ban dau : ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            stack.push(array[i]);
        }

        System.out.println();
        System.out.print("Mang sau khi dao nguoc : ");
        for (int i = 0; i < n; i++) {
            array[i] = stack.pop();
            System.out.print(array[i] + " ");
        }
    }

    public static void reverserString(String str) {
        System.out.println("Chuoi ban dau : " + str);
        int n = str.length();
        String[] mWord = str.split("");
        Stack<String> wStack = new Stack<>();
        for (int i = 0; i < n; i++) {
            wStack.push(mWord[i]);
        }

        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            mWord[i] = wStack.pop();
            newString += mWord[i];
        }

        System.out.print("Chuoi sau khi dao nguoc : " + newString);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverserArrayElement(array);

        System.out.println("\n");

        String string = "codegym";
        reverserString(string);
    }
}
