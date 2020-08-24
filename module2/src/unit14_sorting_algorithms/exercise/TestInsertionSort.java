package unit14_sorting_algorithms.exercise;

import java.util.ArrayList;

import static unit14_sorting_algorithms.exercise.InsertionSort.insertionSort;

public class TestInsertionSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(10);
        arr.add(1);
        arr.add(5);
        arr.add(6);
        System.out.println(arr);
        insertionSort(arr);
    }
}
