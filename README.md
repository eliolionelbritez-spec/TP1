Integrantes
- Britez Elio Lionel - DNI 46241202
- Maximo Valentino Larraburu - DNI 46784014
- Maximo Lautaro Marquez - DNI 46.830.735

 Cómo interpretamos el escenario
La empresa necesita registrar personas (clientes, empleados y proveedores),
productos y servicios, facturas y pagos, organizados por departamentos.
Identificamos que clientes, empleados y proveedores comparten datos básicos
(nombre, domicilio, DNI, teléfono), por lo que los modelamos con una clase
base `Persona` de la que heredan. De la misma forma, productos y servicios
comparten código, nombre, precio y proveedor, así que los agrupamos bajo
una clase abstracta `OfertaComercial`.

 Historias de usuario
- Como empleado, quiero registrar un cliente con su categoría (regular,
  premium o corporativo) para poder facturarle.
- Como empleado, quiero generar una factura indicando los productos o
  servicios adquiridos, la forma de pago y el total a abonar.
- Como administrador, quiero asociar cada empleado a un departamento y
  asignar un responsable a cargo.
- Como proveedor, quiero que se registren los productos que suministro a
  la empresa.

 Clases y responsabilidades
 Clase  Responsabilidad 
 `Persona`  Datos base (nombre, domicilio, DNI, teléfono) 
 `Cliente`  Extiende Persona. Límite de crédito, categoría, historial de compras 
 `Empleado`  Extiende Persona. Salario, puesto, fecha de ingreso, departamento 
 `Proveedor`  Extiende Persona. Razón social, NIF, productos suministrados 
 `Departamento`  Nombre, presupuesto, empleado responsable 
 `OfertaComercial`  Clase abstracta base de Producto y Servicio 
 `Producto` / `Servicio`  Código, nombre, precio, tipo, proveedor 
 `Pago`  Monto, fecha, forma de pago, estado 
 `Factura`  Une cliente, empleado, ítems y pago; calcula el total 



Dificultades y aprendizajes
La principal dificultad fue que al principio teníamos todo el código junto
en la clase Main en vez de repartirlo entre las clases correspondientes.
También nos costó lograr que la herencia y el polimorfismo funcionaran
correctamente, no solo que estuvieran escritos: por ejemplo, teníamos el
método `calcularPrecioFinal()` sobrescrito en Producto y Servicio, pero
nunca se llamaba desde Factura, así que no se ejecutaba realmente. Tuvimos
que revisar y corregir el código varias veces hasta que quedó bien
organizado. Aprendimos que no alcanza con escribir los conceptos de POO,
hay que asegurarse de que se usen al correr el programa, y también
aprendimos a usar Git y GitHub para ir registrando el avance del trabajo.
