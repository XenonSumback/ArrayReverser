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
     * @param <T> - type
     * @throws ReverserException -  user exception
     */

    public <T> void reverse(final IObjectContainer<T> array) throws ReverserException {

        try {
            for (int i = 0; i <  array.getSize() / 2; i++) {
                T tmp = array.getElement(i);
                array.setElement(i, array.getElement(array.getSize() - i - 1)) ;
                array.setElement(array.getSize() - i - 1, tmp);
            }
        } catch (Exception e) {
            throw new ReverserException(e);
        }
        }
    }
