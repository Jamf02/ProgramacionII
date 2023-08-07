/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabajo_27_02_21;

/**
 *
 * @author Jorge
 */
public class Circunferencia extends FiguraGeométrica{
  //derinimos la variable 
   public double radio;
public void mostrarDatos(){
 super.mostrarDatos();
 System.out.println("Radio: "+this.radio);
}
	@Override
	public double calcularArea() 
	{
		return Math.PI*Math.pow(this.radio, 2);
	}

	@Override
	public double calcularPerimetro() 
	{
		return Math.PI*2*this.radio;
	}
    
}
