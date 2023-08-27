package org.example.compilador;

import org.junit.Assert;
import org.junit.Test;

public class AutomataTest {

    @Test
    public void horaMilitarTest(){

        Assert.assertFalse(Automata.esHoraMilitar("90:00000"));
        Assert.assertTrue(Automata.esHoraMilitar("00:00:00"));
        Assert.assertTrue(Automata.esHoraMilitar("12:08:30"));
        Assert.assertTrue(Automata.esHoraMilitar("12:08:59"));
        Assert.assertFalse(Automata.esHoraMilitar("12:08:60"));
    }
}
