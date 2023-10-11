package main.java.walker.tech.junit.test;

import java.util.Arrays;

public class Resultado {

    public boolean verificarGanhador(int[] numerosApostados, int[] numerosSorteados) {
        // Ordena os arrays para otimizar a comparação
        Arrays.sort(numerosApostados);
        Arrays.sort(numerosSorteados);

        // Implementação para verificar se há ganhadores
        int acertos = contarAcertos(numerosApostados, numerosSorteados);

        // Neste exemplo, consideramos que o jogador ganha se acertar pelo menos 4 números
        return acertos >= 4;
    }

    private int contarAcertos(int[] numerosApostados, int[] numerosSorteados) {
        int acertos = 0;
        int indexApostados = 0;
        int indexSorteados = 0;

        while (indexApostados < numerosApostados.length && indexSorteados < numerosSorteados.length) {
            int numeroApostado = numerosApostados[indexApostados];
            int numeroSorteado = numerosSorteados[indexSorteados];

            if (numeroApostado == numeroSorteado) {
                acertos++;
                indexApostados++;
                indexSorteados++;
            } else if (numeroApostado < numeroSorteado) {
                indexApostados++;
            } else {
                indexSorteados++;
            }
        }

        return acertos;
    }
}
