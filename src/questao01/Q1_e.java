package questao01;
import pilha.Pilha;
public class Q1_e {

    public static void main(String[] args) {
        int numero = 0;
        int i = 100; 
        int tam = 5;

        Pilha<Integer> p = new Pilha<>(tam);
        
        while (p.inserir(numero++)) {
            System.out.println("inserindo" + numero);
        }
        System.out.println("-------------------------");
        numero--;

        for (int j = 0; j < tam; j++) {
            p.remover();
            System.out.println("removendo"+numero);
            numero --;

        }
        System.out.println ("-------------------------");
        p.inserir(i);
        System.out.println("inserindo" + i);

    }

    

    }


