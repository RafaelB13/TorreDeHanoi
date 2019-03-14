package questao01;
import pilha.Pilha;
public class Q1_f {

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

        //Invertendo uma Pilha
        numero = p.remover();
        while (p.estaVazia() == false) {
            p2.inserir(numero);
            System.out.println("Removendo de p1/Inserido em p2 " + numero + "\n");

            numero = p.remover();
        }

        System.out.println("-------------------------");

        p.inserir(i);

        while (p.estaCheia() == false) {
            numero = p2.remover();
            p.inserir(numero);
            System.out.println("Removendo de p2/Inserido em p1 " + numero + "\n");

        }

        System.out.println("-------------------------");

    }

}
