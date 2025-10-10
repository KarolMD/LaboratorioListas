package co.edu.uniquindio.poo.ejerciciosListaSimple;
//ejercicio 11
public class Polinomio {
    private ListaSimpleEnlazada<Termino> listaTerminos;

    public Polinomio() {
        listaTerminos = new ListaSimpleEnlazada<>();
    }

    // Agregar término al polinomio
    public void agregarTermino(double coeficiente, int exponente) {
        Termino t = new Termino(coeficiente, exponente);
        listaTerminos.agregarUltimo(new Nodo<>(t));
    }

    // Evaluar el polinomio en un valor x
    public double evaluar(double x) {
        double resultado = 0.0;
        for (Termino t : listaTerminos) {
            resultado += t.evaluar(x);
        }
        return resultado;
    }

    // Mostrar el polinomio
    public void mostrar() {
        Nodo<Termino> nodo = listaTerminos.getPrimero();
        if (nodo == null) {
            System.out.println("0");
            return;
        }
        while (nodo != null) {
            Termino termino = nodo.getDato();
            double coef = termino.getCoeficiente();
            int exp = termino.getExponente();
            // Mostrar el término
            if (exp == 0) {
                System.out.print(coef);
            } else if (exp == 1) {
                System.out.print(coef + "x");
            } else {
                System.out.print(coef + "x^" + exp);
            }
            // Mostrar signo si el siguiente término es positivo
            if (nodo.getProximo() != null) {
                double siguienteCoef = nodo.getProximo().getDato().getCoeficiente();
                if (siguienteCoef >= 0) {
                    System.out.print(" + ");
                } else {
                    System.out.print(" ");
                }
            }
            nodo = nodo.getProximo(); // avanzar al siguiente nodo
        }
        System.out.println(); // salto de línea al final
    }

    // Generar tabla de valores de x de 0.0 a 5.0 en pasos de 0.5
    public void tablaValores() {
        System.out.println("x\tf(x)");
        for (double x = 0.0; x <= 5.0; x += 0.5) {
            System.out.printf("%.1f\t%.4f\n", x, evaluar(x));
        }
    }
}
