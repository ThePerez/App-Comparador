package com.example.app.practica.alex_app_compare;

import static org.junit.Assert.assertEquals;

import com.example.app.practica.alex_app_compare.MainActivity;

import org.junit.Before;
import org.junit.Test;

public class MainActivityTest {

    private MainActivity mainActivity;

    @Before
    public void setUp() {
        mainActivity = new MainActivity();
    }

    @Test
    public void testCompareNumbersFirstNumberGreater() {
        String result = mainActivity.compareNumbers(5, 3);
        assertEquals("El primer número es mayor.", result);
    }

    @Test
    public void testCompareNumbersSecondNumberGreater() {
        String result = mainActivity.compareNumbers(2, 8);
        assertEquals("El segundo número es mayor.", result);
    }
}
