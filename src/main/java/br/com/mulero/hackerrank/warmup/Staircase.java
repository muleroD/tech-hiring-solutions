package br.com.mulero.hackerrank.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <a href="https://www.hackerrank.com/challenges/staircase/problem">Staircase</a>
 * <p>
 * Dado uma escada de tamanho n, imprime uma escada de tamanho n com # e espaços.
 */
public class Staircase {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        staircase(n);

        bufferedReader.close();
    }

    private static void staircase(int n) {
        List<String> stair = new ArrayList<>(Collections.nCopies(n, " "));

        for (int i = n - 1; i >= 0; i--) {
            stair.set(i, "#");
            // Melhorar para remover o reduce
            System.out.println(stair.stream().reduce((s, s2) -> s + s2).orElse(""));
        }
    }
}
