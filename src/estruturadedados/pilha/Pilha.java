package estruturadedados.pilha;

public class Pilha {

    public int[] elementos;
    public int topo;

    public Pilha() {
        elementos = new int[10];
        topo = -1;
    }

    

    public void inserir(int e) {
        if (!estaCheia()) {
            topo++;
            elementos[topo] = e;
        }

    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public boolean estaCheia() {
        return this.topo == this.elementos.length - 1;
    }

    public int remover() {
        if (!estaVazia()) {
            return elementos[topo--];
        }
        return 0;

    }

    public int tamanho() {
        return this.elementos.length;
    }

    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i <= this.topo; i++) {
            sb.append(this.elementos[i]);
            if (i < this.topo) {
                sb.append(", ");
            }
        }

        sb.append("]");

        return sb.toString();
    }

}
