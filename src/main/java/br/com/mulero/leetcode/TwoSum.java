package br.com.mulero.leetcode;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 * <p>
 * Dado um array de inteiros, retorna os índices dos dois números que somados resultam em um alvo específico.
 */
public class TwoSum {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int target = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> nums = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = twoSum(nums, target);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static List<Integer> twoSum(List<Integer> nums, int target) {
        Map<Integer, Integer> numIdx = new HashMap<>();

        for (int i = 0; i < nums.size(); i++) {
            Integer num = nums.get(i);
            int complement = target - num;

            if (numIdx.containsKey(complement)) {
                return Arrays.asList(numIdx.get(complement), i);
            }

            numIdx.put(num, i);
        }

        return Collections.emptyList();
    }
}
