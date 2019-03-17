package questao03;

/**
 * Exercício String xCy
 * 
 * @author jessica
 */
public class Questao3 {

	private String[] pilha = new String[0];
	
	/** Constante de verificação */
	private final String A = "A";
	private final String B = "B";
	private final String C = "C";
	
	public void push(String x) {
		if(pilha.length == 0) {
			pilha = new String[] {x};
		} else {
			
			String[] novaPilha = new String[pilha.length + 1];
			int i = 0;
			while(i < pilha.length) {
				novaPilha[i]  = pilha[i];
				i++;
			}
			novaPilha[i] = x;
			
			pilha = novaPilha;
		}
		
	}
	
	public String pull() {
		if(pilha == null || pilha.length == 0) {
			return "";
		}
		
		String [] novaPilha = new String[pilha.length - 1];
		
		int i = 0;
		
		while (i < novaPilha.length) {
			novaPilha[i] = pilha[i];
			i++;
		}
		
		String pullOut = pilha[i];
		
		pilha = novaPilha;
		
		return pullOut;
	}
	
	
	/**
	 * Verifica se a string passada é do tipo xCy
	 * @param xCy
	 * @return boolean
	 */
	public boolean validacaoXCY(String xCy) {
		
	    //string vazia não é do tipo  
		if(xCy == null || xCy.equals("")) {
			return false;
		}
		
		boolean encontrouC = false;
		
		String[] stringsXCY = xCy.split("");
		
		int i = 0;
		
		//guarda a primeira parte da string na pilha
		while(encontrouC == false && i < stringsXCY.length) {
			String StringXCY = stringsXCY[i];
			
			if(StringXCY.equals(A) || StringXCY.equals(B)) {
				push(StringXCY);
			} else if(StringXCY.equals(C)) {
				encontrouC = true;
			} else {
				return false;
			}
			
			i++;
		}
		
		//compara a segunda parte da string com o retorno da pilha
		int qtdeVerificar = pilha.length;
		if(encontrouC) {
			
			while(i < stringsXCY.length && qtdeVerificar > 0) {
				String stringXCY = stringsXCY[i];
				if(!stringXCY.equals(pull())) {
					return false;
				}
				i++;
				qtdeVerificar--;
			}
			
		} else {
			return false;
		}

		//se a comparação não encontrou problemas o retorno será de sucesso se os dois lados verificados forem do mesmo tamanho, então os dois ponteiros chegaram nos limites
		if(i == stringsXCY.length && qtdeVerificar == 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		Questao3 ex = new Questao3();
		
		String entrada = "BBACABB"; //OK
		//String entrada = "BACABB"; //NÃO OK
		//String entrada = "BBACAB"; //NÃO OK
		//String entrada = "C"; //OK
		//String entrada = ""; //NÃO OK
		//String entrada = null; //NÃO OK
		
		boolean res = ex.validacaoXCY(entrada);
		
		if(res) {
			System.out.println("A String [" + entrada + "] É do tipo xCy");
		} else {
			System.out.println("A String [" + entrada + "] NÃO É do tipo xCy");
		}
		
	}
}
