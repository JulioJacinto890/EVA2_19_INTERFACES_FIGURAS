/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_19_interfaces_figuras;

/**
 *
 * @author hp
 */
public class Circulo implements FIguras{
    
private double radio;

    Circulo() {
 
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    public Circulo(double radio) {
        this.radio = radio;
    }

    
@Override
    
public double calcularA(){
return Math.PI*(radio*radio);    
}    


@Override

public double calcularPe(){
return Math.PI*(radio*2);
}      

public void ImprimirDatos(){
    System.out.println("\nCírculo.");
    System.out.println("Radio: " +radio);
    System.out.println("Área: " +calcularA());
    System.out.println("Perímetro: " +calcularPe());    
}


    
}