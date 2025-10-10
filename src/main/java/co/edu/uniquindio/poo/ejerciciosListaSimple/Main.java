package co.edu.uniquindio.poo.ejerciciosListaSimple;

public class Main {

    public static void main(String[] args) {
        probarConcatenar();
    }

    public static void probarPosicionesImpares() {
        ListaSimpleEnlazada<Integer> lista = new ListaSimpleEnlazada<>();

        lista.agregarUltimo(new Nodo<>(1));
        lista.agregarUltimo(new Nodo<>(2));
        lista.agregarUltimo(new Nodo<>(3));
        lista.agregarUltimo(new Nodo<>(4));

        System.out.print("Lista completa: ");
        lista.mostrar();

        System.out.println("Elementos en posiciones impares:");
        lista.PosicionImpar(0);
    }

    public static void probarCedulaPar() {
        ListaSimpleEnlazada<Persona> listaPersonas = new ListaSimpleEnlazada<>();

        listaPersonas.agregarUltimo(new Nodo<>(new Persona("Ana", "1234")));
        listaPersonas.agregarUltimo(new Nodo<>(new Persona("Luis", "56789")));
        listaPersonas.agregarUltimo(new Nodo<>(new Persona("Maria", "123456")));

        System.out.print("Lista completa: ");
        listaPersonas.mostrar();

        listaPersonas.mostrarPersonasCedulaPar();
    }

    public static void probarEliminarPar() {
        ListaSimpleEnlazada<Integer> lista = new ListaSimpleEnlazada<>();

        lista.agregarUltimo(new Nodo<>(1));
        lista.agregarUltimo(new Nodo<>(2));
        lista.agregarUltimo(new Nodo<>(3));
        lista.agregarUltimo(new Nodo<>(4));

        lista.mostrar();
        lista.eliminarPares();
        lista.mostrar();
    }
    public static void probarObtenerImpares() {
        ListaSimpleEnlazada<Integer> lista = new ListaSimpleEnlazada<>();

        lista.agregarUltimo(new Nodo<>(1));
        lista.agregarUltimo(new Nodo<>(2));
        lista.agregarUltimo(new Nodo<>(3));
        lista.agregarUltimo(new Nodo<>(4));
        lista.agregarUltimo(new Nodo<>(5));

        System.out.print("Lista original: ");
        lista.mostrar();

        // Crear una nueva lista solo con los impares
        ListaSimpleEnlazada<Integer> listaImpares = lista.obtenerImpares();

        System.out.print("Lista con valores impares: ");
        listaImpares.mostrar();
    }
    public static void probarContarRepetidos() {
        ListaSimpleEnlazada<Integer> lista = new ListaSimpleEnlazada<>();

        lista.agregarUltimo(new Nodo<>(7));
        lista.agregarUltimo(new Nodo<>(5));
        lista.agregarUltimo(new Nodo<>(3));
        lista.agregarUltimo(new Nodo<>(7));

        System.out.print("Lista: ");
        lista.mostrar();

        int valor = 7;
        int repeticiones = lista.contarRepetidos(valor);

        System.out.println("El número " + valor + " se repite " + repeticiones + " veces.");
    }
    public static void probarConcatenar() {
        ListaSimpleEnlazada<Integer> lista1 = new ListaSimpleEnlazada<>();
        lista1.agregarUltimo(new Nodo<>(1));
        lista1.agregarUltimo(new Nodo<>(2));
        lista1.agregarUltimo(new Nodo<>(3));

        ListaSimpleEnlazada<Integer> lista2 = new ListaSimpleEnlazada<>();
        lista2.agregarUltimo(new Nodo<>(4));
        lista2.agregarUltimo(new Nodo<>(5));
        lista2.agregarUltimo(new Nodo<>(6));

        System.out.print("Lista 1: ");
        lista1.mostrar();

        System.out.print("Lista 2: ");
        lista2.mostrar();
        // Concatenar ambas listas
        ListaSimpleEnlazada<Integer> listaConcatenada = ListaSimpleEnlazada.concatenar(lista1, lista2);

        System.out.print("Lista concatenada: ");
        listaConcatenada.mostrar();
    }
}


