package estruturadedados.testes;


public class Recursao {
    
    public static void main(String[] args) {
        
        int resultado = recursao(1);
        
        System.out.println(resultado);
        
    }
    
    static int recursao(int x){
        if(x <= 25){
            return recursao(x + 1);
        }
        return x;
    }

}
