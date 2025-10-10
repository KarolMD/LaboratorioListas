package co.edu.uniquindio.poo.ejerciciosListaSimple;

public class Main {

    public static void main(String[] args) {
        probarEliminarPar();
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
}


