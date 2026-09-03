package Tp1;

import java.util.ArrayList;

public class Cliente extends Persona {
    private double limiteCredito;
    private String categoria; // regular, premium o corporativo
    private ArrayList<String> historialCompras = new ArrayList<>();

    public Cliente(String nombre, String domicilio, String dni, String telefono,
                   double limiteCredito, String categoria) {
        super(nombre, domicilio, dni, telefono);
        this.limiteCredito = limiteCredito;
        this.categoria = categoria;
    }

    public double getLimiteCredito() { return limiteCredito; }
    public void setLimiteCredito(double limiteCredito) { this.limiteCredito = limiteCredito; }
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public ArrayList<String> getHistorialCompras() { return historialCompras; }
    public void agregarHistorialCompra(String compra) { historialCompras.add(compra); }
}