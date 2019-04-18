package com.company;

public class Main {

    public static void main(String[] args) {

        /**  initialize unsorted array with assigned elements **/
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        //  for printing only
        for (int num: intArray) {
            System.out.print(num + "  ");
        }
        System.out.print("\n");


    /**
     * ALGORITHM
     **/
        /**
         *      OUTER LOOP
         *          lastUnsortedIndex is initialized to last element's index
         *              this decrements on each iteration
         *              terminates loop when it equals 0
         **/
        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            /**
             *      largest is the marker for the largest element in the array.
             *
             *      INNER LOOP
             *          i always begins the loop at 1 then increments up to lastUnsortedIndex included
             *          if ( i > largest ) largest is reassigned the value of i
             **/
            int largest = 0;

            for(int i = 1; i <= lastUnsortedIndex; i++) {
                if(intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }

            /**
             *      swap()
             *          at this point largest is equal to the index of the largest element in the unsorted
             *          partition of the array
             *          swap() is called to swap the positions of largest and lastUnsortedIndex expanding
             *          the sorted position of the array by one element and decreasing the unsorted partition
             *          by one element
             **/
            swap(intArray, largest, lastUnsortedIndex);
        }
    /****/


        //  for printing only
        for (int num: intArray) {
            System.out.print(num + "  ");
        }
    }


    /**
     *     swap()
     *          called from main() within nested for loop
     *
     *          arguments:
     *              int array[]: the array which is being sorted
     *              int i: the position of the largest element in the unsorted partition
     *              int j: the last position of the unsorted array
     *
     *          return
     *              when the positions of the largest and lastUnsortedIndex are the same
     *
     *          initializes a temp variable to facilitate the swap
     **/
    public static void swap(int[] array, int i, int j) {
        if(i == j) { return; }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
