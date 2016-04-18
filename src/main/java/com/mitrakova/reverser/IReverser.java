package com.mitrakova.reverser;

import com.mitrakova.container.IObjectContainer;
/**
 * Created by wolf on 03.04.16.
 *
 */

 interface IReverser {

    /**
     *
     * @param arr - array
     * @param <T> - type
     * @return -array of T
     */
    <T> void reverse(IObjectContainer<T> array);
}
