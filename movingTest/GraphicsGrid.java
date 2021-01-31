import java.awt.*;
import java.awt.Color;
import java.awt.geom.*;

public class GraphicsGrid {
    private int gridSize = 50;
    private int xBorder  = 40;
    private int yBorder  = 40;
    private int smallDotSize = 3;

    public GraphicsGrid() {}

    public void drawGrid( Graphics gs, int width, int height ) {

        AffineTransform at = new AffineTransform();
        at.translate(  xBorder, height - yBorder );
        at.scale( 1, -1);

        Graphics2D g2D = (Graphics2D) gs;
        g2D.setTransform (at);

        int iHorizontalDistance = width  - 2*xBorder;
        int iVerticalDistance   = height - 2*yBorder;

        Ellipse2D dot = new Ellipse2D.Double( 0, 0, (int) 5, (int) 5 );

        for (int i = 0; i <=  iHorizontalDistance; i = i + gridSize )
            for (int j = 0; j <=  iVerticalDistance; j = j + gridSize ) {

                if ( i == 0 || j == 0 )
                    g2D.setColor( Color.red );
                else
                    g2D.setColor( Color.blue );

                g2D.translate(  i, j );
                g2D.scale(  (double) 1.0, (double) -1.0 );
                g2D.fill( dot );
                g2D.scale(  (double) 1.0, (double) -1.0 );
                g2D.translate( -i,-j );
            }
    }
}
