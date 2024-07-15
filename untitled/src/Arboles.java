public class Arboles {
    //constructor sin paramentros
    public Arboles(){
        System.out.println("Un arbol generico");
    }
    //Constructores con un parametro string
    public Arboles(String tipo){
        System.out.println("Un arbol tipo "+tipo);
    }
    //constructor con parametro int
    public Arboles(int altura){
        System.out.println("Un arbol de "+altura+ " metros.");
    }

    //Constructor con dos parametros uno int y el otro string
    public Arboles(int altura,String tipo) {
        System.out.println("Un " + tipo + " de " + altura + " metros");
    }

    public static void main (String args[]){
            Arboles arbol1= new Arboles(4);//objeto 1
            Arboles arbol2= new Arboles("Roble");//objeto2
            Arboles arbol3 = new Arboles ();//objeto 3
            Arboles arbol4 = new Arboles (5,"Pino");//Objeto4
    }
}
