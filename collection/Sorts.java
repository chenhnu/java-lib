package pt.collection;

public class Sorts {
    private static int partition(int[] arr, int s, int e) {
        int temp=arr[s];
        while (s<e){
            while (s<e&&arr[e]>temp){
                e--;
            }
            arr[s]=arr[e];
            while (s<e&&arr[s]<=temp){
                s++;
            }
            arr[e]=arr[s];
        }
        arr[s]=temp;
        return s;
    }

    private static void quickSort(int[] arr, int s, int e) {
        if(s<e){
            int base = partition(arr, s, e);
            quickSort(arr,s,base-1);
            quickSort(arr,base+1,e);
        }
    }
    public static void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }
}
