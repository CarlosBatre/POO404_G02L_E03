//Prueba tiempo1
//Clase pruebatiempo1 que utiliza a tiempo1
import javax.swing.JOptionPane;

public class PruebaTiempo1 {
    public static void main(String args[]){
        Tiempo1 tiempo = new Tiempo1();//llamamos al constructor tiempo1
        //anexamos la version string de tiempo a salida string
        String salida = "La hora universal inicial es: "+
                tiempo.aStringUniversal()+"\nLa hora estandar inicial es: "+tiempo.aStringStandar();
        //cambiar tiempo y anexar hora actualizada a salida
        tiempo.establecerHora( 13, 27, 6);
        salida += "\n\nLa hora universal despues de establecer hora es: "+tiempo.aStringUniversal()+
                "\nLa hora universal despues de establecer hora es: "+tiempo.aStringUniversal();
        //establecer tiempo con valores invalidos; anexar hora actualizada a salida
        tiempo.establecerHora(99,99,99);
        salida += "\n\nDespues de intentar ajustes invalidos: "+
                "\nHora universal: "+ tiempo.aStringUniversal()+
                "\nHora estandar: "+tiempo.aStringStandar();
        JOptionPane.showMessageDialog(null, salida, "Prueba de la clase Tiempo1", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }//fin del main
}//fin de la clase pruebatiempo1
