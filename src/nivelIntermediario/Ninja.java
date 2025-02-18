package nivelIntermediario;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    // Criar um metodo publico personalizado
    // O metodo VOID não retorna valor nenhum!
    public void SharinganAtivado(){
        System.out.println("O Sharinga Ativou! Eu sou um Uchiha!");
    }
    //O metedo String vai ter que retornar uma string
    public String EuSouUmNinja(){
        return  "Oi eu sou um ninja!";
    }

    //Metodo Int vai ter que retornar um Int
    public int AnosParaSeTornarHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;

    }
}

