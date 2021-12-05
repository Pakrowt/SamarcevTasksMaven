package by.samarcev;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void areaRectangle() {
        int summ = Rectangle.areaRectangle(3, 5);
        int expected = 15;
        assertEquals(expected,summ);
    }
}