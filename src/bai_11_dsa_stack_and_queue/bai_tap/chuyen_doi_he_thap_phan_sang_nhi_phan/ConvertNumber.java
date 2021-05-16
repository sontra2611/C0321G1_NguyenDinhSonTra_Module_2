package bai_11_dsa_stack_and_queue.bai_tap.chuyen_doi_he_thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class ConvertNumber {
    public static String ConvertNumber(int num) {
        int binary = 0;
        String string = "";
        Stack<Integer> stack = new Stack<>();
        while (num != 0) {
            binary = num % 2;
            stack.push(binary);
            num /= 2;
        }
        int size = stack.size();

        for (int i = 0; i < size; i++) {
            string += stack.pop();
        }
        return string;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so ban muon chuyen doi : ");
        int number = scanner.nextInt();
        System.out.print("So " + number + " trong he co so nhi phan la : " + ConvertNumber(number));
    }
}
