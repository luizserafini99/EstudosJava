package nivelFacil.Exercicios;


import java.util.Scanner;

public class testeDeAprendizado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o tipo de calculo");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int CalculoEscolhido = scanner.nextInt();

        System.out.println("Escolha uma opção de calculo: ");
        switch (CalculoEscolhido){
            case 1:
                System.out.println("Soma!");
                System.out.println("Agora informe o primeiro valor");
                int soma1 = scanner.nextInt();
                System.out.println("Agora informe o segundo valor");
                int soma2 = scanner.nextInt();
                System.out.println("A soma dos valores é: " + (soma1 + soma2));
                break;
            case 2:
                System.out.println("Subtração");
                System.out.println("Agora informe o primeiro valor");
                int sub1 = scanner.nextInt();
                System.out.println("Agora informe o segundo valor");
                int sub2 = scanner.nextInt();
                System.out.println("A subtração dos valores é: " + (sub1 - sub2));
                break;
            case 3:
                System.out.println("Multiplicação");
                System.out.println("Agora informe o primeiro valor");
                int mult1 = scanner.nextInt();
                System.out.println("Agora informe o segundo valor");
                int mult2 = scanner.nextInt();
                System.out.println("A multiplicação dos valores é: " + (mult1 * mult2));
                break;
            case 4:
                System.out.println("Divisão");
                System.out.println("Agora informe o primeiro valor");
                int divi1 = scanner.nextInt();
                System.out.println("Agora informe o segundo valor");
                int divi2 = scanner.nextInt();
                if(divi2 == 0){
                    System.out.println("Erro: Não é possível dividir por zero!");
                }else {
                    System.out.println("A divisão dos valores é: " + (divi1 / divi2));
                }
                 break;
            default:
                System.out.println("Você é burro ein! Escolha de 1 a 4!");
        }
        scanner.close();
    }
}
