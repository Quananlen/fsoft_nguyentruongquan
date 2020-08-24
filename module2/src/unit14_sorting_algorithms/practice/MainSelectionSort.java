package unit14_sorting_algorithms.practice;

import static unit14_sorting_algorithms.practice.SelectionSort.list;
import static unit14_sorting_algorithms.practice.SelectionSort.selectionSort;

public class MainSelectionSort  {
    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
