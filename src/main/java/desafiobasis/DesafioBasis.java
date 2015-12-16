package desafiobasis;

import java.util.Stack;

/**
 *
 * @author Ulisses Carvalho
 */
public class DesafioBasis {

    public static void main(String args[]) {
        String txt = "O Fulano (aquele que fez aniversário hoje) perguntou por você.";

        if (txt.length() != 0) {
            if (verificarBalanceamento(txt)) {
                System.out.println("true");
                System.out.println(txt + " está balanceado");
            } else {
                System.out.println("false");
                System.out.println(txt + " nao está balanceado");
            }
        }
    }

    public static boolean verificarBalanceamento(String txt) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : txt.toCharArray()) {
            switch (c) {

                case '(':
                    stack.push(c);
                    break;

                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }

}
