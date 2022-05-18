package en.javarush.task.pro.task05.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Array of numbers in reverse order
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(reader.readLine());
            arr[i] = num;
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

