import javax.swing.JOptionPane;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado emp = new Empleado(); // Objeto de tipo Empleado
        Profesor pro = new Profesor(); // Objeto de tipo Profesor
        JOptionPane.showMessageDialog(null, "Clase empleado");
        emp.ingresoDatos();
        emp.mostrarDatos();
        JOptionPane.showMessageDialog(null, "Clase profesor");
        pro.ingreso2(); // Utilizando los métodos del profesor
        pro.mostrar2();
    }
}
