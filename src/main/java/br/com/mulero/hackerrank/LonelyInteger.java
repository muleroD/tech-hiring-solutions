package br.com.mulero.hackerrank;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class LonelyInteger {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    private static int lonelyinteger(List<Integer> a) {
        int lonely = 0;

        HashMap<Integer, List<Integer>> elements = new HashMap<>();

        for (int i = 0; i < a.size(); i++) {
            if (!elements.containsKey(a.get(i))) elements.put(a.get(i), new ArrayList<>(i));
            else elements.get(a.get(i)).add(i);
        }

        for (Map.Entry<Integer, List<Integer>> integerListEntry : elements.entrySet()) {
            if (integerListEntry.getValue().isEmpty()) lonely = integerListEntry.getKey();
        }

        return lonely;
    }
}
