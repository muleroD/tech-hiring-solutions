package br.com.mulero.grokking.algorithms;

import java.util.ArrayList;

public class SelectionSort {

    public static void main(String[] args) {
        ArrayList<Artist> list = new ArrayList<>();

        list.add(new Artist("RADIOHEAD", 156));
        list.add(new Artist("KISHORE KUMAR", 141));
        list.add(new Artist("THE BLACK KEYS", 35));
        list.add(new Artist("NEUTRAL MILK HOTEL", 94));
        list.add(new Artist("BECK", 88));
        list.add(new Artist("THE STROKES", 61));
        list.add(new Artist("WILCO", 111));

        ArrayList<Artist> sorted = selectionSort(list);
        System.out.println(sorted);
    }

    private static ArrayList<Artist> selectionSort(ArrayList<Artist> list) {
        ArrayList<Artist> sorted = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int highestIdx = searchHighest(list);
            sorted.add(list.remove(highestIdx));
        }

        return sorted;
    }

    private static int searchHighest(ArrayList<Artist> list) {
        int highIdx = 0;
        int highValue = list.get(0).reproduction;

        for (int i = 0; i < list.size(); i++) {
            int reproduction = list.get(i).reproduction;

            if (highValue < reproduction) {
                highValue = reproduction;
                highIdx = i;
            }
        }

        return highIdx;
    }

    private static class Artist {
        private final String name;
        private final int reproduction;

        public Artist(String name, int reproduction) {
            this.name = name;
            this.reproduction = reproduction;
        }

        @Override
        public String toString() {
            return "Artist{" +
                    "name='" + name + '\'' +
                    ", reproduction=" + reproduction +
                    '}';
        }
    }
}
