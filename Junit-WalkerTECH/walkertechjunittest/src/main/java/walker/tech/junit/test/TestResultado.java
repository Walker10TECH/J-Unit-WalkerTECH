import static org.junit.Assert.*;
import org.junit.Test;

public class TestResultado {

    @Test
    public void testVerificarGanhador() {
        // Caso em que todos os números coincidem
        int[] numerosApostados = {1, 2, 3, 4, 5, 6};
        int[] numerosSorteados = {1, 2, 3, 4, 5, 6};
        assertTrue(Resultado.verificarGanhador(numerosApostados, numerosSorteados));

        // Caso em que nenhum número coincide
        int[] numerosApostados2 = {7, 8, 9, 10, 11, 12};
        assertFalse(Resultado.verificarGanhador(numerosApostados2, numerosSorteados));

        // Caso em que apenas 3 números coincidem (abaixo do limite)
        int[] numerosApostados3 = {1, 2, 3, 7, 8, 9};
        assertFalse(Resultado.verificarGanhador(numerosApostados3, numerosSorteados));

        // Caso em que 4 números coincidem (atingindo o limite)
        int[] numerosApostados4 = {1, 2, 3, 4, 13, 14};
        assertTrue(Resultado.verificarGanhador(numerosApostados4, numerosSorteados));

        // Caso em que mais de 4 números coincidem (acima do limite)
        int[] numerosApostados5 = {1, 2, 3, 4, 5, 6, 7};
        assertTrue(Resultado.verificarGanhador(numerosApostados5, numerosSorteados));
    }
}
