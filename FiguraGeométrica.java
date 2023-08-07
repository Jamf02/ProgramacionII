
package com.mycompany.trabajo_27_02_21;

abstract public  class FiguraGeométrica {
  //definimos las variables atributo
    public double Perimetro;
    public double Area;
  //implementamos su metodo para mostrar datos
    public void mostrarDatos(){
        System.out.println("===========================");
        if(this instanceof Cuadrado)
        System.out.println("==========CUADRADO===========");
        
        else if(this instanceof Circunferencia)
        System.out.println("=====CIRCUNFERENCIA==========");
  		System.out.println("AREA: ="+this.Area+" u2");
		System.out.println("PERIMETRO: ="+this.Perimetro+" u");
    }
    


  //cuando le aumnento el modificador abstract a un metodo de la clase padre
    abstract public double calcularArea();
    abstract public double calcularPerimetro();    
    
}