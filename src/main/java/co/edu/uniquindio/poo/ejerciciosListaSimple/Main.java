package co.edu.uniquindio.poo.ejerciciosListaSimple;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        probarCalculoEstadistico();
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
    public static void probarPolinomio(){
        Polinomio p = new Polinomio();
        // Polinomio: 3x^4 - 4x^2 + 11
        p.agregarTermino(3, 4);
        p.agregarTermino(-4, 2);
        p.agregarTermino(11, 0);

        System.out.println("Polinomio:");
        p.mostrar();

        System.out.println("\nTabla de valores:");
        p.tablaValores();
    }
    public static void probarCalculoEstadistico() {
            // Crear una lista enlazada para almacenar los números reales
            ListaSimpleEnlazada<Double> lista = new ListaSimpleEnlazada<>();
            try {
                // ✅ Aquí se crea el objeto File
                // Si el archivo está en la raíz del proyecto (fuera de src/), solo se pone el nombre
                File archivo = new File("ejercicio12.txt");
                // Si lo tienes dentro de src/main/java/... entonces usa la ruta completa:
                // File archivo = new File("src/main/java/co/edu/uniquindio/poo/Ejercicio1/listaSimple/numeros.txt");
                Scanner lector = new Scanner(archivo);
                // Leer los números del archivo y agregarlos a la lista
                while (lector.hasNextDouble()) {
                    double numero = lector.nextDouble();
                    lista.agregarUltimo(new Nodo<>(numero));
                }
                lector.close();
                // Calcular la media
                double suma = 0;
                int n = 0;
                Nodo<Double> actual = lista.getPrimero();

                while (actual != null) {
                    suma += actual.getDato();
                    n++;
                    actual = actual.getProximo();
                }
                double media = suma / n;

                // Calcular la desviación estándar
                double sumaDesviacion = 0;
                actual = lista.getPrimero();
                while (actual != null) {
                    sumaDesviacion += Math.pow(actual.getDato() - media, 2);
                    actual = actual.getProximo();
                }
                double desviacionEstandar = Math.sqrt(sumaDesviacion / n);

                // Mostrar resultados
                System.out.println("Media: " + media);
                System.out.println("Desviación estándar: " + desviacionEstandar);

            } catch (FileNotFoundException e) {
                System.out.println("⚠️ Error: No se encontró el archivo.");
                e.printStackTrace();
            }
    }

}


