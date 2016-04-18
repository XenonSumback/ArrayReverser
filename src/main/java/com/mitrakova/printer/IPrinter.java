package com.mitrakova.printer;

import com.mitrakova.container.IObjectContainer;

/**
 * C
 */

 interface IPrinter {

    <T> void print(IObjectContainer<T> container);
}
