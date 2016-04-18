package com.mitrakova.container;

import java.io.Serializable;

/**
 *
 */
public interface IObjectContainer<T> {

    void setElement(int index, T element);

    T getElement(int index);
}
