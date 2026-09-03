package Tp1;

public class Producto extends OfertaComercial {
    public Producto(String codigo, String nombre, double precio, String tipo, Proveedor proveedor) {
        super(codigo, nombre, precio, tipo, proveedor);
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio();
    }
}