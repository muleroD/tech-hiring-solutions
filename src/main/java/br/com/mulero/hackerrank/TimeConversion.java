package br.com.mulero.hackerrank;

import java.io.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * <a href="https://www.hackerrank.com/challenges/time-conversion">Time Conversion</a>
 * <p>
 * Dada uma string no formato AM/PM, o objetivo é retornar a string no formato 24H.
 */
public class TimeConversion {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static String timeConversion(String s) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ssa");
        TemporalAccessor parse = formatter.parse(s);
        formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return formatter.format(parse);
    }
}
