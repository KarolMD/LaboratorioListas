package co.edu.uniquindio.poo.ejerciciosListaDoble;

import co.edu.uniquindio.poo.ejerciciosListaSimple.Nodo;

import java.util.Iterator;

public class IteratorListaDoble<T extends Comparable<T>> implements Iterator<T> {
    private NodoDoble2<T> actual;
    public IteratorListaDoble(NodoDoble2<T> actual) {
        this.actual = actual;
    }
    @Override
    public boolean hasNext() {
        return actual != null;
    }
    @Override
    public T next() {
        T elemento = actual.getElemento();
        actual = actual.getProximo(); // Avanza al siguiente nodo
        return elemento;
    }
}
