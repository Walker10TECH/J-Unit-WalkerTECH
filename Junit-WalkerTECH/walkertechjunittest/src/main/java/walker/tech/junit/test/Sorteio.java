package main.java.walker.tech.junit.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Sorteio {
    private static final int QUANTIDADE_NUMEROS_SORTEIO = 6;
    private static final int LIMITE_SUPERIOR = 60;

    public int[] realizarSorteio() {
        int[] numerosSorteados = new int[QUANTIDADE_NUMEROS_SORTEIO];
        Random random = new Random();

        Set<Integer> numerosSorteadosSet = new HashSet<>(); // Usado para garantir números únicos

        for (int i = 0; i < QUANTIDADE_NUMEROS_SORTEIO; i++) {
            int numeroSorteado;
            do {
                numeroSorteado = random.nextInt(LIMITE_SUPERIOR) + 1;
            } while (!numerosSorteadosSet.add(numeroSorteado)); // Repete se o número já foi sorteado

            numerosSorteados[i] = numeroSorteado;
        }

        Arrays.sort(numerosSorteados);
        return numerosSorteados;
    }
}
