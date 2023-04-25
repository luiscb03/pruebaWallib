/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebawallib;

/**
 *
 * @author Luis
 */
public class ShapeMaker {
    
    public String drwaCircle(){
        return (new Circulo()).dibujar();
    }
    
    public String drawRectangle(){
        return (new Rectanulo()).dibujar();
    }
    
    public String drawSquare(){
        return (new Cuadrado()).dibujar();
    }
}
