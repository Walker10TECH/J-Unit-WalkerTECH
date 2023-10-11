package main.java.walker.tech.junit.test;

import static org.junit.Assert.*;
import org.junit.Test;

public class testpresorteio {
    @Test
    public void testValidarApostas() {
        PreSorteio preSorteio = new PreSorteio();
        
        int[] numerosValidos = {1, 2, 3, 4, 5, 6};
        assertTrue(preSorteio.validarApostas(numerosValidos));

        int[] numerosInvalidos = {1, 2, 3, 4, 5, 5}; // Número repetido
        assertFalse(preSorteio.validarApostas(numerosInvalidos));

        int[] numerosForaDoIntervalo = {0, 2, 3, 4, 5, 6}; // Número abaixo do limite
        assertFalse(preSorteio.validarApostas(numerosForaDoIntervalo));

        int[] numerosApostasIncompletas = {1, 2, 3, 4, 5}; // Apostas incompletas
        assertFalse(preSorteio.validarApostas(numerosApostasIncompletas));

        int[] numerosApostasExtras = {1, 2, 3, 4, 5, 6, 7}; // Apostas extras
        assertFalse(preSorteio.validarApostas(numerosApostasExtras));
    }
}
