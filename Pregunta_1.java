import java.util.Scanner;

public class Pregunta_1 {


    public static void main(String[] args) {
//Implementar el algoritmo de Euclides para la obtención del Máximo Común Divisor (MCD) de 2 números leídos por teclado. Para ayuda a continuación se describe el Pseudocódigo del Algoritmo:
int a,b,resto,resp = 0;
Scanner Scan = new Scanner(System.in);
System.out.println("Escriba el primer número: A");
a= Scan.nextInt();
System.out.println("Escriba el segundo número: B");
b= Scan.nextInt();
while( a%b !=0){
resto = a%b;
a=b;
b=resto;
    }
System.out.println("El MCD es: "+b);
    }
}   
