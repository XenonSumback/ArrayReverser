package com.mitrakova.reverser;

/**
 * user Exception for interface IReverser
 */
public class ReverserException extends Exception {

    public ReverserException(Exception e) {
        initCause(e);
    }
}
