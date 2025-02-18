package nivelFacil.Exercicios.ExMedio1;

public class Ninja {
    String nome;
    String missao;
    int idade;
    String StatusMissao;
    String NivelMissao;

    public void mostrarInfos(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Status: " + StatusMissao);
        System.out.println("Nivel da missão: "+ NivelMissao);
    }
}
