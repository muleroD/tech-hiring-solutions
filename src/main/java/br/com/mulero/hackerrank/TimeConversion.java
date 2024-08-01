package br.com.mulero.hackerrank;

import java.io.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class TimeConversion {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = timeConversion(s);
        System.out.println(result);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    /**
     * Metodo que recebe um formato AM/PM e retorna no formato 24H
     * 12:00:00AM >> 00:00:00
     * 12:01:00AM >> 00:01:00
     * 12:00:00PM >> 12:00:00
     * 12:01:00PM >> 12:01:00
     * 09:08:21PM >> 21:08:21
     *
     * @param s String com formato AM/PM
     * @return String com formato 24H
     */
    private static String timeConversion(String s) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ssa");
        TemporalAccessor parse = formatter.parse(s);
        formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return formatter.format(parse);
    }
}
