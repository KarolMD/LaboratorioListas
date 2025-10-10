package co.edu.uniquindio.poo.ejerciciosListaCircular;

public class Main {
    public static void main(String[] args) {
        probarInsertarYBuscar();
    }

    public static void probarInsertarYBuscar() {
        ListaCircular<Integer> lista = new ListaCircular<>();

        lista.agregarUltimo(new Nodo<>(10));
        lista.agregarUltimo(new Nodo<>(20));
        lista.agregarUltimo(new Nodo<>(30));

        System.out.print("Lista original: ");
        lista.mostrar();
        // Insertar elementos
        lista.insertar(5, 0);  // al inicio
        lista.insertar(25, 3); // en el medio
        lista.insertar(40, 10); // al final

        System.out.print("Después de insertar: ");
        lista.mostrar();
        System.out.println("¿Existe 25? " + lista.buscar(25));
        System.out.println("¿Existe 100? " + lista.buscar(100));
    }
}

