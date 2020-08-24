package unit13_searching_algorithms.practice;

public class BinarySearch {
       static int[] list={2,4,6,8,10,14,17,20,26,30,35,40};
       static int binarySearch(int [] list,int key){
           int low =0;
           int hight =list.length-1;
           while (hight>=low){
               int mid=(hight+low)/2;
               if(key<list[mid]){
                   hight=mid-1;
               }else if(key==list[mid]){
                   return mid;
               }else
                   low=mid+1;
           }
           return -1;
       }
}
