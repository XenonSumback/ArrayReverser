package com.mitrakova.reverser;

import com.mitrakova.container.ArrayContainer;
import com.mitrakova.container.IObjectContainer;
import com.mitrakova.container.ObjectArrayException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;


public class ReverserTest {
    private Reverser reverser;

    @Before
    public void setUp(){
        this.reverser= new Reverser();
        }

    @Test
    public void TestReverseIntegerArr() throws ObjectArrayException, ReverserException {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        Integer[] expectedResult = {5, 4, 3, 2, 1};
        int len = array.length;
        IObjectContainer<Integer> origin = new ArrayContainer<Integer>(array);
        this.reverser.reverse( origin, len);
        assertArrayEquals(expectedResult, array);
    }
    @Test
    public void TestReverseStringArr() throws ObjectArrayException, ReverserException {
        String[] array = new String[]{"h", "e" , "l", "l", "o"};
        String[] expectedResult = {"o", "l", "l", "e", "h"};
        int len = array.length;
        IObjectContainer<String> origin = new ArrayContainer<String>(array);
        this.reverser.reverse( origin, len);
        assertArrayEquals(expectedResult, array);
    }
    @Test
    public void TestReverseDoubleArr() throws ObjectArrayException, ReverserException {
        Double[] array = new Double[]{1.1, 2.2, 3.3};
        Double[] expectedResult = {3.3, 2.2, 1.1};
        int len = array.length;
        IObjectContainer<Double> origin = new ArrayContainer<Double>(array);
        this.reverser.reverse(origin, len);
        assertArrayEquals(expectedResult, array);
    }
    @Test(expected = ReverserException.class)
    public void TestReverseException() throws ObjectArrayException, ReverserException {
        String[] array = new String[]{"h", "e" , "l", "l", "o"};
        String[] expectedResult = {"o", "l", "l", "e", "h"};
        int len = 10;
        IObjectContainer<String> origin = new ArrayContainer<String>(array);
        this.reverser.reverse( origin, len);
        fail();
    }
}
