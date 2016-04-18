package com.mitrakova.mainclass;

import com.mitrakova.container.IObjectContainer;
import com.mitrakova.container.ArrayContainer;
import com.mitrakova.container.ObjectArrayException;
import com.mitrakova.reverser.Reverser;

/**
 * Entry point
 */

public final class MainClass {
    /**
     * Default constructor
     *
     */
    private MainClass() {
    }
    /**
     * main method
     * @param arg incoming arguments
     */
    public static void main(final String[] arg) {
        try {
            Reverser reverser = new Reverser();
            Integer[] integerArray = {1, 2, 3};
            IObjectContainer<Integer> array = new ArrayContainer<Integer>(integerArray);
            reverser.reverse(array);
        } catch (ObjectArrayException e) {
            e.printStackTrace();
        }
    }
}


