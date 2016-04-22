package com.mitrakova.container;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class ArrayContainerTest {

    @Test (expected = Exception.class)
    public void ExceptionTest() throws ObjectArrayException {
        ArrayContainer<Integer> origin = new ArrayContainer<Integer>(null);
        origin.getElement(0);
    }
    @Test
    public void setElementTest() throws ObjectArrayException {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        ArrayContainer<Integer> origin = new ArrayContainer<Integer>(array);
        Integer[] expectedResult = {1, 10, 3, 4, 5};
        int index = 1;
        Integer element = 10;
        origin.setElement( index, element);
        assertArrayEquals(expectedResult, array);


    }

    @Test
    public void getElementTest() throws ObjectArrayException {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        ArrayContainer<Integer> origin = new ArrayContainer<Integer>(array);
        int index = 0;
        Object actResult = origin.getElement(index);
        Object expectedResult = 1;
        assertEquals(expectedResult, actResult);
    }

}