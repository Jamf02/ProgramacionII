/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pregunta_6;

import java.util.Random;

/**
 *
 * @author Jorge
 */
public class Fútbol {
	String equipoA;
	String equipoB;
	int anotacionesEquipoA;
	int anotacionesEquipoB;
	
	public void mostrarResultado()
	{
		System.out.println("====================================");
		System.out.println(this.equipoA+" Vs. "+this.equipoB);
		System.out.println("\t"+this.anotacionesEquipoA+" - "+this.anotacionesEquipoB);
		System.out.println("====================================");
	}
	
	public void anotar(int ocasionesDeGol)
	{
		Random aleatorio = new Random();
		for(int i = 0; i<ocasionesDeGol ; i++)
		{
			int resultadoEquipoA = aleatorio.nextInt(25);
			int resultadoEquipoB = aleatorio.nextInt(25);
			//hay una probabilidad de 3/25 de convertir un gol
			if(resultadoEquipoA<=2)
				this.anotacionesEquipoA++;
			if(resultadoEquipoB<=2)
				this.anotacionesEquipoB++;
		}
	}

	public static void main(String[] args) 
	{
		Fútbol juego = new Fútbol();
		juego.equipoA = "Bolivar";
		juego.equipoB = "The Strongest";
		juego.anotar(20);
		juego.mostrarResultado();
	}

}
