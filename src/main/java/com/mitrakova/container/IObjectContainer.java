package com.mitrakova.container;


/**
 *abstract generic container
 * @param <T> - type
 */

public interface IObjectContainer<T> {
    /**
     *
     * @param index - index
     * @param element - value
     */
     void setElement(int index, T element);

    /**
     *
     * @param index - index
     * @return element with entry index
     */
     T getElement(int index);

    int getSize();
}
