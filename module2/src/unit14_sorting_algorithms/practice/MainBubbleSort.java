package unit14_sorting_algorithms.practice;

import static unit14_sorting_algorithms.practice.BubbleSort.bubbleSort;
import static unit14_sorting_algorithms.practice.BubbleSort.list;

public class MainBubbleSort {
    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
};
