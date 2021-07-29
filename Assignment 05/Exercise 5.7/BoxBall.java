import java.awt.*;
import java.awt.geom.*;
import java.awt.Point;
import java.util.Random;

public class BoxBall
{
    private static final int GRAVITY = 3;  // effect of gravity
    private static final int MAX_SPEED = 7;
    private static final int MAX_DIAMETER = 30;

    private int ballDegradation = 2;
    private Ellipse2D.Double circle;
    private Color color;
    private int diameter;
    private int xPosition;
    private int yPosition;
    private final Dimension boxLimits;
    private final Point boxLocation;
    private final int groundPosition;
    private final int leftWall;
    private final int rightWall;
    private Canvas canvas;
    private int ySpeed;                // initial downward speed
    private int xDirection;
    private int hits = 0;
    private final int speed;
    private Boolean finished = false;

    /**
     * Constructor for objects of class BoxBall
     *
     * @param box            the box where the ball will bounce
     * @param drawingCanvas  the canvas to draw this ball on
     */
    public BoxBall(Rectangle box, Canvas drawingCanvas)
    {
        Random generator = new Random();
        
        this.boxLocation = box.getLocation();
        this.boxLimits = box.getSize();
        
        diameter = generator.nextInt(MAX_DIAMETER - 10) + 10;
        
        xPosition = (int)boxLocation.x + 20 + diameter;
        yPosition = (int)boxLocation.y;
        
        color = new Color(generator.nextInt(240), generator.nextInt(240), generator.nextInt(240));
        
        groundPosition = yPosition + this.boxLimits.height;
        leftWall = (int)boxLocation.x + diameter;
        rightWall = (int)boxLocation.x + this.boxLimits.width;
        
        canvas = drawingCanvas;
        
        ySpeed = generator.nextInt(4) + 1;
        speed = generator.nextInt(MAX_SPEED - 1) + 1;
        xPosition = generator.nextInt(rightWall - xPosition - 20) + xPosition;
        
        if(generator.nextInt(4) % 2 == 0) {
            xDirection = 1;
        }
        else {
            xDirection = -1;
        }
    }

    /**
     * Draw this ball at its current position onto the canvas.
     **/
    public void draw()
    {
        canvas.setForegroundColor(color);
        canvas.fillCircle(xPosition, yPosition, diameter);
    }

    /**
     * Erase this ball at its current position.
     **/
    public void erase()
    {
        canvas.eraseCircle(xPosition, yPosition, diameter);
    }    

    /**
     * Move this ball according to its position and speed and redraw.
     **/
    public void move()
    {
        // remove from canvas at the current position
        erase();
            
        // compute new position
        ySpeed += GRAVITY;
        yPosition += ySpeed;
        
        if(xPosition + (xDirection * speed) <= (leftWall - diameter) || xPosition +  (xDirection * speed) >= (rightWall - diameter)){
            xDirection *= -1;
            hits++;
        }
        xPosition += xDirection * speed;

        // check if it has hit the ground
        if(yPosition >= (groundPosition - diameter) && ySpeed > 0) {
            yPosition = (int)(groundPosition - diameter);
            ySpeed = -ySpeed + ballDegradation; 
            
            if(hits == 4) {
                erase(); finished = true;
            }
        }
        
        if(!finished) {
            draw();
        }
        
    }    

    /**
     * Return the horizontal position of this ball
     */
    public int getXPosition()
    {
        return xPosition;
    }

    /**
     * Return the vertical position of this ball
     */
    public int getYPosition()
    {
        return yPosition;
    }
    
    /**
     * Return if the ball stopped jumping
     */
    public Boolean getFinished(){
        return finished;
    }
}