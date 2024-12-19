package cap02.makeadifference;

import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu Peso: ");
        double peso = input.nextDouble();

        System.out.print("Digite a sua Altura ");
        double altura = input.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        System.out.println("BMI VALUES");

        if (imc < 18.5)
            System.out.printf("UnderWeight: %.2f", imc);
        else if (imc >= 18.5 && imc <= 24.9)
            System.out.printf("Normal: %.2f", imc);
        else if (imc >= 25 && imc <= 29.9)
            System.out.printf("Overweight: %.2f", imc);
        else
            System.out.printf("Obese: %.2f", imc);

    }
}
