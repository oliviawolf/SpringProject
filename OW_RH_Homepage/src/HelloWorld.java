
//AWT graphic classes
import java.awt.Graphics;

//Swing classes
import javax.swing.JApplet;

/**
 * Create an applet that prints out "Hello World". Using this as a test.
 *
 * @author Rani Hinnawi
 *
 */
public class HelloWorld extends JApplet {

    @Override
    public void paint(Graphics g) {
        g.drawString("Hello World", 95, 110); //(String, x pos, y pos)
    }
}
