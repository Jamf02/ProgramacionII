
package Pregunta_5;

public class MedioDeTransporte {
	//Defino mis variables atributo
	
	private int cantidadTransportes;
        private String pais;
        private String Arranque;
	
	public void setpais(String pais) 
	{
		this.pais = pais;
	}
	public String getpais() 
	{
		return pais;
	}
	public void setcantidadTransportes(int cantidadTransportes) 
	{
		this.cantidadTransportes = cantidadTransportes;
	}
	public int getcantidadTransportes() 
	{
		return cantidadTransportes;
            
	}
        public void setArranque(String Arranque) 
	{
		this.Arranque = Arranque;
	}
	public String getArranque() 
	{
		return Arranque;
        }
	public void mostrarDatos()
	{
		System.out.println("====================================");
		if(this instanceof Aéreo)
			System.out.println("==============AÉREO===============");
		else if (this instanceof Terrestre)
			System.out.println("===========TERRESTRE============");
		System.out.println("PAIS: "+this.getpais());
		System.out.println("CANTIDAD DE JUGADORES: "+this.getcantidadTransportes());
                System.out.println("PAIS: "+this.getArranque());
                
	}
	//defino el método Constructor
public MedioDeTransporte(String n, int j)
	{
		this.setpais(n);
		this.setcantidadTransportes(j);
	}
    }


      

