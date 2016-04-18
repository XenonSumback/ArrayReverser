package com.mitrakova.reverser;

/**
 * Class for reversing arrays
 */

public class Reverser implements IReverser {

    /**
     * default constructor
     */

    public Reverser() {
    }

    /**
     *
     * @param arr - array
     * @param <T> - type of array
     * @return arr - reversed array
     */

    public <T> T[] reverse(final T[] arr) {

            for (int i = 0; i < arr.length / 2; i++) {
            T tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
        return arr;
    }
}