package com.bridgelabz;

/**
 * MergeSort Program
 */

public class MergeSortProgram {

    /**
     * Creating mergeSort method to perform merge sorting
     * @param array - array of elements
     * @param lo  - lower point
     * @param mid - middle point
     * @param hi  - higher point
     */

    void mergeSort(String[] array, int lo, int mid, int hi) {
        /**
         * Find sizes of two sub arrays to be merged
         */
        int n1 = mid - lo + 1;
        int n2 = hi - mid;

        /**
         * Creating temp arrays
         */
        String left[] = new String[n1];
        String right[] = new String[n2];

        /**
         * Copying data to temp arrays
         */
        for (int i = 0; i < n1; ++i)
            left[i] = array[lo + i];
        for (int j = 0; j < n2; ++j)
            right[j] = array[mid + 1 + j];

        /**
         * Merging the temp arrays
         */

        /**
         * Initial indexes of first and second subarrays
         */
        int i = 0, j = 0;

        /**
         * Initial index of merged sub array
         */
        int k = lo;
        while (i < n1 && j < n2) {
            if (left[i].compareTo( right[j]) <=0) {
                array[k] = String.valueOf(left[i]);
                i++;
            } else {
                array[k] = String.valueOf(right[j]);
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    /**
     * @param arr - array of elements
     * @param lo - lower point
     * @param hi - higher point
     */
    void sort(String[] arr, int lo, int hi) {
        if (lo < hi) {
            /**
             * Find the middle point
             */
            int mid = (lo + hi) / 2;

            /**
             * Sort first and second halves
             */
            sort(arr, lo, mid);
            sort(arr, mid + 1, hi);

            /**
             * Merge the sorted halves
             */
            mergeSort(arr, lo, mid, hi);
        }
    }

    /**
     * A utility function to print array of size n
     * @param arr - taking an array of string elements
     */
    static void printArray(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    /**
     * Main method from where the execution starts
     * @param args - default java param
     */
    public static void main(String args[]) {
        /**
         * 1.Initializing an array
         * 2.Printing the given array
         * 3.Creating a MergeSortProgram object and calling the sort method
         * 4.Printing the sorted array
         */

        /**
         * 1.Initializing an array
         */
        String array[] = {"stem", "branch", "tree", "leaf", "fruit", "roots"};
        /**
         * 2.Printing the given array
         */
        System.out.println("Given Array: ");
        printArray(array);
        /**
         * 3.Creating a MergeSortProgram object and calling the sort method
         */
        MergeSortProgram mergeSortProgram = new MergeSortProgram();
        mergeSortProgram.sort(array, 0, array.length - 1);
        /**
         * 4.Printing the sorted array
         */
        System.out.println("\nSorted Array: ");
        printArray(array);
    }
}

