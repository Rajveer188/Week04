package com.tit.week04.day02.queue_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

import static java.lang.System.out;

public class GenerateBinary {
    //method to generate binary number
    public static List<String> generateBinary(int N) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("1");

        for (int i = 0; i < N; i++) {
            String binary = queue.remove();
            result.add(binary);
            queue.add(binary + "0");
            queue.add(binary + "1");
        }
        return result;
    }

    public static void main(String[] args) {
            int n = 5;

            List<String> binaryNumbers = generateBinary(n);
            out.println("binary numbers " + binaryNumbers);
    }
}
