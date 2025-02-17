package Arrays;


import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
    //Arrays são tipos referencia!!

    //Array String inicializa como null(vazio)
        String[] ninja = new String[4];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        System.out.println(ninja[4]);

    //Array int inicializa como 0
        int[] idade = new int[2];
        System.out.println(idade[0]);

    //Array boolean inicializa como false
        boolean[] verdadeiroOuFalso = new boolean[2];
        System.out.println(verdadeiroOuFalso[0]);

    }
}
