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
public class Cuadrado extends FiguraGeométrica
{
	//defino su variable atributo
	public double lado;
	public void mostrarDatos()
	{
		super.mostrarDatos();
		System.out.println("LADO: ="+this.lado);
	}

	@Override
	public double calcularArea() 
	{
		return Math.pow(this.lado,2);//devuelvo el valor de el lado elevado al cuadrado
	}

	@Override
	public double calcularPerimetro() 
	{	
		return this.lado*4;
	}
}
