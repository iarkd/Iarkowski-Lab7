import java.awt.*;
import java.applet.*;

public class Platform extends Applet{
    public void paint(Graphics g){
        Platform(g);
    }
       
    //Draw the Platform
    public static void Platform(Graphics g){
        Expo.setColor(g,Expo.blue);
        Expo.fillRectangle(g,100,650,900,750);
    }
}