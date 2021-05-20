package bai_11_dsa_stack_and_queue.bai_tap.dem_so_lan_xuat_hien_cua_ky_tu;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWord {
    private static void countingWord(String str) {
        String[] string = str.trim().split("\\s+");
        System.out.println(Arrays.toString(string));
        Map<String, Integer> map = new TreeMap<>();
        for (String key : string) {
            key = key.toLowerCase();
            if (map.containsKey(key)) {
                int value = map.get(key) + 1;
                map.put(key, value);
            } else {
                map.put(key, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi :");
        String str = scanner.nextLine();
        countingWord(str);
    }
}
