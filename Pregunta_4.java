
/**
 *
 * @author Jorge
 */
public class Pregunta_4 {

    public static void main(String[] args) {
/*Implementar la Criba de Eratóstenes en un vector de tamaño 5.000.000 (cinco millones) para determinar los números primos comprendidos entre 1 y 5.000.000. 
El programa deberá calcular el tiempo y la cantidad de números primos encontrados.*/
 int n=5000000;
 int[] criba = new int[n];
 double tiempoInicial = System.currentTimeMillis();
 for(int i=2; i<=Math.sqrt(n); i++){
 if(criba[i]==0){
  for(int j=i*2; j<n; j=j+i){
   criba[j]=1;
  }
 }
 }
 int contador=0;
 for(int i=2; i<n; i++)
 if(criba[i]==0)
 contador++;
  double tiempoFinal=System.currentTimeMillis();
 double tiempoEnSegundos=(tiempoFinal-tiempoInicial)/1000;
 System.out.println("La cantidad de Primos es: "+contador+" encontrado en "+tiempoEnSegundos+" seg.");
    }
    
}