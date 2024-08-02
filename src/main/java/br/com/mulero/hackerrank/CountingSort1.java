package br.com.mulero.hackerrank;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * <a href="https://www.hackerrank.com/challenges/countingsort1">Counting Sort 1</a>
 * <p>
 * Dada uma lista de inteiros, o objetivo é retornar um array de inteiros com a quantidade de
 * ocorrências de cada número.
 */
public class CountingSort1 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = countingSort(arr);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

    // arr = [1,2,3,2,1]

    // i	arr[i]	result
    // 0	1	[0, 1, 0, 0]
    // 1	1	[0, 2, 0, 0]
    // 2	3	[0, 2, 0, 1]
    // 3	2	[0, 2, 1, 1]
    // 4	1	[0, 3, 1, 1]

    // result = [0,3,1,1]
    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> output = new ArrayList<>(Collections.nCopies(100, 0));

        for (Integer idxValue : arr) {
            output.set(idxValue, output.get(idxValue) + 1);
        }

        return output;
    }
}
