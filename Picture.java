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

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
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

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-80);
        sun.changeSize(80);
        sun.makeVisible();
        
        moon = new Circle();
        moon.changeColor("magenta");
        moon.makeVisible();
        moon.moveHorizontal(-130);
        moon.moveVertical(-10);
        moon.changeSize(40);
        moon.makeInvisible();
        
        ground = new Square();
        ground.moveVertical(110);
        ground.moveHorizontal(-340);
        ground.changeColor("green");
        ground.changeSize(800);  
        ground.makeVisible();  
        
        moveSunset();
        amanecer();
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
    
    public void moveSunset() {
        
        for (int i = 0; i < 80; i++) {  
            sun.slowMoveVertical(2); 
        }
        
        sun.makeInvisible();
        moon.makeVisible();
        Canvas.getCanvas().wait(2000);
    } 
    
    public void amanecer() {
        moon.makeInvisible();
        sun.makeVisible();
        for (int i = 0; i < 90; i++) {
            sun.slowMoveVertical(-2);
        }
        
    }
}