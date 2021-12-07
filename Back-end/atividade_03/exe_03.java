package atividade_03;

import java.util.Scanner;

public class exe_03 {
    public static void main(String[]args) {
        int num, calc;
        try (Scanner leia = new Scanner(System.in)) {
            System.out.println("Informe o numero para a tabuada:");
            num = leia.nextInt();
        }
        System.out.printf("\n*-RESULTADO---*\n");
        for (calc=1; calc<=10; calc++) {
        System.out.printf("| %2d * %d = %2d |\n", calc, num, (calc*num));
        }
        System.out.printf("***---------***\n");
        }
}
