package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o número de um personagem: ");
        System.out.println("1 - Naruto Uzumaki ");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");
        int ninjaEscolhido = scanner.nextInt();
        System.out.println("Escolha de número: " + ninjaEscolhido);
        switch (ninjaEscolhido){
            case 1:
                System.out.println("Naruto Uzumaki: Alta quantidade de chakara!");
                break;
            case 2:
                System.out.println("Sasuke Uchiha: O prodigio!");
                break;
            case 3:
                System.out.println("Sakura Haruno: The big testa of Konoha!");
                break;
            default:
                System.out.println("Você é burro ein! Escolha de 1 a 3!");
        }



        scanner.close();
    }
}
