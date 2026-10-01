package pilaint;

import java.util.Stack;

public class PilaInt {
    Stack<Integer> numeros;
    public PilaInt() {
        numeros = new Stack<Integer>();
    }
    public boolean isEmpty() {
        return numeros.isEmpty();
    }
    public void push(int numero) {
        numeros.push(numero);
    }

    public Integer pop() throws Exception {
        if (!isEmpty()) {
            return numeros.pop();
        }
        throw new Exception("La pila está vacía");

    }
    public Integer peek() throws Exception {
        if (!isEmpty()) {
            return numeros.peek();
        }
        throw new Exception("La pila está vacía");

    }
    public int search(Integer i) throws Exception {
        if (!isEmpty()) {
            return numeros.search(i);
        }
        throw new Exception("La pila está vacía");
    }
}
