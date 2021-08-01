import java.awt.*;
import java.applet.*;


// <applet code="Graph.class" width="300" height="300">  </applet>

public class Graph extends Applet {
    int x[] = {0, 60, 120, 180, 240, 300, 360, 420};
    int y[] = {400, 280, 220, 140, 60, 60, 100, 220};
    int z = x.length;
    public void paint(Graphics g)
    {
        g.drawPolygon(x,y,z);
    }
}
