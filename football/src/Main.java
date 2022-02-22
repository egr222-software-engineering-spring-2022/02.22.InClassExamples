import java.awt.*;

public class Main {

    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(250,250);
        Graphics g = panel.getGraphics();

        int x1 = 10;
        int y1 = 30;
        int x2 = 210;
        int y2 = 230;

        g.drawLine(x1,y1,x2, y1);   // draw top of box
        g.drawLine(x1,y1,x1,y2);    // draw left side of box
        g.drawLine(x2,y1,x2,y2);    // draw right side of box
        g.drawLine(x1,y2,x2,y2);    // draw bottom of box

        // there are 20 spaces of 10 pixels each along each side
        for (int i=1; i<=20; i++) {
            g.drawLine(x1,y2-i*10,x1+i*10,y1);
            g.drawLine(i*10+x1,y2,x2,y2-i*10);
        }
    }
}
