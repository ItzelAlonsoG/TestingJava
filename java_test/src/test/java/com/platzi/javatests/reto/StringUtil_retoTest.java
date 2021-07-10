package com.platzi.javatests.reto;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtil_retoTest {

    @Test
    public void string_is_empty(){
        assertTrue(StringUtil_reto.isEmpty(""));
    }

    @Test
    public void string_Null_is_Empty(){
        assertTrue(StringUtil_reto.isNull(null));
    }

    @Test
    public void string_with_spaces_is_Empty(){
        assertTrue(StringUtil_reto.isEmpty(" hola "));
    }

}