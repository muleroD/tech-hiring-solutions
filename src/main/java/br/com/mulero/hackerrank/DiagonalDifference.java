package br.com.mulero.hackerrank;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * <a href="https://www.hackerrank.com/challenges/diagonal-difference">Diagonal Difference</a>
 * <p>
 * Dada uma matriz quadrada de inteiros, o objetivo é retornar a diferença entre a soma dos elementos
 * da diagonal principal e a soma dos elementos da diagonal secundária.
 */
public class DiagonalDifference {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    //    3
    //    11 2 4
    //    4 5 6
    //    10 8 -12
    public static int diagonalDifference(List<List<Integer>> arr) {
        int primaryDiag = 0;
        int secondaryDiag = 0;

        int lastIdx = arr.size() - 1;

        for (int x = 0; x < arr.size(); x++) {
            for (int y = 0; y < arr.get(x).size(); y++) {
                if (x == y)
                    primaryDiag += arr.get(x).get(y);

                if (y == lastIdx)
                    secondaryDiag += arr.get(x).get(y);
            }

            lastIdx--;
        }

        return Math.abs(primaryDiag - secondaryDiag);
    }
}
