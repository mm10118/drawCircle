import java.awt.*;

public class Rect {
    private int rad; // Fields
    private int h;// private Point pos;
    private int w;
    private Point pos;
    private Color col;
    public Rect(Point initPos,Color col, int h, int w){ // The constructor
        // Initialize fields
        pos=initPos;
        this.h = h;
        this.w = w;
        this.col=col;


    }
    public void draw(Graphics g) { // A method that draws the object in g

        g.fillRect(pos.x, pos.y,30,10);
    }
}
