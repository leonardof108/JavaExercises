package com.leonardof108.challenges;

import java.io.*;
import java.util.*;

public class CountingBits {
    public static List<Integer> getOneBits(int n) {
        List<Integer> result = new ArrayList<>();
        List<Integer> positions = new ArrayList<>();

        int numBits = Integer.toBinaryString(n).length(); // Total significant bits
        int count = 0;
        int position = 1;

        // Traverse bit by bit from left to right
        for (int i = numBits - 1; i >= 0; i--) {
            
            if ((n & (1 << i)) != 0) { // Check if the i-th bit is 1
                positions.add(position);
                count++;
            }
            position++;
        }

        result.add(count); // Store total number of 1s
        result.addAll(positions); // Store positions

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> result = CountingBits.getOneBits(n);
        for (int num : result) {
            System.out.println(num);
        }

        bufferedReader.close();
    }
}
