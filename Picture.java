/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle moon;
    private Square ground;
    private Person juan;
    private Person maria;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        //
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
        
        ground = new Square();
        ground.moveVertical(110);
        ground.moveHorizontal(-340);
        ground.changeColor("green");
        ground.changeSize(800);  
        ground.makeVisible();  
    
        sun = new Circle();
        sun.makeVisible();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(10); // Posición visible pero baja
        sun.changeSize(80);
        sun.slowMoveVertical(200);
        
        moon = new Circle();
        moon.changeColor("magenta");
        moon.moveHorizontal(-130);
        moon.moveVertical(-10);
        moon.changeSize(40);
        moon.makeVisible();
        
        // Mover el sol hacia abajo para simular el atardecer
        sun.slowMoveVertical(150); // Mueve el sol hacia abajo (simulando el atardecer)
        // Hace visible la luna después del atardecer
        
    }
    

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
    
    
    public void amanecer() { 
        // La luna se hace invisible
        moon.makeInvisible();
        
        // El sol se mueve hacia arriba lentamente para simular el amanecer
        sun.slowMoveVertical(-350);
        // Mueve el sol en pasos pequeños para que el movimiento sea visible
        
        //Justo despues del moviemiento del sol:
         
        juan = new Person();
        juan.moveHorizontal(-140);
        juan.moveVertical(30);
        juan.makeVisible();
        juan.slowMoveHorizontal(100);
        
        maria = new Person();
        maria.moveHorizontal(250);
        maria.moveVertical(30);
        maria.makeVisible();
        maria.slowMoveHorizontal(-150);
        
        
    }
}