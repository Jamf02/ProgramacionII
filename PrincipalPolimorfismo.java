package com.mycompany.trabajo_27_02_21;

public class PrincipalPolimorfismo {
    public static void main(String[] args) {
Cuadrado c1 = new Cuadrado();
Circunferencia c2 = new Circunferencia();
Rectangulo c3 = new Rectangulo();
c1.lado = 5;
c1.Perimetro = c1.calcularPerimetro();
c1.Area = c1.calcularArea();
c1.mostrarDatos();
c2.radio = 7;
c2.Area = c2.calcularArea();
c2.Perimetro = c2.calcularPerimetro();
c2.mostrarDatos();
c3.base = 2;
c3.altura = 3;
c3.Perimetro = c3.calcularPerimetro();
c3.Area = c3.calcularArea();
c3.mostrarDatos();

    }
    
}
