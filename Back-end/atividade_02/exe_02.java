package atividade_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exe_02 {
    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)) {
            double peso, altu, calc;
            DecimalFormat deci = new DecimalFormat("0.0");
            System.out.println("***Calculadora de IMC***");
            System.out.println("\n");
            System.out.println("Informe sua idade");
            leia.nextDouble();
            System.out.println("informe a altura: ");
            altu = leia.nextDouble();
            System.out.println("Informe o peso em kilos: ");
            peso = leia.nextDouble();
            calc = peso / (altu * altu);
            System.out.println("\n");
            if (calc < 18.5) {
            System.out.println("Resultado: " + deci.format(calc));
             System.out.println("\n");
            System.out.println("Magreza");
            } else if (calc >= 18.5 && calc <= 24.9) {
            System.out.println("Resultado: " + deci.format(calc));
            System.out.println("\n");
            System.out.println("Normal");
            } else if (calc > 24.9 && calc <= 30) {
            System.out.println("Resultado: " + deci.format(calc));
            System.out.println("\n");
            System.out.println("Sobrepeso");
            } else if (calc > 30) {
            System.out.println("Resultado: " + deci.format(calc));
            System.out.println("\n");
            System.out.println("Obesidade");
            }
        }
        }
        }
    

