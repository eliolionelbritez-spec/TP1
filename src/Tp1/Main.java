package Tp1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Departamento (todavía sin responsable asignado)
        Departamento departamento = new Departamento("Ventas", 100000, null);

        // Empleados
        Empleado juan = new Empleado("Juan", "Domicilio", "DNI123", "1234567890",
                5000, "Administrativo", "01-01-2023", departamento);
        departamento.setResponsable(juan); // ahora sí queda asignado

        Empleado pedro = new Empleado("Pedro", "Domicilio", "DNI456", "0987654321",
                4000, "Técnico", "02-01-2023", departamento);

        // Cliente
        Cliente cliente = new Cliente("Laura", "Domicilio", "DNI789", "5555555555",
                10000, "Regular");
        cliente.agregarHistorialCompra("Compra de laptop");

        // Proveedor y sus productos/servicios
        Proveedor proveedor = new Proveedor("Proveedor X", "Domicilio", "DNI111", "1111111111",
                "Proveedor de Productos", "X123");
        Producto producto1 = new Producto("P001", "Laptop", 1500, "Electrónica", proveedor);
        Producto producto2 = new Producto("P002", "Impresora", 300, "Electrónica", proveedor);
        Servicio servicio1 = new Servicio("S001", "Servicio Técnico", 500, "Servicio", proveedor);

        proveedor.agregarProductoSuministrado(producto1);
        proveedor.agregarProductoSuministrado(producto2);

        // Pago
        Pago pago = new Pago("R001", "03-01-2023", 2300, "Efectivo", "Pendiente");

        // Factura con sus items
        ArrayList<OfertaComercial> items = new ArrayList<>();
        items.add(producto1);
        items.add(producto2);
        items.add(servicio1);

        Factura factura = new Factura("F001", "01-09-2026", cliente, pedro, items, pago);
        factura.mostrarFactura();
    }
}