package com.mitrakova.container;


/**
 * generic container for arrays
 * @param <T> - type
 */
public class ArrayContainer<T> implements IObjectContainer<T> {

    private T[] array;

    /**
     * constructor
     * @param array - array
     * @throws ObjectArrayException - user exception
     */
    public ArrayContainer(final T[] array) throws ObjectArrayException {
        if (array == null) {
            throw new ObjectArrayException();
        }
        this.array = array;
    }


    /**
     * sets the value of the index
     * @param index - some index in array
     * @param element - value of index
     */
    public void setElement(final int index, final T element) {
        this.array[index] = element;
    }

    /**
     *
     * @param index - some index in array
     * @return value of index
     */
    public T getElement(final int index) {
        return this.array[index];
    }
}
