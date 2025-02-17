package Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        char numeroDeMissoes = 11;
        String nivel = (numeroDeMissoes >= 10) ? "Esse ninja tem nivel Chunnin" : "Esse ninja ainda é um Gennin";
        System.out.println(nivel);
    }
}
