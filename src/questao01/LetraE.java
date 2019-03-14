package questao01;

import pilha.Pilha;

public class LetraE {
    
    
    public static void main(String[] args) {
        
        Pilha<Integer> p = new Pilha<>();
        
        
        for (int i = 0; i < 10; i++) {
            p.inserir(i);
        }
        
        for (int i = 0; i < 10; i++) {
            p.remover();
        }
        
        int i = 100;
        
        p.inserir(i);
        
        System.out.println(p);
        
    }

}
