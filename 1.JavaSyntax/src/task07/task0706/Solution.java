package task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Street and houses
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[15];
        for(int i = 0; i < 15; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        int odd = 0;
        int even = 0;
        for(int i = 0; i < array.length; i++) {
            if(i % 2 == 0) even += array[i];
            else odd += array[i];
        }

        if (odd > even) {
            System.out.println("Odd-numbered houses have more residents.");
        } else if (even > odd) {
            System.out.println("Even-numbered houses have more residents.");
        }
    }
}
