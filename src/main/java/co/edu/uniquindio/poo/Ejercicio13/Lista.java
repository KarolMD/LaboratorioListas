package co.edu.uniquindio.poo.Ejercicio13;

public class Lista {
    NodoLista inicio;

    public Lista() {
        inicio = null;
    }

    public void agregar(int dato) {
        if (inicio == null) {
            inicio = new NodoLista(dato, null);
        } else {
            NodoLista actual = inicio;
            while (actual.sig != null) {
                actual = actual.sig;
            }
            actual.sig = new NodoLista(dato, null);
        }
    }
    public int maxDistancia(int clave) {
        return maxDistanciaRec(inicio, clave, 0, -1, 0);
    }

    /**
     * nodo nodo actual
     * clave valor que buscamos
     * distancia distancia actual desde la última aparición de la clave
     * ultimaPos distancia desde la última clave encontrada (-1 si no se ha encontrado aún)
     * maxDist máxima distancia encontrada hasta ahora
     */
    private int maxDistanciaRec(NodoLista nodo, int clave, int distancia, int ultimaPos, int maxDist) {
        // Caso base
        if (nodo == null) {
            return maxDist;
        }
        if (nodo.dato == clave) {
            // Si ya había una clave
            if (ultimaPos != -1) {
                if (distancia > maxDist) maxDist = distancia;
            }
            distancia = 0;
            ultimaPos = 0;
        } else if (ultimaPos != -1) {
            distancia++;
        }
        // Llamada recursiva
        return maxDistanciaRec(nodo.sig, clave, distancia, ultimaPos, maxDist);
    }
    public void mostrar() {
        NodoLista actual = inicio;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.sig;
        }
        System.out.println("null");
    }
}
