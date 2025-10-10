package co.edu.uniquindio.poo.ejerciciosListaDoble;

public class NodoDoble2<T> {
    private T elemento;
    private NodoDoble2<T> proximo;
    private NodoDoble2<T> anterior;

    public NodoDoble2(T elemento) {
        this.elemento = elemento;
        anterior = null;
        proximo = null;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public NodoDoble2<T> getProximo() {
        return proximo;
    }

    public void setProximo(NodoDoble2<T> proximo) {
        this.proximo = proximo;
    }

    public NodoDoble2<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble2<T> anterior) {
        this.anterior = anterior;
    }
}
