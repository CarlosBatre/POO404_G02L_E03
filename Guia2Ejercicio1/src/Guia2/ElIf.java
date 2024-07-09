package Guia2;
import java.util.*;

public class ElIf {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int Num1,Num2;
        System.out.print("Ingrese numero1: ");
        Num1=reader.nextInt();
        System.out.print("Ingrese numero2: ");
        Num2=reader.nextInt();
        if(Num1==Num2){
            System.out.print("Los numeros ingresados son iguales ");
        }
        else{
            System.out.println("Los numeros ingresados No son iguales ");
        }
    }
}
