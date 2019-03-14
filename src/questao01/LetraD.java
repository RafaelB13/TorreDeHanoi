package questao01;

import pilha.Pilha;

public class LetraD {

    public static void main(String[] args) {

        Pilha<Integer> p = new Pilha<>();
        Pilha<Integer> p_aux = new Pilha<>();

        int numero = 0;
        int n = 5;

        while (p.inserir(numero++)) {
        }

        int i = 100;
        //se o i tem que ser o segundo elemento a partir do topo, eu tenho que remover
        //três elementos

        //removendo o topo e n elementos a partir dele (e salvando)
        for (int j = 0; j <= n; j++) {
            int elem = p.remover();
            //não preciso salvar o último
            if (n != j) {
                p_aux.inserir(elem);
            }
        }

        //inserindo i no lugar do enésimo elemento a partir do topo
        p.inserir(i);
        
        

        while (p.inserir(p_aux.remover())) {
        }
        
        System.out.println(p);

    }

}
