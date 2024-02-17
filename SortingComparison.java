public class SortingComparison {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        int[] mergeSortArray = array.clone();
        int[] bubbleSortArray = array.clone();

        long startTime = System.nanoTime();
        MergeSort.sort(mergeSortArray, 0, mergeSortArray.length - 1);
        long endTime = System.nanoTime();
        System.out.println("Merge Sort Execution Time: " + (endTime - startTime) + " nanoseconds");

        startTime = System.nanoTime();
        BubbleSort.sort(bubbleSortArray);
        endTime = System.nanoTime();
        System.out.println("Bubble Sort Execution Time: " + (endTime - startTime) + " nanoseconds");
    }
}
