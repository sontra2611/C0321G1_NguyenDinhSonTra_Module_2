package bai_11_dsa_stack_and_queue.bai_tap.kiem_tra_chuoi_palindrome;

import java.util.*;

public class CheckPalindrome {
    public static void checkPalindrome(String str) {
        int n = str.length();
        boolean flag = true;
        String string = str.toLowerCase();
        String[] mWord = string.split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            stack.push(mWord[i]);
            queue.add(mWord[i]);
        }

        int length = stack.size();
        for (int i = 0; i < length; i++) {
            if (!stack.pop().equals(queue.poll())) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Chuoi " + str + " là chuoi doi xung");
        } else System.out.println("Chuoi " + str + " la chuoi khong doi xung");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao chuoi ban muon kiem tra : ");
        String string = scanner.nextLine();
        checkPalindrome(string);
    }
}
