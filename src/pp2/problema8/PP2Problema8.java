/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema8;
import java.util.*;
/**
 *
 * @author PC
 */
public class PP2Problema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        muestraResultado(calcularHipotenusa());
    }
    public static double solicitarDatos(String d){ //Solicita datos
        double miDato;
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.print("Introduce el dato " + d);
        miDato= entradaEscaner.nextDouble();
        return miDato;
    }
    public static double calcularHipotenusa(){
        double a = solicitarDatos("cateto a ");
        double b = solicitarDatos("cateto b ");
        return a+b;    
    }
    public static void muestraResultado(double a){
        System.out.print("El resultado es " + a);
    }
}