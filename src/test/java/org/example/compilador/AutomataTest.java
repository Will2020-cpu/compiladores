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

    @Test
    public void tiposDeDatosIntTest(){
        Assert.assertTrue(Automata.esTipoDeDato("int x=20;"));
        Assert.assertFalse(Automata.esTipoDeDato("int 1x=20"));
        Assert.assertTrue(Automata.esTipoDeDato("int _x=20;"));
        Assert.assertFalse(Automata.esTipoDeDato("int 3x=20a;"));
        Assert.assertTrue(Automata.esTipoDeDato("int x=20;"));

    }

    @Test
    public void tiposDeDatosLongTest(){
        Assert.assertTrue(Automata.esTipoDeDato("long x=20;"));
        Assert.assertFalse(Automata.esTipoDeDato("long 1xx=20"));
        Assert.assertTrue(Automata.esTipoDeDato("long _x=20;"));
        Assert.assertFalse(Automata.esTipoDeDato("long 3x=20a;"));
        Assert.assertTrue(Automata.esTipoDeDato("long x=20;"));
    }

    @Test
    public void tiposDeDatosShortTest(){
        Assert.assertTrue(Automata.esTipoDeDato("short x=20;"));
        Assert.assertFalse(Automata.esTipoDeDato("short 1xx=20"));
        Assert.assertTrue(Automata.esTipoDeDato("short _x=20;"));
        Assert.assertFalse(Automata.esTipoDeDato("short 3x=20a;"));
        Assert.assertTrue(Automata.esTipoDeDato("short x=20;"));
    }
}
