import java.awt.*;
import java.applet.*;

// <applet code="LineRect.class" width="300" height="300">  </applet>

public class LineRect extends Applet {
	public void paint(Graphics g) {
		g.drawLine(30, 180, 200, 180);
		g.drawRect(30, 40, 80, 80);
		g.drawRoundRect(120, 40, 100, 50, 30, 20);
		g.fillRect(40, 50, 60, 60);
		g.fillRoundRect(130, 50, 80, 30, 30, 20);
	}
}