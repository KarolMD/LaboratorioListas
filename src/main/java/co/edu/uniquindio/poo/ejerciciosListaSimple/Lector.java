package co.edu.uniquindio.poo.ejerciciosListaSimple;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lector {
    public static ListaSimpleEnlazada<Double> leerNumeros(String nombreArchivo) {
        ListaSimpleEnlazada<Double> lista = new ListaSimpleEnlazada<>();
        try (Scanner sc = new Scanner(new File(nombreArchivo))) {
            while (sc.hasNextDouble()) {
                lista.agregarUltimo(new Nodo<>(sc.nextDouble()));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }
        return lista;
    }
}
