
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public class Pregunta_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*Desarrolle un programa que incluya un método que permita decodificar un texto sabiendo que se encriptó empleando la codificación CESAR con un
desplazamiento conocido, el cual que será ingresado por teclado lo mismo que la cadena de caracteres que se quiere decodificar.*/
Scanner S = new Scanner(System.in);
 String frase1, frase2, frase2Inv;
 int desplazamiento, desplazamientoInv;
 frase2= "";
 String may = "ABCDEFGHIJKLMNOPQRSTUVXWYZ";
 System.out.println("Introduce una frase: ");
 frase1 = S.nextLine();
 System.out.println("Introduce el desplazamiento");
 desplazamiento = S.nextInt();
 for(int i=0; i<frase1.length(); i++){
     for(int j=0; j<may.length(); j++){
         if(frase1.charAt(i) ==may.charAt(j)){
             if(j+desplazamiento >= may.length()){
            frase2+= may.charAt((j+desplazamiento) % may.length());
             } else {
            frase2 += may.charAt(j+desplazamiento);
             }
         }
         
     }
 }
 System.out.println("Resultado: "+frase2);
 System.out.println("Cuanto tiene que ser el desplazamiento Inverso");
 desplazamientoInv = S.nextInt();
 frase2Inv = "";
for(int i=0; i<frase2.length(); i++){
     for(int j=0; j<may.length(); j++){
         if(frase2.charAt(i) ==may.charAt(j)){
             if(j-desplazamientoInv >= may.length()){
            frase2Inv+= may.charAt((j-desplazamientoInv) % may.length());
             } else {
            frase2Inv += may.charAt(j-desplazamientoInv);
 }
    }
    
     }
}
System.out.println("Resultado: "+frase2Inv);
    } 
}