package com.platzi.javatests.player;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class PlayerTest {
    @Test
    public void looses_when_dice_number_is_too_loow (){

        Dice dice = Mockito.mock(Dice.class);

        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(dice,3);
        assertEquals(false,player.play());


    }

    @Test
    public void wins_when_dice_number_is_too_loow (){

        Dice dice = Mockito.mock(Dice.class);

        Mockito.when(dice.roll()).thenReturn(4);

        Player player = new Player(dice,3);
        assertTrue(player.play());


    }

}