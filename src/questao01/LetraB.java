package questao01;

import estruturadedados.pilha.Pilha;

public class LetraB {
    
    public static void main(String[] args) {
        
        
        Pilha<Integer> p = new Pilha<>();
        
        
        for (int i = 0; i < 10; i++) {
            p.inserir(i);
        }
        
        int aux01 = p.remover();
        int aux02 = p.remover();
        p.remover();
        
        p.inserir(100);
        p.inserir(aux02);
        p.inserir(aux01);
        
        
        System.out.println(p);
        
    }

}
