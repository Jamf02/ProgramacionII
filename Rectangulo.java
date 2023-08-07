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
public class Rectangulo extends FiguraGeométrica {
 public double base;
 public double altura;
 public void mostrarDatos(){
 super.mostrarDatos();
 System.out.println("base: "+this.base);
 System.out.print("altura: "+this.altura);
}
 @Override
	public double calcularArea() 
	{
		return (base*altura)/2;
	}

	@Override
	public double calcularPerimetro() 
	{	
		return this.base+base+altura+altura;
	}   
}
