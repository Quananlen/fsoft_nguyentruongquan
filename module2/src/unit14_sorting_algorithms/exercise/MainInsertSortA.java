package unit14_sorting_algorithms.exercise;


import static unit14_sorting_algorithms.exercise.InsertSortA.insertionSort;

public class MainInsertSortA {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(insertionSort(list));
    }
}
