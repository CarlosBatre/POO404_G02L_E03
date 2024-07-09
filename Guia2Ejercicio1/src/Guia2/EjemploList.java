package Guia2;
import java.util.*;
public class EjemploList {
    public static void main (String[] args) {
        ArrayList<String> ListaPersona = new ArrayList();
        //agregamos elementos
        ListaPersona.add("Marie Curie");
        ListaPersona.add("Benjamin Franklin");
        ListaPersona.add("Marco Antonio");
        ListaPersona.add(1, "Juan Murillo");
//Mostrar contenido de ArrayList
        System.out.println("Uso de arraylist");
        System.out.println("Contenido de lista persona: " + ListaPersona + "\n");
        //Obteniendo posicion de un elemento
        int pos = ListaPersona.indexOf("Benjamin Franklin");
        System.out.println("El indice de Benjamin Franklin es: " + pos);
        //Verificamos si la lista esta vacia
        boolean check = ListaPersona.isEmpty();
        System.out.println("Verificando si el ArrayList esta vacio: "+check);
        //obtenemos el tamaño de la lista
        int size = ListaPersona.size();
        System.out.println("El tamaño de la listaPersona es: "+ size);
        //Verificamos si un elemento esta incluido en la lista
        boolean elemento = ListaPersona.contains("Marco Antonio");
        System.out.println("Verificando si 'Marco Antonio' esta incluido en la lista "+elemento);
        //Obteniendo el elemento de una posicion especifica
        String item= ListaPersona.get(0);
        System.out.println("El elemento con indice 0 es " +item);
        //Recuperamos los elementos del array list
        //La primera forma es usando el lazo for
        System.out.println("\n Recuperando elementos del arraylist con FOR");
        for(int i=0; i<ListaPersona.size(); i++){
            System.out.println("Indice: "+i+ "-Elemento:"+ListaPersona.get(i));
        }
        //Segunda forma es usando el lazo foreach
        System.out.println("\n Recuperando elementos del arraylist con FOREACH");
        for (String persona: ListaPersona){
            System.out.println("Elemento: "+persona);
        }
        //la tercera forma es usando iterator
        //hasNext() devuelve true si hay mas elementos
        //next() devuelve el siguiente elemento
        System.out.println("\n Recuperando elementos del arraylist con ITERATOR");
        for (Iterator<String> it= ListaPersona.iterator(); it.hasNext();){
            System.out.println("Elemento: "+it.next());
        }
        //Reemplazando un elemento
        ListaPersona.set(1, "Nikola Tesla");
        System.out.println("\nArraylist despues del reemplazo: " +ListaPersona);
        //Eliminamos el elemento en posicion 0
        ListaPersona.remove(0);
        System.out.println("\nArrayList después de eliminar elemento 0: " + ListaPersona);
        //Convirtiendo ArrayList en Array
        String[] simpleArray = ListaPersona.toArray(new String[ListaPersona.size()]);
        System.out.println("\nEl objeto Array creado es: " + Arrays.toString(simpleArray));
    }    }


