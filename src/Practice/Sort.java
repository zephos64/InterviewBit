package Practice;

import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        int arrayLength = 5;
        int[] testArray = new int[arrayLength];
        Random rand = new Random();

        // Set random values in array
        for(int a = 0; a < testArray.length; a++) {
            testArray[a] = rand.nextInt(100);
        }

        System.out.print("Unsorted array: ");
        printArray(testArray);

        // Sort
        int[] sortedArray = quickSort(testArray);

        //See results
        System.out.print("Sorted array  : ");
        printArray(sortedArray);
    }

    public static void printArray(int[] array) {
        for(int a = 0; a < array.length; a++) {
            System.out.print(array[a] + " ");
        }
        System.out.println();
    }

    public static int[] deepCopyArray(int[] array) {
        int[] arrayCopy = new int[array.length];
        for(int a = 0; a < array.length; a++) {
            arrayCopy[a] = array[a];
        }
        return arrayCopy;
    }

    public static int[] quickSort(int[] toSort) {
        // https://www.geeksforgeeks.org/quick-sort/
        int[] sortedArray = deepCopyArray(toSort);
        quickSort(sortedArray, 0, sortedArray.length);

        return sortedArray;
    }

    private static void swap(int[] array, int a, int b) {
        //System.out.println("Swapping Ptrs " + a + " " +b);
        //System.out.println("~Values " + array[a] + " " + array[b]);

        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    private static void quickSort(int[] toSort, int low, int high) {
        //System.out.println("Quicksorting between " + low + " " + high);
        int key = high-1;
        int lowPtr = low;

        if(low >= high)
            return;

        for(int highPtr = lowPtr; highPtr <= high-1; highPtr++) {
            if(toSort[highPtr] < toSort[key]) {
                swap(toSort, lowPtr, highPtr);
                lowPtr++;
            }
        }
        //System.out.println("Swapping key");
        swap(toSort, lowPtr, key);

        //quicksort left side
        quickSort(toSort, low, lowPtr);
        //quicksort right side
        quickSort(toSort, lowPtr+1, high);
    }
}
