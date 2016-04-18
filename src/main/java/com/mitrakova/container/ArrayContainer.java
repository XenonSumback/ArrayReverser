package com.mitrakova.container;


public class ArrayContainer<T> implements IObjectContainer<T> {

    private T[] array;

    public ArrayContainer(final T[] array) throws ObjectArrayException {
        if (array == null) {
            throw new ObjectArrayException();
        }
        this.array = array;
    }

    public void setElement(int index, T element) {
        this.array[index] = element;
    }

    public T getElement(int index) {
        return this.array[index];
    }
}
