package atividade_01;

import java.util.Scanner;

public class exe_01 {
    public static void main(String[]args) {
        String login,senha,login1,senha1;
       
       try (Scanner leia = new Scanner(System.in)) {
        System.out.println("***Cadastrar Login***");
           System.out.println("\n");
           System.out.println("Informe o nome do novo login: ");
           login = leia.next();
           System.out.println("Informe a senha do novo login: ");
           senha = leia.next();
           System.out.println("\n");
           System.out.println("Login aprovado\n");
           System.out.println("***Validação de login***\n");
           System.out.println("Informe o login: ");
           login1 = leia.next();
           System.out.println("Informe a senha: ");
           senha1 = leia.next();
    }
       System.out.println("\n");
       if ( login.equals(login1) && senha.equals(senha1)) {
       System.out.println("Validação concluida\n");
       System.out.println("Bem vindo!");
       }else System.out.println("Login inválido...");
       }
       }
    

