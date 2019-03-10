package estruturadedados.testes;

import estruturadedados.pilha.Pilha;
import java.util.Scanner;
import java.util.Stack;


public class Teste2 {
    
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        Stack o = new Stack();
        Stack d = new Stack();
        Stack a = new Stack();

        o.push(3);
        o.push(2);
        o.push(1);

        int opcao = 9;

        System.out.println("A torre foi iniciada com 3 blocos \n"
                + "Insira em qual Pilha deseja retirar deseja retirar: \n"
                + "Pilha Original\n"
                + "Pilha Destino\n"
                + "PIlha Auxiliar\n");
        System.out.println("####################################");

        System.out.println(o.toString());
        System.out.println(d.toString());
        System.out.println(a.toString());

        while (opcao != 0) {

            System.out.println("");
            System.out.println("Remover de Original e colocar em Destino  = 1");
            System.out.println("Remover de Original e colocar em Auxiliar = 2");
            System.out.println("Remover de Destino e colocar em Auxiliar  = 3");
            System.out.println("Remover de Destino e coloar em Original   = 4");
            System.out.println("Remover de Auxiliar e colocar em Original = 5");
            System.out.println("Remover de Auxiliar e Cologar em Destino  = 6\n");
            System.out.print("OPÇÃO: ");
            opcao = scn.nextInt();

            switch (opcao) {
                case 1:
                    int originalDestino = (int) o.pop();
                    d.push(originalDestino);
                    break;
                case 2:
                    int originalAuxiliar = (int) o.pop();
                    a.push(originalAuxiliar);
                    break;
                case 3:
                    int destinoAuxiliar = (int) d.pop();
                    a.push(destinoAuxiliar);
                    break;
                case 4:
                    int destinoOriginal = (int) d.pop();
                    o.push(destinoOriginal);
                case 5:
                    int auxiliarOriginal = (int) a.pop();
                    o.push(auxiliarOriginal);
                case 6:
                    int auxiliarDestino = (int) a.pop();
                    d.push(auxiliarDestino);

            }

            System.out.println(o.toString());
            System.out.println(d.toString());
            System.out.println(a.toString());
        }
    }

}
