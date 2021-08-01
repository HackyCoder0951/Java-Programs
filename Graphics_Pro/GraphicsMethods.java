/*<html>
<body>
<applet code=GraphicsMethods.class width=700 height=200>
</applet>
</body>
</html>*/
import java.awt.*;
import java.applet.*;
public class GraphicsMethods extends Applet {
	String s = new String();
	String s1 = new String();
	String s2 = new String();
	Font f1 = new Font("\nCourier New\n",Font.BOLD, 20);
	public void paint(Graphics GA) {
		GA.setFont(f1);
		GA.setColor(Color.blue);
		GA.drawString("Illustration of Methods of Grpahics Class",200,520);
		Font f2 = GA.getFont();
		s = f2.toString();
		GA.drawString(s,5,540);
		GA.setColor(Color.green);
		Color  col = GA.getColor();
		s2 = col.toString();
		GA.drawString(s2,5,560);
		GA.fillRect(500,15,70,90);
		GA.drawRect(160,5,60,60);
		GA.drawOval(10,120,155,95);
		GA.setColor(Color.yellow);
		GA.fillOval(700,140,50,150);
		GA.setColor(Color.black);
		GA.drawLine(380,100,200,180);
		GA.drawArc(400,150,180,280,90,70);
		int x2[] = {200,120,280,240};
		int z2 = 4, y2[] = {260,370,370,270};
		GA.setColor(Color.blue);
		GA.fillPolygon(x2,y2,z2);
		GA.setColor(Color.red);
		GA.drawRect(15,15,30,50);
		FontMetrics f3 = GA.getFontMetrics();
		s1 = f3.toString();
		GA.drawString(s1,5,580);
		GA.setColor(Color.magenta);
		GA.fillRoundRect(510,400,90,80,20,20);
	}
}