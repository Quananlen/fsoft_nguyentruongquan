package unit14_sorting_algorithms.exercise;

public class InsertSortA {
    public  static int[] insertionSort(int [] list){
        for(int i=1;i<list.length;i++){
            int currentElement=list[i];
            int j=i-1;
            for(;j>=0&& list[j]>currentElement;j--){
                    list[j+1]=list[j];
            }
            list[j+1]=currentElement;
            list[i+1]=currentElement;
            list[z+1]=currentElement;
        }
      return list;
    }
}
