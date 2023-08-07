package Pregunta_5;

/**
 *
 * @author Jorge
 */
public class Aéreo extends MedioDeTransporte{
    
private int VelocidadAereo;
private int Capacidad;
public int getVelocidadAereo() {
		return VelocidadAereo;
	}
	public void setcantidad(int VelocidadAereo) {
		this.VelocidadAereo = VelocidadAereo;       
	}
    public int getCapacidad() {
        return Capacidad;
    }
    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
        
    }
public void mostrarDatos(){
System.out.println("Velocidad Aereo: "+this.getVelocidadAereo());
System.out.println("Capacidad Pasajeros: "+this.getCapacidad());

}  
    
}

