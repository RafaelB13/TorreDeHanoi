package questao01;

import pilha.Pilha;

public class Q1_g {

    public static void main(String[] args) {
        Pilha<Integer> p = new Pilha<>(10);
        Pilha<Integer> p2 = new Pilha<>(10);
        Integer numero = 0;
        int i = 100;

        while (p.inserir(numero)) {
            System.out.println("Inserido " + numero + "\n");
            numero++;
        }

        System.out.println("-------------------------");
        numero = p.remover();
        for (int j = 0; j < 3; j++) {
            p2.inserir(numero);
            System.out.println("Removendo de p1/Inserido em p2 " + numero + "\n");

            numero = p.remover();
        }

        p.remover();
        System.out.println("removendo sem guardar" + numero);

        p.inserir(i);
        System.out.println("inserindo numero i");

        for (int j = 0; j < 3; j++) {

            numero = p2.remover();
            p.inserir(numero);
            System.out.println("Removendo de p2/Inserido em p1 " + numero + "\n");

        }
    }
}
