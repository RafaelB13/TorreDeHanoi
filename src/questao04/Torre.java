package questao04;

import pilha.Pilha;
import java.util.Scanner;

public class Torre {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        Pilha<Integer> o = new Pilha<>();
        Pilha<Integer> d = new Pilha<>();
        Pilha<Integer> a = new Pilha<>();

        o.inserir(3);
        o.inserir(2);
        o.inserir(1);

        int opcao = 9;

        System.out.println("A torre foi iniciada com 3 blocos \n"
                + "Insira em qual Pilha deseja retirar deseja retirar: \n"
                + "Pilha Original\n"
                + "Pilha Destino\n"
                + "PIlha Auxiliar\n");
        System.out.println("####################################");

        System.out.println("Origina:  " + o.toString());
        System.out.println("Destino:  " + d.toString());
        System.out.println("Auxiliar: " + a.toString());

        int jogadas = 1;

        while (opcao != 0) {

            System.out.println("");
            System.out.println("Remover de Original e colocar em Destino  = 1");
            System.out.println("Remover de Original e colocar em Auxiliar = 2");
            System.out.println("Remover de Destino e colocar em Auxiliar  = 3");
            System.out.println("Remover de Destino e coloar em Original   = 4");
            System.out.println("Remover de Auxiliar e colocar em Original = 5");
            System.out.println("Remover de Auxiliar e Cologar em Destino  = 6");
            System.out.println("Para encerrar o jogo = 0\n");
            System.out.print("OPÇÃO: ");
            opcao = scn.nextInt();

            switch (opcao) {
                case 1:
                    int originalDestino = o.remover();
                    d.inserir(originalDestino);
                    break;
                case 2:
                    int originalAuxiliar = o.remover();
                    a.inserir(originalAuxiliar);
                    break;
                case 3:
                    int destinoAuxiliar = d.remover();
                    a.inserir(destinoAuxiliar);
                    break;
                case 4:
                    int destinoOriginal = d.remover();
                    o.inserir(destinoOriginal);
                case 5:
                    int auxiliarOriginal = a.remover();
                    o.inserir(auxiliarOriginal);
                case 6:
                    int auxiliarDestino = a.remover();
                    d.inserir(auxiliarDestino);

            }

            System.out.println("\n\nOrigina:  " + o);
            System.out.println("Destino:  " + d);
            System.out.println("Auxiliar: " + a);
            System.out.println("\nNumero de movimentos: " + jogadas++);
        }
    }

}
