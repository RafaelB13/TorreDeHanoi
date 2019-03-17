package questao05;

import pilha.Pilha;
import java.util.Scanner;

public class questao05 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Pilha<Integer> p = new Pilha<>(3);
        Pilha<Integer> p2 = new Pilha<>(10);
        
        int numero = 0;

        while (p.estaCheia() != true) {
            System.out.print("Insira o numero da placa do carro entrando : ");
            int placa = scn.nextInt();
            p.inserir(placa);
            System.out.println("Entrando carro " + placa);
        }
        System.out.println("Estacionamento Cheio");
        Integer op = 0;
        while ((p.estaVazia() != true) && op != 2) {
            numero = 0;
            System.out.print("Insira o numero da placa do carro a ser  : ");
            int saida = scn.nextInt();

            Integer placa = p.remover();
            while (placa != saida) {
                p2.inserir(placa);
                System.out.println("saindo carro " + placa);

                placa = p.remover();
                numero++;
            }
            System.out.println("carro encontrado e retirado");
            System.out.println(placa);

            for (int i = 0; i < numero; i++) {

                placa = p2.remover();
                p.inserir(placa);
                System.out.println("entrando carro " + placa);
            }
            if (p.estaVazia() != true) {
                System.out.println("deseja retirar mais algum veículo digite 1 (sim) e 2 (não)");
                int escolha = scn.nextInt();
                op = escolha;
            }
        }
        if (op == 2) {
            System.out.println("encerrado");
            System.out.close();
        } else {
            System.out.println("estacionamento vazio");
        }
    }

}
