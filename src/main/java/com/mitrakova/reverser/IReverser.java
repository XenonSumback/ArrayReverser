package com.mitrakova.reverser;

import com.mitrakova.container.IObjectContainer;
/**
 * Created by wolf on 03.04.16.
 *
 */

 interface IReverser {
    /**
     *
     * @param array - array
     * @param <T> - type of array
     * @throws ReverserException -  user exception
     */
    <T> void reverse(IObjectContainer<T> array) throws ReverserException;
}
