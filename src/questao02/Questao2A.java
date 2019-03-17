package questao02;

import pilha.Pilha;

public class Questao2A {

    public static void main(String[] args) {

        Pilha<Character> p = new Pilha<>(10);

        String s = "(A+B})";

        boolean flagerro = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c == '{') || (c == '[') || (c == '(')) {
                p.inserir(c);

            } else {
                if ((c == '}') || (c == ']') || (c == ')')) {
                    char r = p.remover();
                    if (((c == '}') && (r != '{')) || ((c == ']') && (r != '[')) || ((c == ')') && (r != '('))) {
                        flagerro = true;
                        break;
                    }
                }

            }
        }
        if (p.estaVazia() == false) {
            flagerro = true;
        }

        if (flagerro) {
            System.out.println("a String" + s + "possui erro");

        } else {
            System.out.println("a String " + s + " esta correta");
        }

    }

}
