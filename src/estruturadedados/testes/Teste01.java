package estruturadedados.testes;

import estruturadedados.pilha.Pilha;

public class Teste01 {

    public static void main(String[] args) {

        Pilha p = new Pilha();

        for (int i = 0; i < 4; i++) {
            p.inserir(i);
            
        }

        System.out.println(p);
        
        
        
        
        
        
        //System.out.println(p.toString());
    }
    

}

//        int numero = 999;
//        int resto;
//        while(numero != 0){
//            resto = numero % 2;
//            p.push(resto);
//            numero = numero /2;
//        }
//         
        
