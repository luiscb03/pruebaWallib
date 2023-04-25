package pruebawallib;
public class FacadeDemo {

    public static void main(String[] args) {
        
        ShapeMaker shapeMaker = new ShapeMaker();
        System.out.println(shapeMaker.drwaCircle());
        System.out.println(shapeMaker.drawRectangle());
        System.out.println(shapeMaker.drawSquare());
    }
    
}
