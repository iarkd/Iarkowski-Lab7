import java.awt.*;
import java.applet.*;

public class Background extends Applet{
    public void paint(Graphics g){
        Expo.setBackground(g,Expo.black);
        FDSky(g);
    }
    
    //Draw the Sky
    public static void FDSky(Graphics g){
        Expo.setBackground(g,Expo.black);
        for (int count = 1; count <= 50; count++){
            Expo.setRandomColor(g);
            int x = Expo.random(5,1000);
            int y = Expo.random(5,650);
            int rad = 15;
            int points = Expo.random(5,10);
            Expo.fillStar(g,x,y,rad,points);
        }
    }
       
}

