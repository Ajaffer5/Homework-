public class GenericSorting {
    
    // Bubble Sort Generic Method
    public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Stop if the array is already sorted
        }
    }

    // Merge Sort Generic Method
    public static <T extends Comparable<T>> void mergeSort(T[] array) {
        if (array.length < 2) return; // Base case for recursion
        
        int mid = array.length / 2;
        T[] left = (T[]) new Comparable[mid];
        T[] right = (T[]) new Comparable[array.length - mid];
        
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);
        
        mergeSort(left);
        mergeSort(right);
        
        merge(array, left, right);
    }
    
    private static <T extends Comparable<T>> void merge(T[] result, T[] left, T[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
    }
    
    // Main Method to Test the Sorts
    public static void main(String[] args) {
        Integer[] intArray = {5, 1, 4, 2, 8};
        String[] stringArray = {"Eve", "Alice", "Bob", "Charlie", "Dave"};
        
        System.out.println("Original Integer Array: ");
        printArray(intArray);
        bubbleSort(intArray);
        System.out.println("Sorted by Bubble Sort: ");
        printArray(intArray);
        
        System.out.println("\nOriginal String Array: ");
        printArray(stringArray);
        mergeSort(stringArray);
        System.out.println("Sorted by Merge Sort: ");
        printArray(stringArray);
    }
    
    // Utility Method to Print Arrays
    private static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

