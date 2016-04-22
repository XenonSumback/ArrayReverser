package com.mitrakova.printer;

import com.mitrakova.container.IObjectContainer;

/**
 * Prints from container
 */

 public interface IPrinter {
    /**
     *
     * @param array - array
     * @param <T> - type
     * @param length - length of array
     */

    <T> void print(IObjectContainer<T> array, int length);
}
