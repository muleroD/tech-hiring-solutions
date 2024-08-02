package br.com.mulero.hackerrank.warmup;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * <a href="https://www.hackerrank.com/challenges/birthday-cake-candles">Birthday Cake Candles</a>
 * <p>
 * Dada uma lista de velas, onde cada vela tem uma altura específica, o objetivo é encontrar
 * quantas velas têm a mesma altura da vela mais alta.
 */
public class BirthdayCakeCandles {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = birthdayCakeCandles(candles);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    /**
     * Retorna a quantidade de ocorrencias do número mais alto na lista:
     * <p>
     * [3 2 1 3] - result 2
     * [4 1 1 3] - result 1
     */

    // 1. encontrar o maior número na lista
    // 2. encontrar quantas ocorrencias tiveram desse numero
    public static int birthdayCakeCandles(List<Integer> candles) {
        int max = -1;

        // Key -    candle
        // Value -  occurrence
        HashMap<Integer, Integer> candlesMap = new HashMap<>();

        for (Integer candle : candles) {
            if (candle > max) max = candle;

            // Podemos unificar em um HashMap.merge
            Integer i = candlesMap.get(candle);
            if (i == null) candlesMap.put(candle, 1);
            else candlesMap.put(candle, i + 1);
        }

        return candlesMap.get(max);
    }
}
