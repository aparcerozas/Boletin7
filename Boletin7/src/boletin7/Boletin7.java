/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7;

/**
 *
 * @author aparcerozas
 */
public class Boletin7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro librillo = new Libro("Iluminatti", "Donald Trump", 300);
        System.out.println(librillo.toString());
        librillo.prestamo();
        System.out.println(librillo.toString());
        librillo.devolucion();
        System.out.println(librillo.toString());
    }
    
}
