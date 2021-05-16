package bai_11_dsa_stack_and_queue.bai_tap.kiem_tra_dau_ngoac;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracket {
    public static boolean checkBracket(String exp) {
        int n = exp.length();
        Stack<String> stack = new Stack<>();
        String[] sym = exp.split("");
        for (int i = 0; i < n; i++) {
            if (sym[i].equals("(") || sym[i].equals("[") || sym[i].equals("{")) {
                stack.push(sym[i]);
            } else if (sym[i].equals(")") || sym[i].equals("]") || sym[i].equals("}")) {
                if (stack.empty()) {
                    return false;
                } else {
                    String left = stack.pop();
                    if (sym[i].equals("]")) {
                        if (!left.equals("[")) {
                            return false;
                        }
                    }
                    if (sym[i].equals(")")) {
                        if (!left.equals("(")) {
                            return false;
                        }
                    }
                    if (sym[i].equals("}")) {
                        if (!left.equals("{")) {
                            return false;
                        }
                    }
                }
            }
        }

        if (stack.empty()) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao bieu thuc ban muon kiem tra : ");
        String string = scanner.nextLine();
        System.out.println(checkBracket(string));
    }
}