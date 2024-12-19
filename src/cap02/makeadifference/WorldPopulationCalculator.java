package cap02.makeadifference;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WorldPopulationCalculator {
    public static void main(String[] args) {

        final long POPULACAO_MUNDIAL_2024 = 8200000000L;

        final double TAXA_CRESCIMENTO = 0.009;

        long populacaoAtual = POPULACAO_MUNDIAL_2024;

        for (int i = 0; i<5; i++){
            populacaoAtual += (long)(POPULACAO_MUNDIAL_2024 * TAXA_CRESCIMENTO);
            System.out.printf("População estimada para %d: %d%n", 2024 + i, populacaoAtual);
        }
    }
}
