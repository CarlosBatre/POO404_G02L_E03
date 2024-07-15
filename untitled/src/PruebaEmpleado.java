import javax.swing.JOptionPane;

public class PruebaEmpleado {
    public static void main (String args[]){
        Empleado emp = new Empleado();//objeto de tipo empleado
        Profesor pro = new Profesor(); //objeto de tipo profesor
        JOptionPane.showMessageDialog(null, "claseemplado");
        //utilizanod los metodos del empleado
        emp.ingresoDatos();
        emp.mostrarDatos();

        JOptionPane.showMessageDialog(null,"clase profesor");
        //utilizando los metodos del profesor
        pro.ingreso2();
        pro.mostar2();
    }
}
