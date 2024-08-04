package br.com.mulero.hackerrank.debugging;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <a href="https://www.hackerrank.com/challenges/zig-zag-sequence/problem">ZigZag Sequence</a>
 * <p>
 * Dado um array de inteiros, retorne o tamanho da sequência zig-zag mais longa que pode ser formada a partir do array.
 * Uma sequência zig-zag é uma sequência de números onde cada número é menor ou maior que seus vizinhos imediatos.
 * <p>
 * A proposta desse desafio é debbugar o código e corrigir o erro.
 * <p>
 * Nota: Você pode modificar três linhas no código. Não pode adicionar ou remover linhas.
 */
public class ZigZagSequence {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int test_cases = kb.nextInt();
        for (int cs = 1; cs <= test_cases; cs++) {
            int n = kb.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = kb.nextInt();
            }
            findZigZagSequence(a, n);
        }
    }

    // input  = 2 3 5 1 4
    // output = 1 4 5 3 2
    public static void findZigZagSequence(int[] a, int n) {
        Arrays.sort(a);
        int mid = (n + 1) / 2;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid + 1;
        int ed = n - 1;
        while (st <= ed) {
            temp = a[st];
            a[st] = a[ed - 1];
            a[ed] = temp;
            st = (st + 1) / 2;
            ed = ed - 1;
        }
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
