package main.java.walker.tech.junit.test;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestSorteio {
    @Test
    public void testRealizarSorteio() {
        // Arrange
        Sorteio sorteio = new Sorteio();

        // Act
        int[] numerosSorteados = sorteio.realizarSorteio();

        // Assert
        // Verifica se foram sorteados a quantidade correta de números
        assertEquals("A quantidade de números sorteados deve ser 6.", 6, numerosSorteados.length);

        // Verifica se cada número está no intervalo correto (de 1 a 60)
        for (int numero : numerosSorteados) {
            assertTrue("O número sorteado deve estar entre 1 e 60.", numero >= 1 && numero <= 60);
        }

        // Verifica se os números sorteados estão em ordem crescente
        assertTrue("Os números sorteados devem estar em ordem crescente.",
                isSorted(numerosSorteados));
    }

    // Método auxiliar para verificar se um array está ordenado
    private boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }
}
