import java.text.DecimalFormat;

public class Tiempo1 extends Object {
    private int hora;//0-23
    private int minuto;//0-59
    private int segundo; //0-59

    //El constructor de timepo inicializa cada variable desde cero
    public Tiempo1(){
        establecerHora(0,0,0);//se llama al metodo establecer hora
    }
    //se establece un formato de hora en formato universal
    //comprobar validez de los datos ingresados; valores invalidos seran reiniciados a cero
    public void establecerHora(int h, int m, int s){
        hora = ((h >= 0 && h<=24) ? h : 0);
        minuto = ((m >=0 && m<60) ? m: 0);
        segundo = ((s >=0 && s<60) ? s : 0);
    }
    //convertir a string en formato de hora universal
    public String aStringUniversal(){
        DecimalFormat dosDigitos = new DecimalFormat("00");
        return dosDigitos.format( hora )+":"+ dosDigitos.format(minuto)+":"+dosDigitos.format(segundo);
    }
    //Convertir a string en formato de hora estandar
    public String aStringStandar(){
        DecimalFormat dosDigitos = new DecimalFormat("00");
        return ((hora == 12 || hora == 0) ? 12 : hora % 12) +":"+ dosDigitos.format(minuto)+":"+dosDigitos.format(segundo)+
                (hora<12? "AM": "PM");
    }
}
