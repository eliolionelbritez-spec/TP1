package Tp1;

public class Empleado extends Persona {
    private double salario;
    private String puesto; // administrativo, técnico o gerente
    private String fechaIngreso;
    private Departamento departamento;

    public Empleado(String nombre, String domicilio, String dni, String telefono,
                    double salario, String puesto, String fechaIngreso, Departamento departamento) {
        super(nombre, domicilio, dni, telefono);
        this.salario = salario;
        this.puesto = puesto;
        this.fechaIngreso = fechaIngreso;
        this.departamento = departamento;
    }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public String getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(String fechaIngreso) { this.fechaIngreso = fechaIngreso; }
    public Departamento getDepartamento() { return departamento; }
    public void setDepartamento(Departamento departamento) { this.departamento = departamento; }
}