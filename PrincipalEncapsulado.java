/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trabajo_programacion;


public class PrincipalEncapsulado 
{
	public static void main(String[] args) 
	{
		Alimento a1 = new Alimento();
		a1.setAlimento("Brócoli");
		a1.setProteínas((float) 2.82);
                a1.setcantidad(100);
		a1.setvalorEnérgico(34);
		a1.mostrarDatos();
                Alimento a2 = new Alimento();
                a2.setAlimento("Lechúga");
		a2.setProteínas((float) 1.37);
                a2.setcantidad(100);
		a2.setvalorEnérgico((float) 19.6);
		a2.mostrarDatos();

	}

}