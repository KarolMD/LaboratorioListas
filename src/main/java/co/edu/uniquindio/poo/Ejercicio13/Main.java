package co.edu.uniquindio.poo.Ejercicio13;

public class Main {
    public static void main(String[] args) {
        probarEjercicio13();
    }

    public static void probarEjercicio13() {
        Lista lista = new Lista();
        lista.agregar(9);
        lista.agregar(4);
        lista.agregar(6);
        lista.agregar(8);
        lista.agregar(4);
        lista.agregar(5);
        lista.agregar(4);

        System.out.print("Lista: ");
        lista.mostrar();

        int clave = 4;
        int distancia = lista.maxDistancia(clave);

        System.out.println("La máxima distancia entre nodos con clave " + clave + " es: " + distancia);
    }
}

