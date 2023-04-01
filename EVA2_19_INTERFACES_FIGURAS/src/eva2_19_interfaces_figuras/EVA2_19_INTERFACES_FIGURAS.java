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
public class EVA2_19_INTERFACES_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //No se pueden instancias 
        //Figuras figura = new Figuras ();
        
     //No se puede crear instancias de interfaces
   
    Circulo circ = new Circulo();   
    circ.setRadio(12);
    circ.ImprimirDatos();
    
    Triangulo tri = new Triangulo();
    tri.setBase(4);
    tri.setAltura(8);
    tri.ImprimirDatos();
    }
    
}