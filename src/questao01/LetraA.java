package questao01;

import pilha.Pilha;

public class LetraA {
    
    public static void main(String[] args) {
        
        Pilha<Integer> p = new Pilha<>();
        
        
        //Questao 01 A
        for (int i = 0; i < 10; i++) {
            p.inserir(i);
        }
        
        System.out.println(p);
        
        for (int i = 0; i < 3; i++){
            p.remover();
        }
        
        p.inserir(100);
        
        System.out.println(p);
        
        
        
        
        
        
    }

}
