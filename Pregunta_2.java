
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
public class Pregunta_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Se pide programar un método que recibiendo como parámetros una cadena de caracteres y el desplazamiento, devuelva el texto codificado.
 Scanner S = new Scanner(System.in);
 String frase1, frase2;
 int desplazamiento;
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
    }
    
}