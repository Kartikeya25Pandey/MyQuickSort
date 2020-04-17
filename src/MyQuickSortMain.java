public class MyQuickSortMain {
    public static void main(String[] args) {
        int arr[]={20,4,56,7,89,32,45};
        MyQuickSort.quicksort(arr,0,arr.length-1);
        MyQuickSort.display(arr);
    }
}
