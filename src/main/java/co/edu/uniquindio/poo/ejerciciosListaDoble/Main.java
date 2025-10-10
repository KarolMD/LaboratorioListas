package co.edu.uniquindio.poo.ejerciciosListaDoble;

public class Main {
    public static void main(String[] args) {
        probarPersonasCedulaPar();
    }
    public static void probarImprimirHaciaAtras() {
        ListaDobleEnlazada<Integer> lista = new ListaDobleEnlazada<>();

        // Agregar elementos a la lista doblemente enlazada
        lista.agregarFinal(1);
        lista.agregarFinal(2);
        lista.agregarFinal(3);
        lista.agregarFinal(4);
        lista.agregarFinal(5);

        System.out.print("Lista hacia adelante: ");
        lista.mostrar();

        System.out.print("Lista hacia atrás: ");
        lista.imprimirHaciaAtras();
    }
    public static void probarIterator() {
        ListaDobleEnlazada<Integer> lista = new ListaDobleEnlazada<>();

        lista.agregarFinal(10);
        lista.agregarFinal(20);
        lista.agregarFinal(30);
        lista.agregarFinal(40);

        System.out.println("Recorriendo con el iterador:");
        for (Integer num : lista) {
            System.out.print(num + " | ");
        }
        System.out.println();
    }
    public static void probarPersonasCedulaPar() {
        ListaDobleEnlazada<Persona> listaPersonas = new ListaDobleEnlazada<>();

        listaPersonas.agregarFinal(new Persona("Ana", "123456"));
        listaPersonas.agregarFinal(new Persona("Luis", "98765"));
        listaPersonas.agregarFinal(new Persona("Maria", "12345678"));

        System.out.print("Lista completa: ");
        listaPersonas.mostrar();
        ListaDobleEnlazada<Persona> listaCedulaPar = listaPersonas.obtenerPersonasCedulaPar();

        System.out.print("Personas con cédula par: ");
        listaCedulaPar.mostrar();
    }

}
