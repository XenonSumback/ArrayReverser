package com.mitrakova.reverser;

import com.mitrakova.container.IObjectContainer;

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
     * @param array - array
     * @param length - length of array
     * @param <T> - type
     * @throws ReverserException -  user exception
     */

    public <T> void reverse(final IObjectContainer<T> array, final int length) throws ReverserException {

        try {
            for (int i = 0; i <  length / 2; i++) {
                T tmp = array.getElement(i);
                array.setElement(i, array.getElement(length - i - 1)) ;
                array.setElement(length - i - 1, tmp);
            }
        } catch (NullPointerException e) {
            throw new ReverserException();
        }
        }
    }
