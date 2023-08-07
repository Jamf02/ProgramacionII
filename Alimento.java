
package com.mycompany.trabajo_programacion;
public class Alimento 
{
	//Defino mis variables de instancia
	//para que la clase esté encapsulada debo definir mis atributos con el modificador private
	private String Alimento;
	private float Proteínas;
	private int cantidad;
        private float valorEnérgico;
	
	public void setAlimento(String Alimento)
	{
		this.Alimento = Alimento;
	}
	public String getAlimento()
	{
		return this.Alimento;
	}
	
	public float getProteínas() {
		return Proteínas;
	}
	public void setProteínas(float Proteínas) {
		this.Proteínas = Proteínas;
	}
	public int getcantidad() {
		return cantidad;
	}
	public void setcantidad(int cantidad) {
		this.cantidad = cantidad;
	}
        public float getvalorEnérgico() {
		return valorEnérgico;
	}
	public void setvalorEnérgico(float valorEnérgico) {
		this.valorEnérgico = valorEnérgico;
	}
	
	public void mostrarDatos()
	{
		System.out.println("====================================");
		System.out.println("Nombre Alimento: "+ this.getAlimento());
                System.out.println("====================================");
		System.out.println("Proteínas: "+ this.getProteínas()+" gramos");
                System.out.println("====================================");
		System.out.println("Cantidad: "+ this.getcantidad()+" gramos");
                System.out.println("====================================");
                System.out.println("Valor Enérgico: "+ this.getvalorEnérgico()+" kcal");
                System.out.println("====================================");
	}
	
}
