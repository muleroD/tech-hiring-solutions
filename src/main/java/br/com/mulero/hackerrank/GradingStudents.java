package br.com.mulero.hackerrank;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * <a href="https://www.hackerrank.com/challenges/grading/problem">Grading Students</a>
 * <p>
 * Dado um array de notas, arredonde as notas de acordo com as regras:
 * <p>
 * - Se a diferença entre a nota e o próximo múltiplo de 5 for menor que 3, arredonde a nota para o próximo múltiplo de 5.
 * <p>
 * - Se a nota for menor que 38, não arredonde a nota.
 */
public class GradingStudents {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = gradingStudents(grades);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();

        for (Integer grade : grades) {
            if (grade < 38) roundedGrades.add(grade);
            else {
                for (int i = 0; i < 3; i++) {
                    int up = grade + i;
                    if (up % 5 == 0) {
                        roundedGrades.add(up);
                        break;
                    } else if (i == 2) {
                        roundedGrades.add(grade);
                    }
                }
            }
        }

        return roundedGrades;
    }
}
