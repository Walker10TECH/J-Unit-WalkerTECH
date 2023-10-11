package main.java.walker.tech.junit.test;

import java.util.HashSet;
import java.util.Set;

public class presorteiomegasena {
    private static final int MIN_NUM = 1;
    private static final int MAX_NUM = 60;
    private static final int MAX_APOSTAS = 6;

    public boolean validarApostas(int[] numeros){
        //VERIFICAR SE A QUANTIDADE DE NUMEROS ESTÁ CORRETA//
        if (numeros.length != MAX_APOSTAS){
            return false;
        }
        //VERIFICAR SE OS NUMEROS ESTÃO DENTRO DO INTERVALO CORRETO//
        for (int numero : numeros){
            if(numero < MIN_NUM || numero > MAX_NUM){
                return false;

            }
        }
        //VERIFICAR SE NÃO HÁ NUMEROS REPETIDOS//
        if (temnumerosRepetidos(numeros)){
            return false;
        }
        return true;
    }
    private boolean temnumerosRepetidos(int[] numeros){
        Set<Integer> conjuntoNumeros = new HashSet<>();
        for(int numero : numeros){
            if (!conjuntoNumeros.add(numero)){
            //SE NÃO FOR POSSIVEL ADICIONAR O NUMERO AO CONJUNTO, SIGNIFICA QUE ELE JA EXISTE//
            return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //PRÉ SORTEIO//
        presorteiomegasena preSorteio = new presorteiomegasena();
        int[] apostasValidas = {5, 12, 25, 30, 42, 55};
        int[] apostasInvalidas = {5, 12, 25, 30, 42, 5};
        System.out.println("APOSTAS VÁLIDAS:" + preSorteio.validarApostas(apostasValidas));
        System.out.println("APOSTAS VÁLIDAS:" + preSorteio.validarApostas(apostasInvalidas));
    }
}
