package br.com.mulero.hackerrank.warmup;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * <a href="https://www.hackerrank.com/challenges/compare-the-triplets/problem">Compare the Triplets</a>
 * <p>
 * Dado dois arrays de inteiros, compare os elementos de cada array e atribua pontos para o array que tiver o maior
 * elemento em cada posição. O array que tiver mais pontos é o vencedor.
 */
public class CompareTriplets {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int size = a.size();

        int scoreA = 0;
        int scoreB = 0;

        for (int i = 0; i < size; i++) {
            if (a.get(i) > b.get(i)) scoreA++;
            else if (a.get(i) < b.get(i)) scoreB++;
        }

        return Arrays.asList(scoreA, scoreB);
    }
}
