package br.com.mulero.hackerrank.strings;

import java.io.*;
import java.util.regex.Pattern;

/**
 * <a href="https://www.hackerrank.com/challenges/caesar-cipher-1/problem">Caesar Cipher 1</a>
 * <p>
 * Em uma string contendo letras minúsculas e maiúsculas, criptografe a string usando a cifra de César.
 */
public class CaesarCipher1 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static String caesarCipher(String s, int k) {
        StringBuilder output = new StringBuilder();

        s.chars().forEach(i -> {
            boolean isCharacter = Pattern.matches("[a-zA-Z]", String.valueOf((char) i));

            if (isCharacter) {
                int decimal = i + (k % 26);

                if (i >= 65 && i <= 90 && decimal > 90) {
                    decimal = 64 + (decimal - 90);
                } else if (i >= 97 && i <= 122 && decimal > 122) {
                    decimal = 96 + (decimal - 122);
                }

                output.append((char) decimal);
            } else {
                output.append((char) i);
            }
        });

        return output.toString();
    }
}
