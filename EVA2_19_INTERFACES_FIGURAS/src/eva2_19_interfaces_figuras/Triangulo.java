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
public class Triangulo implements FIguras {
 private double base;
private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }    
  public Triangulo(){
      
  }

@Override  
    
public double calcularA(){
 return (base*altura)/2;   
}    

@Override

public double calcularPe(){
double hip = Math.hypot(base, altura);
return base+altura+hip;
}    

public void ImprimirDatos(){
    System.out.println("\nTriángulo.");
    System.out.println("Base: " +base);
    System.out.println("Altura: " +altura);
    System.out.println("Área: " +calcularA());
    System.out.println("Perímetro: " +calcularPe());    
}

    
}