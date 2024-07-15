//Clase profesor que hereda la clase empleado

import javax.swing.*;

public class Profesor extends Empleado{
    int sueldo;
    public void mostar2(){
        mostrarDatos();//Metodo heredado del empleado
        JOptionPane.showMessageDialog(null, sueldo);
    }
    public void ingreso2(){
        ingresoDatos();//Metodo heredado del empleado
        String s=JOptionPane.showInputDialog("Ingrese el sueldo");
        sueldo = Integer.parseInt(s);
    }
}
