package br.com.mulero.hackerrank.sorting;

import java.io.*;
import java.math.BigInteger;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * <a href="https://www.hackerrank.com/challenges/big-sorting/problem">Big Sorting</a>
 * <p>
 * Dado um array de strings de números inteiros, ordene-os de forma que seus dígitos sejam ordenados em ordem crescente.
 */
public class BigSorting {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> unsorted = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<String> result = bigSorting(unsorted);

        bufferedWriter.write(
                result.stream()
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static List<String> bigSorting(List<String> unsorted) {
        return unsorted.stream()
                .sorted((o1, o2) -> {
                    if (o1.length() == o2.length()) {
                        return new BigInteger(o1).compareTo(new BigInteger(o2));
                    }
                    return o1.length() - o2.length();
                })
                .collect(toList());
    }
}
