package br.com.mulero.hackerrank.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MiniMaxSum {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Long> minMax = miniMaxSum(arr);

        bufferedReader.close();
    }

    public static List<Long> miniMaxSum(List<Integer> arr) {
        long max = 0;
        long min = 0;

        // Melhorar para remover ordenação do array
        List<Integer> sorted = arr.stream().sorted()
                .filter(integer -> integer != 0)
                .collect(toList());

        for (int i = 0; i < sorted.size(); i++) {
            if (i == 0) min += sorted.get(i);
            else if (i == sorted.size() - 1) max += sorted.get(i);
            else {
                max += sorted.get(i);
                min += sorted.get(i);
            }
        }

        return Arrays.asList(min, max);
    }
}
