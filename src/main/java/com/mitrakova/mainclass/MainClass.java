package com.mitrakova.mainclass;

import com.mitrakova.container.IObjectContainer;
import com.mitrakova.container.ArrayContainer;
import com.mitrakova.container.ObjectArrayException;
import com.mitrakova.printer.IPrinter;
import com.mitrakova.printer.Printer;
import com.mitrakova.reverser.Reverser;
import com.mitrakova.reverser.ReverserException;

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
            Integer[] integerArray = {1, 2};
            int length = integerArray.length;
            IPrinter printer = new Printer();
            IObjectContainer<Integer> array = new ArrayContainer<Integer>(integerArray);
            printer.print(array, length);
            reverser.reverse(array);
            printer.print(array, length);
        } catch (ObjectArrayException e) {
            e.printStackTrace();
        } catch (ReverserException e) {
            e.printStackTrace();
        }
    }
}



