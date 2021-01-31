import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class SimpleScreen extends JPanel {
    GraphicsGrid      grid;
    GraphicsOperation grop;
    private Dimension size;
    private Graphics    gs;
    int width, height;
    boolean DEBUG =   true;

    SimpleScreen () {
        grid = new GraphicsGrid();
        grop = new GraphicsOperation();
    }

    public void paint() {
        Graphics g = getGraphics();
        super.paintComponent(g);
        paintComponent(g);
    }

    public void update(Graphics g) {}

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension d = getSize();
        size   = getSize();
        height = getSize().height;
        width  = getSize().width;

        if ( grop.getGrid() == true ) {
            gs = getGraphics();
            grid.drawGrid( gs, getWidth(), getHeight() );
        }
    }

    public void clearScreen () {
        gs = getGraphics();
        Graphics2D g2D = (Graphics2D) gs;

        g2D.setColor( Color.white );
        g2D.fillRect( 0, 0, size.width-1, size.height-1 );
    }

    void drawGrid() {
        grop.setGrid(true);
        gs = getGraphics();
        grid.drawGrid( gs, getWidth(), getHeight() );
    }
}
