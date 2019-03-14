package questao01;

import estruturadedados.pilha.Pilha;

public class LetraC {

    public static void main(String[] args) {

        Pilha<Integer> p = new Pilha<>();

        int numero = 0;
        int n = 4;

        for (int i = 0; i < 10; i++) {
            p.inserir(i);
        }

        int i = 100;
        //se o i tem que ser o segundo elemento a partir do topo, eu tenho que remover
        //três elementos

        System.out.println(p);
        
        //removendo o topo e n elementos a partir dele
        for (int j = 0; j <= n; j++) {
            p.remover();
        }

        //inserindo i no lugar do enésimo elemento a partir do topo
        p.inserir(i);
        
        System.out.println(p);

    }

}
