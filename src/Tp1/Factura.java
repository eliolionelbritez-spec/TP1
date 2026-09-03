 package Tp1;

import java.util.ArrayList;

public class Factura {
    private String numero;
    private String fecha;
    private Cliente cliente;
    private Empleado empleado;
    private ArrayList<OfertaComercial> items;
    private Pago pago;

    public Factura(String numero, String fecha, Cliente cliente, Empleado empleado, ArrayList<OfertaComercial> items, Pago pago) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.empleado = empleado;
        this.items = items;
        this.pago = pago;
    }

    public void agregarItem(OfertaComercial item) {
        items.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (OfertaComercial item : items) {
            total += item.calcularPrecioFinal();
        }
        return total;
    }

    public void mostrarFactura() {
        System.out.println("Factura Número: " + numero);
        System.out.println("Fecha de Emisión: " + fecha);
        System.out.println("Cliente: " + cliente.getNombre() + " (" + cliente.getCategoria() + ")");
        System.out.println("Empleado Gestor: " + empleado.getNombre() + " - Puesto: " + empleado.getPuesto());
        System.out.println("Departamento: " + empleado.getDepartamento().getNombre());
        System.out.println("Items Adquiridos:");
        for (OfertaComercial item : items) {
            System.out.println(" - " + item.getNombre() + " - Precio: $" + item.calcularPrecioFinal());
        }
        System.out.println("Forma de Pago: " + pago.getFormaPago());
        System.out.println("Estado del Pago: " + pago.getEstado());
        System.out.println("Total a Pagar: $" + calcularTotal());
    }
}