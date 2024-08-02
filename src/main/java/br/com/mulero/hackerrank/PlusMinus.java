package br.com.mulero.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PlusMinus {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        plusMinus(arr);

        bufferedReader.close();
    }

    public static void plusMinus(List<Integer> arr) {
        BigDecimal size = BigDecimal.valueOf(arr.size());
        BigDecimal positives = BigDecimal.ZERO;
        BigDecimal negatives = BigDecimal.ZERO;
        BigDecimal zeros = BigDecimal.ZERO;

        for (Integer i : arr) {
            if (i == 0) zeros = zeros.add(BigDecimal.ONE);
            else if (i > 0) positives = positives.add(BigDecimal.ONE);
            else negatives = negatives.add(BigDecimal.ONE);
        }

        System.out.println(positives.divide(size, 6, RoundingMode.HALF_UP));
        System.out.println(negatives.divide(size, 6, RoundingMode.HALF_UP));
        System.out.println(zeros.divide(size, 6, RoundingMode.HALF_UP));
    }
}