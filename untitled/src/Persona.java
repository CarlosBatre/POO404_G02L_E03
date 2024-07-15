import javax.swing.*;

public class Persona {
    //Atributos
    private String nombre;
    private String apellido;
    private String edad;

    //constructor sin parametros
    //se usa al instanciar el objeto
    public Persona(){
        nombre="Rafael";
        apellido="Torres";
        edad="23";
    }
    //constructor con parametros
    public Persona(String nombre, String apellido, String edad){
        this.nombre= nombre;
        this.apellido=apellido;
        this.edad=edad;
    }
    //permite definir los datos a los atributos
    public void ingresoDatos(){
        nombre= JOptionPane.showInputDialog("Ingrese el nombre");
        apellido=JOptionPane.showInputDialog("Ingrese el apellido");
        edad=JOptionPane.showInputDialog("Ingrese la edad");
    }

    //permite mostrar los datos a los atributos
    public void mostrarDatos(){
        System.out.println("Su nombre es " +nombre);
        System.out.println("Su apellido es " +apellido);
        System.out.println("Su edad es " +edad);
        System.out.println("***************************************");
    }
    public static void main (String args[]){
        Persona obj1= new Persona();//Instancia del objeto 1
        //instancia del objeto parte 2
        Persona obj2 = new Persona ("Manuel","Valdez","25");
        //Llamamos el metodo de mostrar datos de objeto 1
        obj1.mostrarDatos();
        //Cambiamos valor a los atributos del objeto 1
        obj1.ingresoDatos();
        //Llamamos el metodo de mostrar datos de objeto 1
        obj1.mostrarDatos();
        //llamamos mostrar datos del objeto 2
        obj2.mostrarDatos();
        obj1.apellido="Sanchez";
        obj1.mostrarDatos();
    }
}
