package co.edu.uniquindio.poo.ejerciciosListaSimple;
//ejericio 11
public class Termino implements Comparable<Termino> {
    private double coeficiente;
    private int exponente;

    public Termino(double coeficiente, int exponente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
    }

    public double getCoeficiente() {
        return coeficiente;
    }

    public int getExponente() {
        return exponente;
    }

    public void setCoeficiente(double coeficiente) {
        this.coeficiente = coeficiente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }

    // Metodo para evaluar este término con un valor de x
    public double evaluar(double x) {
        return coeficiente * Math.pow(x, exponente);
    }

    @Override
    public int compareTo(Termino otro) {
        // ordenamos de mayor a menor exponente
        return Integer.compare(otro.exponente, this.exponente);
    }

    @Override
    public String toString() {
        if (exponente == 0) return String.valueOf(coeficiente);
        if (exponente == 1) return coeficiente + "x";
        return coeficiente + "x^" + exponente;
    }
}
