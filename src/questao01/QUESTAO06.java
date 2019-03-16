/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao01;

import pilha.Pilha02;

/**
 *
 * @author 312182006
 */
public class QUESTAO06 {
    
    public static void main(String[] args) {
        
        Pilha02<Integer> p2 = new Pilha02<>();
        
        p2.inserir(1);
        p2.inserir(2);
        p2.inserir2(4);
        p2.inserir2(3);
        
        System.out.println(p2);
        
    }
    
}
