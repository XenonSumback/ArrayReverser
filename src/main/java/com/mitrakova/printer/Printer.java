package com.mitrakova.printer;

import com.mitrakova.container.IObjectContainer;

/**
 * print arrays
 * use ArrayContainer methods
 */
public class Printer implements IPrinter {
    /**
     *
     * @param array - object of IObjectContainer
     * @param length - length of array
     * @param <T> - type
     */
    public <T> void print(final IObjectContainer<T> array, final int length) {
        for (int i =  0; i  < length; i++) {
            System.out.print(array.getElement(i));
            System.out.print(' ');
        }
        System.out.print("\n");
    }
}
