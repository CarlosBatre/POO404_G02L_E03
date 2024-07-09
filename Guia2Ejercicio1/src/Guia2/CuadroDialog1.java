package Guia2;
import javax.swing.JOptionPane;
public class CuadroDialog1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        //TODO code application logic here
        while (true){
            try{
                String Nombre=JOptionPane.showInputDialog("Como te llamas?");
                String Entrada = JOptionPane.showInputDialog("¿Cuantos años tienes?");
                int edad= Integer.parseInt(Entrada);
                JOptionPane.showMessageDialog(null, "Hola "+Nombre+" el año que viene tendras " +(edad+1)+" años.",
                        "Resultado",JOptionPane.INFORMATION_MESSAGE);
            }
            catch (Exception e){
                System.out.println("Error en algun dato de entrada.");
                JOptionPane.showMessageDialog(null, "Error en algun dato de entrada", "Error", JOptionPane.ERROR_MESSAGE);
                String seleccion =(String) JOptionPane.showInputDialog(
                        null, "Desea salir?",
                        "Seleccione una opción:",
                        JOptionPane.QUESTION_MESSAGE,
                        null, //null para icono por defecto
                        new Object[] {"SI", "NO"},"si");
                if (seleccion.equals("SI")){
                    System.exit(0);
                    break;
                }
                //fin del catch
            }//fin del while
        }//fin del metodo main
    }
}
