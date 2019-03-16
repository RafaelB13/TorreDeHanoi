package pilha;

public class Pilha02<T> {

    public T[] elementos;
    public int topo;
    public int topo2;

    public Pilha02() {
        elementos = (T[]) new Object[10];
        topo = -1;
        topo2 = elementos.length;
    }
    
    public Pilha02(int x){
        elementos = (T[]) new Object[x];
        topo = -1;
    }

    public boolean inserir(T e) {
        if (!estaCheia()) {
            topo++;
            elementos[topo] = e;
            return true;
        }
        return false;
    }
    
    //Método auxiliar questao 06
    public void inserir2(T e){
        if(!estaCheia()){
            elementos[--topo2] = e;
        }
    }

    public boolean estaVazia() {
        return topo == -1;
    }
    
    public boolean estaVazia2(){
        return topo2 == elementos.length;
    }

    public boolean estaCheia() {
        return this.topo == this.elementos.length - 1;
    }
    
    public boolean estaCheia2(){
        return topo2-topo == 1;
    }

    public T remover() {
        if (!estaVazia()) {
            return elementos[topo--];
        }
        return null;

    }
    //Método auxiliar questao 06
    public T remover2(){
        return elementos[topo2--];
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

